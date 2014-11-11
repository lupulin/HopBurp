package models;

import javax.persistence.*;
import play.db.ebean.*;
import com.avaje.ebean.*;
import java.util.*;
import java.util.UUID;

@Entity
public class Club extends Model {

  @Id
  public Long id;

  public String fullname;
  public String abbreviatedName;

  public String city;
  public String state;

  // dues and duesPerYear determine price of membership per year.
  public Double dues;
  public Integer duesPerYear;

  public Integer awardsCount;

  public Integer recipeCount;

  public Integer memberCount;

  @OneToMany(cascade=CascadeType.ALL, mappedBy="club")
  public List<Event> events = new ArrayList<Event>();

  @ManyToMany(cascade = CascadeType.REMOVE)
  public List<Member> members = new ArrayList<Member>();

  public Club(String fullname, String abbreviatedName) {
    this.dues = 0.0;
    this.duesPerYear = 1;
    this.fullname = fullname;
    this.abbreviatedName = abbreviatedName;
  }

  public Member findMember(String email) {
    for (Member member : members) {
      if (member.user.email.equals(email)) {
        return member;
      }
    }
    return null;
  }

  public boolean duesPaid(String email) {
    Member member = findMember(email);
    if (member.lifeMember || member.goodStanding)
      return true;
    else
      return false;
  }

  public void addLifeMember(Member member) {
    member.lifeMember = true;
    member.save();
  }

  public void addLifeMember(String memberEmail) {
    Member member = findMember(memberEmail);
    member.lifeMember = true;
    member.save();
  }

  /*
   * Add member to club
   */
  public void addMember(User member) {
    Member newMember = new Member(member);
    newMember.save();
    this.members.add(newMember);
    this.save();
  }

  /*
   * Hand off admin privileges to a new user.
   */
  // public void handOffAdmin(User newAdmin, User oldAdmin) {
  //   Member newAdmin = this.findMember(newAdmin.email);
  //   Member oldAdmin = this.findMember(oldAdmin.email);
  //   this.admin = newAdmin;
  //   this.save();
  // }

  // used for queries.
  public static Finder<Long,Club> find = new Finder<Long,Club>(
    Long.class, Club.class
  );
}
