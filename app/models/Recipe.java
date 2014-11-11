package models;

import javax.persistence.*;
import play.db.ebean.*;
import com.avaje.ebean.*;
import java.util.*;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Recipe extends Model {

  @Id
  public Long id;

  public UUID publicId;

  @Column(unique = true)
  public String name;

  public String style;

  // link to recipe -- service to determine it's a brewtoad or beersmith link.
  // anything else should be invalid.
  public String link;

  @JsonIgnore
  @ManyToOne
  public User user;

  public UUID getUserPublicId() {
    return user.publicId;
  }

  public Award getTopAward() {
    if (this.awards.size() == 0) return null;
    Award topAward = this.awards.get(0);
    for (Award top : this.awards) {
      if (top.awardType.id < topAward.awardType.id) {
        topAward = top;
      }
    }
    System.out.println(topAward.id);
    return topAward;
  }

  @OneToMany(cascade=CascadeType.ALL, mappedBy="recipe")
  public List<Award> awards = new ArrayList<Award>();

  @OneToMany(cascade=CascadeType.ALL, mappedBy="recipe")
  public List<Note> notes = new ArrayList<Note>();

  @OneToMany(cascade=CascadeType.ALL, mappedBy="recipe")
  public List<Comment> comments = new ArrayList<Comment>();

  public Recipe(String name, String style, String link, User user) {
    this.name = name;
    this.style = style;
    this.link = link;
    this.user = user;
    this.publicId = UUID.randomUUID();
  }

  public static Recipe create(String name, String style, String link, User user) {
    Recipe recipe = new Recipe(name, style, link, user);
    recipe.save();
    return recipe;
  }

  public static Note newNote(Integer score, String criticism, Recipe recipe) {
    Note note = new Note(score, criticism, recipe);
    note.save();
    return note;
  }

  public Integer getStarRanking() {
    Integer averageScore = 0, scores = 0;
    for (Note note : this.notes) {
      scores += note.score;
    }
    if (this.notes.size() == 0) {
      averageScore = 0;
      return 0;
    } else {
      averageScore = scores / this.notes.size(); // 0 - 50
    }
    int mod = averageScore % 10;
    if (mod == 0) {
      return (averageScore + ((averageScore % 10))) / 10;
    }
    return (averageScore + (10 - (averageScore % 10))) / 10;
  }

  // used for queries.
  public static Finder<Long,Recipe> find = new Finder<Long,Recipe>(
    Long.class, Recipe.class
  );
}
