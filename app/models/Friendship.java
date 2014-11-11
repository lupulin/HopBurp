package models;

import javax.persistence.*;
import play.db.ebean.*;
import com.avaje.ebean.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.*;

@Entity
public class Friendship extends Model {

  @Id
  public Long id;

  @JsonIgnore
  @ManyToOne
  public User current;

  @JsonIgnore
  @ManyToOne
  public User friend;

  public String getFriendPublicId() {
    return friend.publicId.toString();
  }

  public String getFriendFullname() {
    return friend.getFullname();
  }

  public Friendship(User current, User friend) {
    this.current = current;
    this.friend = friend;
  }

  public static Friendship createFriendship(User current, User friend) throws Exception {
    boolean weAreFriends = false;
    for (Friendship currentFriend : current.following) {
      if (friend.publicId.equals(currentFriend.friend.publicId)) {
        weAreFriends = true;
      }
    }
    if (weAreFriends) {
      throw new Exception("We are already friends!");
    }
    Friendship friendship = new Friendship(current, friend);
    friendship.save();
    return friendship;
  }

  public static List<Friendship> getUserFriends(User current) {
    List<Friendship> friends = Friendship.find.where().eq("current", current).findList();
    return friends;
  }

  public static Finder<Long,Friendship> find = new Finder<Long,Friendship>(
  Long.class, Friendship.class
  );
}
