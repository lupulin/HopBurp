package models;

import javax.persistence.*;
import play.db.ebean.*;
import com.avaje.ebean.*;
import java.util.*;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class MessageStream extends Model {

  @Id
  public Long id;

  public UUID publicId;

  public Date updated;

  @JsonIgnore
  @ManyToOne
  public User user;

  @ManyToOne
  public User messagee;

  public Boolean unread;

  @OneToMany(cascade=CascadeType.ALL, mappedBy="messageStream")
  public List<Message> messages = new ArrayList<Message>();

  public MessageStream(User user, User messagee) {
    this.publicId = UUID.randomUUID();
    this.updated = new Date();
    this.unread = true;
    this.user = user;
    this.messagee = messagee;
  }

  public static Message createMessage(UUID publicId, String message, User messenger) {
    MessageStream messageStream = find.where().eq("publicId", publicId).findUnique();
    Message newMessage = new Message(message, messageStream, messenger);
    newMessage.save();
    messageStream.messages.add(newMessage);
    return newMessage;
  }

  // used for queries.
  public static Finder<Long,MessageStream> find = new Finder<Long,MessageStream>(
    Long.class, MessageStream.class
  );
}
