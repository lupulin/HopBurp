package models;

import javax.persistence.*;
import play.db.ebean.*;
import com.avaje.ebean.*;
import java.util.*;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Comment extends Model {

  @Id
  public Long id;

  public Date created;

  @Column(columnDefinition = "TEXT")
  public String comment;

  @ManyToOne
  public User user;

  @JsonIgnore
  @ManyToOne
  public Recipe recipe;

  public Comment(String comment, User user, Recipe recipe) {
    this.comment = comment;
    this.user = user;
    this.recipe = recipe;
    this.created = new Date();
  }

  // used for queries.
  public static Finder<Long,Comment> find = new Finder<Long,Comment>(
    Long.class, Comment.class
  );
}
