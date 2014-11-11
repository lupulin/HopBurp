package controllers;

import models.*;
import play.*;
import play.mvc.*;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import com.fasterxml.jackson.databind.JsonNode;
import play.mvc.BodyParser;
import play.libs.Json;
import views.html.*;
import java.sql.*;
import java.util.*;
import com.fasterxml.jackson.databind.node.ObjectNode;

import com.typesafe.plugin.*;

@Security.Authenticated(Secured.class)
public class UserService extends Controller {

    /**
     * GET /
     */
    public static Result getUser() {
      String loggedEmail = session().get("email");
      User user = User.find.where().eq("email", loggedEmail).findUnique();
      JsonNode json = Json.toJson(user);
      return ok(json);
    }

    public static Result getUserById(String publicId) {
      User user = User.find.where().eq("publicId", publicId).findUnique();
      JsonNode json = Json.toJson(user);
      return ok(json);
    }

    /**
     * GET /
     */
    public static Result getUserMembers() {
      String loggedEmail = session().get("email");
      User user = User.find.where().eq("email", loggedEmail).findUnique();
      List<Member> members = Member.find.where().eq("user", user).findList();
      JsonNode json = Json.toJson(members);
      return ok(json);
    }

    public static Result getUserRecipes() {
      String loggedEmail = session().get("email");
      User user = User.find.where().eq("email", loggedEmail).findUnique();
      JsonNode json = Json.toJson(user.recipes);
      return ok(json);
    }

    public static Result getRecipeById(String publicId) {
      Recipe recipe = Recipe.find.where().eq("publicId", publicId).findUnique();
      JsonNode json = Json.toJson(recipe);
      return ok(json);
    }

    public static Result getFriendRecipes(String publicId) {
      User user = User.find.where().eq("publicId", publicId).findUnique();
      JsonNode recipes = Json.toJson(user.recipes);
      return ok(recipes);
    }

    public static Result searchUsers(String search) {
      int results = 10;
      JsonNode json = Json.toJson(User.search(search, results));
      return ok(json);
    }

    @BodyParser.Of(BodyParser.Json.class)
    public static Result newRecipe() throws IOException {
      String loggedEmail = session().get("email");
      ObjectMapper mapper = new ObjectMapper();
      JsonNode json = request().body().asJson();
      Recipe beerRecipe = mapper.readValue(Json.stringify(json), Recipe.class);
      Recipe recipe = User.addRecipe(beerRecipe.name, beerRecipe.style, beerRecipe.link, loggedEmail);
      return ok(Json.toJson(recipe));
    }

    @BodyParser.Of(BodyParser.Json.class)
    public static Result newRecipeScore(String publicId) throws IOException {
      JsonNode json = request().body().asJson();
      if(json == null) {
        return badRequest("Not valid JSON");
      } else {
        Integer score = json.findPath("score").asInt();
        String criticism = json.findPath("criticism").textValue();
        Long awarded = json.findPath("awarded").asLong();
        String eventname = json.findPath("eventname").textValue();
        Recipe recipe = Recipe.find.where().eq("publicId", publicId).findUnique();
        Note newNote = Recipe.newNote(score, criticism, recipe);
        Award newAward = null;
        if (awarded != 0) {
          AwardType awardType = AwardType.find.byId(awarded);
          newAward = new Award(awardType, eventname, recipe);
          newAward.save();
          recipe.awards.add(newAward);
          recipe.save();
        }
        ObjectNode result = Json.newObject();
        result.put("award", Json.toJson(newAward));
        result.put("note", Json.toJson(newNote));
        return ok(result);
      }
    }

    @BodyParser.Of(BodyParser.Json.class)
    public static Result newRecipeComment(String publicId) throws IOException {
      ObjectMapper mapper = new ObjectMapper();
      JsonNode json = request().body().asJson();
      Comment comment = mapper.readValue(Json.stringify(json), Comment.class);
      Recipe recipe = Recipe.find.where().eq("publicId", publicId).findUnique();
      User user = User.find.where().eq("email", session().get("email")).findUnique();
      Comment newComment = new Comment(comment.comment, user, recipe);
      newComment.save();
      return ok(Json.toJson(newComment));
    }

    @BodyParser.Of(BodyParser.Json.class)
    public static Result makeFriend(String publicId) throws IOException {
      String loggedEmail = session().get("email");
      ObjectMapper mapper = new ObjectMapper();
      JsonNode json = request().body().asJson();
      User current = User.find.where().eq("email", loggedEmail).findUnique();
      try {
        User friend = User.find.where().eq("publicId", publicId).findUnique();
        Friendship friends = Friendship.createFriendship(current, friend);
        return ok(Json.toJson(friends));
      } catch (Exception ex) {
        return badRequest(ex.toString());
      }
    }
}
