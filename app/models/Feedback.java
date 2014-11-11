package models;

import javax.persistence.*;
import play.db.ebean.*;
import com.avaje.ebean.*;
import java.util.*;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Feedback extends Model {

  @Id
  public Long id;

  public String name;

  public String email;

  @Column(columnDefinition = "TEXT")
  public String message;

  public String location;

  public Feedback(String name, String email, String message, String location) {
      this.name = name;
      this.email = email;
      this.message = message;
      this.location = location;
  }

  public static void save(String name, String email, String message, String location) {
    Feedback feedback = new Feedback(name, email, message, location);
    feedback.save();
  }

  // used for queries.
  public static Finder<Long,Feedback> find = new Finder<Long,Feedback>(
    Long.class, Feedback.class
  );
}
