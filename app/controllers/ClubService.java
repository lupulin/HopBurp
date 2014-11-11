package controllers;

import models.*;
import play.*;
import play.mvc.*;
import com.fasterxml.jackson.databind.JsonNode;
import play.libs.Json;
import views.html.*;
import java.sql.*;

import com.typesafe.plugin.*;

public class ClubService extends Controller {

    /**
     * GET /
     */
    public static Result get(Long id) {
      Club club = Club.find.byId(id);
      if (club != null) {
        JsonNode json = Json.toJson(club);
        return ok(json);
      } else {
        return badRequest("Club not found");
      }
    }
}
