package models;

import javax.persistence.*;
import play.db.ebean.*;
import com.avaje.ebean.*;
import java.util.*;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Note extends Model {

  @Id
  public Long id;

  public Date created;

  @Column(columnDefinition = "TEXT")
  public String criticism;

  public Integer score;

  @JsonIgnore
  @ManyToOne
  public Recipe recipe;

  public Note(Integer score, String criticism, Recipe recipe) {
    this.score = score;
    this.criticism = criticism;
    this.recipe = recipe;
    this.created = new Date();
  }

  // used for queries.
  public static Finder<Long,Note> find = new Finder<Long,Note>(
    Long.class, Note.class
  );
}
