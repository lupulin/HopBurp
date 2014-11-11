package models;

import javax.persistence.*;
import play.db.ebean.*;
import com.avaje.ebean.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.*;

import utils.*;

@Entity
public class User extends Model {

  @Id
  public String email;

  public UUID publicId;

  @JsonIgnore
  public String password;

  public String firstname;

  public String lastname;

  @OneToMany(cascade=CascadeType.ALL, mappedBy="user")
  public List<Member> memberOf = new ArrayList<Member>();

  @Column(columnDefinition = "TEXT")
  public String profile;

  public String location;

  public String website;

  public String title;

  public Boolean updates;

  public Boolean reminders;

  public Boolean active;

  public String rank;

  @JsonIgnore
  public UUID emailVerify;

  public Boolean notifications;

  public Integer awardsCount;

  public Integer recipeCount;

  public String getFullname() {
    return firstname + " " + lastname;
  }

  public String searchdata;

  public Integer getUnreadMessages() {
    Integer unread = 0;
    for (MessageStream messageStream : messageStreams) {
      if (messageStream.unread)
        unread++;
    }
    return unread;
  }

  @JsonIgnore
  @OneToMany(cascade=CascadeType.ALL, mappedBy="user")
  public List<Recipe> recipes = new ArrayList<Recipe>();

  @OneToMany(cascade=CascadeType.ALL, mappedBy="current")
  public List<Friendship> following = new ArrayList<Friendship>();

  @OneToMany(cascade=CascadeType.ALL, mappedBy="user")
  public List<MessageStream> messageStreams = new ArrayList<MessageStream>();

  public User(String firstname, String lastname, String email, String password) {
    this.firstname = firstname;
    this.lastname = lastname;
    this.email = email;
    this.password = password;
    this.active = false;
    this.emailVerify = UUID.randomUUID();
    this.awardsCount = 0;
    this.recipeCount = 0;
    this.publicId = UUID.randomUUID();
    this.rank = "Novice";
    this.searchdata = this.firstname + this.lastname + this.email;
  }

  public static void saveProfile(String email,
                                 String profile,
                                 String location,
                                 String website,
                                 String title,
                                 Boolean updates,
                                 Boolean notifications,
                                 Boolean reminders) {
    User user = find.byId(email);
    user.profile = profile;
    user.location = location;
    user.website = website;
    user.title = title;
    user.updates = updates;
    user.notifications = notifications;
    user.reminders = reminders;
    user.update();
  }

  public static String authenticate(String email, String password) {
    String error = "";
    User user = find.where().eq("email", email).eq("password", password).findUnique();
    if (user == null) {
      error = "Invalid user email or password";
    } else if (user.active == false) {
      // send email to verify email
      error = "User has not been activated yet. Please check your inbox to activate your account.";
    }
    return error;
  }

  public static Recipe addRecipe(String name, String beerStyle, String link, String userEmail) {
    User user = find.where().eq("email", userEmail).findUnique();
    Recipe recipe = Recipe.create(name, beerStyle, link, user);
    user.recipes.add(recipe);
    user.recipeCount++;
    user.save();
    return recipe;
  }

  public static void create(String firstname, String lastname, String email, String password) {
    User newUser = new User(firstname, lastname, email, password);
    newUser.save();
    VerifyEmail verifyEmail = new VerifyEmail(newUser);
    verifyEmail.sendEmail();
  }

  public static List<User> search(String search, int pageSize) {
    List<User> users = User.find.where()
                           .ilike("searchdata", "%"+search+"%")
                           .orderBy("lastname asc")
                           .findPagingList(pageSize)
                           .getPage(0)
                           .getList();
    return users;
  }


  public static Finder<String,User> find = new Finder<String,User>(
  String.class, User.class
  );
}
