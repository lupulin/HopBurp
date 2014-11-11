package models;

import javax.persistence.*;
import play.db.ebean.*;
import com.avaje.ebean.*;
import java.util.*;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Award extends Model {

  @Id
  public Long id;

  @JsonIgnore
  @ManyToOne
  public Recipe recipe;

  public String eventname;

  @OneToOne
  public AwardType awardType;

  public Award(AwardType awardType, String eventname, Recipe recipe) {
    this.awardType = awardType;
    this.eventname = eventname;
    this.recipe = recipe;
  }

  // used for queries.
  public static Finder<Long,Award> find = new Finder<Long,Award>(
    Long.class, Award.class
  );
}
