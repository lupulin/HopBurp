package models;

import javax.persistence.*;
import play.db.ebean.*;
import com.avaje.ebean.*;
import java.util.*;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class AwardType extends Model {

  @Id
  public Long id;

  public String type;

  // used for queries.
  public static Finder<Long,AwardType> find = new Finder<Long,AwardType>(
    Long.class, AwardType.class
  );
}
