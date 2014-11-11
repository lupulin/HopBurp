package models;

import javax.persistence.*;
import play.db.ebean.*;
import com.avaje.ebean.*;
import java.util.*;
import java.util.UUID;

@Entity
public class Member extends Model {

  @Id
  public Long id;

  @ManyToOne
  public User user;

  public Boolean lifeMember;

  public Boolean goodStanding;

  public Date memberSince;

  public Date memberTill;

  public Boolean active;

  @OneToMany(cascade=CascadeType.ALL, mappedBy="member")
  public List<DueOrder> orders = new ArrayList<DueOrder>();

  public Member(User user) {
    this.user = user;
    this.lifeMember = false;
    this.goodStanding = false;
    this.memberSince = new Date();
    this.memberTill = null;
    this.active = true;
  }

  public void payDues() {
    this.goodStanding = true;
    this.save();
  }

  // used for queries.
  public static Finder<Long,Member> find = new Finder<Long,Member>(
    Long.class, Member.class
  );
}
