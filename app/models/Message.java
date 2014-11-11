package models;

import javax.persistence.*;
import play.db.ebean.*;
import com.avaje.ebean.*;
import java.util.*;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Message extends Model {

  @Id
  public Long id;

  public Date created;

  @Column(columnDefinition = "TEXT")
  public String message;

  @ManyToOne
  public MessageStream messageStream;

  @JsonIgnore
  @ManyToOne
  public User messenger;

  public String getMessenger() {
    return messenger.getFullname();
  }

  public Message(String message, MessageStream messageStream, User messenger) {
    this.created = new Date();
    this.messageStream = messageStream;
    this.message = message;
    this.messenger = messenger;
  }

  // used for queries.
  public static Finder<Long,Message> find = new Finder<Long,Message>(
    Long.class, Message.class
  );
}
