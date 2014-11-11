package models;

import javax.persistence.*;
import play.db.ebean.*;
import com.avaje.ebean.*;
import java.util.*;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Event extends Model {

  @Id
  public Long id;

  public String name;

  public Date startDate;

  public Date endDate;

  @JsonIgnore
  @ManyToOne
  public Club club;

  public Boolean recurring;

  public Boolean competition;

  public Event(String name) {
    this.name = name;
  }

  // used for queries.
  public static Finder<Long,Event> find = new Finder<Long,Event>(
    Long.class, Event.class
  );
}
