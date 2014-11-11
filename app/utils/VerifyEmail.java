package utils;

import models.*;

public class VerifyEmail extends Emailer {

  public VerifyEmail(User user) {
    super("Verify your email", user);
  }

  public void sendEmail() {
    String message = "";
    if (super.getDebug()) {
      message = views.html.email.verify_email.render("http://localhost:9000/register/verify/"+super.getUser().emailVerify.toString()).toString();
    } else {
      message = views.html.email.verify_email.render("https://www.hopburp.com/register/verify/"+super.getUser().emailVerify.toString()).toString();
    }
    super.sendEmail(message);
  }
}
