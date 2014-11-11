package models;

import javax.persistence.*;
import play.db.ebean.*;
import com.avaje.ebean.*;
import java.util.*;
import java.util.UUID;

@Entity
public class DueOrder extends Model {

  @Id
  public Long id;

  @ManyToOne
  public Member member;

  public DueOrder() {
  }

  public static Finder<Long,DueOrder> find = new Finder<Long,DueOrder>(
    Long.class, DueOrder.class
  );
}
