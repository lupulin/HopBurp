package utils;

import play.*;
import com.typesafe.plugin.*;
import models.*;

public class Emailer {

  private MailerAPI mail = play.Play.application().plugin(MailerPlugin.class).email();

  private String subject;
  protected User user;
  private String message;

  private static final String FROM_EMAIL = "HopBurp <toph@hopburp.com>";

  private Boolean debug = true;

  public void setDebug(Boolean debug) {
    this.debug = debug;
  }

  public Boolean getDebug() {
    return this.debug;
  }

  public Emailer(String subject, User user) {
    this.subject = subject;
    this.user = user;
  }

  public void sendEmail(String message) {
    mail.setSubject(this.subject);
    mail.setRecipient(this.user.firstname + " " + this.user.lastname + "<" + this.user.email + ">");
    mail.setFrom(FROM_EMAIL);
    mail.sendHtml(message);
  }

  protected User getUser() {
    return this.user;
  }
}
