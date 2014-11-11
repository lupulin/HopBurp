import models.*;
import org.junit.*;
import static org.junit.Assert.*;
import play.test.WithApplication;
import static play.test.Helpers.*;
import static org.fest.assertions.Assertions.*;
import play.mvc.*;
import play.libs.*;
import play.test.*;
import play.libs.Yaml;
import com.avaje.ebean.Ebean;
import java.util.*;
import com.google.common.collect.ImmutableMap;
import com.fasterxml.jackson.databind.JsonNode;

import static play.test.Helpers.*;
import static org.fest.assertions.Assertions.*;

public class ApplicationTest extends WithApplication {

  @Before
  public void setUp() {
    start(fakeApplication(inMemoryDatabase(), fakeGlobal()));
    Ebean.save((List) Yaml.load("user-data.yml"));
  }

  // @Test
  // public void renderIndexRequest_Ok() {
  //   Result result = routeAndCall(fakeRequest(GET, "/"));
  //   assertThat(status(result)).isEqualTo(OK);
  // }

  @Test
  public void renderClubRequest_Ok() {
    Result result = routeAndCall(fakeRequest(GET, "/club/settings"));
    assertThat(status(result)).isEqualTo(OK);
  }

  @Test
  public void renderProfileRequest_Ok() {
    Result result = routeAndCall(fakeRequest(GET, "/profile/settings"));
    assertThat(status(result)).isEqualTo(OK);
  }

  @Test
  public void renderAdminRequest_Ok() {
    Result result = routeAndCall(fakeRequest(GET, "/admin"));
    assertThat(status(result)).isEqualTo(OK);
  }

  // @Test
  // public void renderUpdateProfileRequest_Ok() {
  //   User toph = User.find.where().eq("email", "toph@hopburp.com").findUnique();
  //   assertNull(toph.profile);
  //   assertNull(toph.location);
  //   assertNull(toph.website);
  //   assertNull(toph.title);
  //   assertNull(toph.updates);
  //   assertNull(toph.notifications);
  //   assertNull(toph.reminders);
  //
  //   Map map = new HashMap();
  //   map.put("firstname", toph.firstname);
  //   map.put("lastname", toph.lastname);
  //   map.put("username", toph.username);
  //   map.put("email", toph.email);
  //   map.put("password", toph.password);
  //   map.put("profile", "This is my profile, hope you like it!");
  //   map.put("location", "Columbus, OH");
  //   map.put("website", "hopburp.com");
  //   map.put("title", "Web App Developer, Homebrewer");
  //   map.put("updates", true);
  //   map.put("notifications", true);
  //   map.put("reminders", true);
  //   JsonNode profileJson = Json.toJson(map);
  //
  //   Result result = routeAndCall(fakeRequest(POST, "/profile/edit").withJsonBody(profileJson, "POST"));
  //   assertThat(status(result)).isEqualTo(OK);
  //
  //   toph = User.find.where().eq("email", "toph@hopburp.com").findUnique();
  //
  //   assertThat(toph.profile).isEqualTo("This is my profile, hope you like it!");
  //   assertThat(toph.location).isEqualTo("Columbus, OH");
  //   assertThat(toph.website).isEqualTo("hopburp.com");
  //   assertThat(toph.title).isEqualTo("Web App Developer, Homebrewer");
  //   assertThat(toph.updates).isEqualTo(true);
  //   assertThat(toph.notifications).isEqualTo(true);
  //   assertThat(toph.reminders).isEqualTo(true);
  // }

  // @Test
  // public void sendTestEmail() {
  //     MailerAPI mail = play.Play.application().plugin(MailerPlugin.class).email();
  //     mail.setSubject("HopBurp is changing");
  //     mail.setRecipient("Chris Bartos <topher.bartos@gmail.com>");
  //     mail.setFrom("HopBurp <toph@hopburp.com>");
  //     mail.sendHtml(views.html.email.render().toString());

  // }
}
