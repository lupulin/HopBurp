package utils;

import models.*;

public class WelcomeEmail extends Emailer {

  public WelcomeEmail(User user) {
    super("Welcome to HopBurp!", user);
  }

  public void sendEmail() {
    String message = "";
    if (super.getDebug()) {
      message = views.html.email.welcome.render("http://localhost:9000/login").toString();
    } else {
      message = views.html.email.welcome.render("https://www.hopburp.com/login").toString();
    }
    super.sendEmail(message);
  }
}
