package models;

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

import java.util.UUID;

import static play.test.Helpers.*;
import static org.fest.assertions.Assertions.*;

public class UserTest extends WithApplication {

    @Before
    public void setUp() {
        start(fakeApplication(inMemoryDatabase(), fakeGlobal()));
        Ebean.save((List) Yaml.load("user-data.yml"));
    }

    @Test
    public void userExistsInDatabase() {
        User bob = User.find.where()
                    .eq("email", "bob@bob.com")
                    .eq("password", "secret")
                    .findUnique();

        assertThat(bob).isNotNull();
        assertThat(bob.email).isEqualTo("bob@bob.com");
        assertThat(bob.password).isEqualTo("secret");
    }

    @Test
    public void tryAuthenticateUser() {
        assertThat(User.authenticate("bob@bob.com", "secret")).isEqualTo("User has not been activated yet. Please check your inbox to activate your account.");
        assertThat(User.authenticate("bob", "badpassword")).isNotEqualTo("");
        assertThat(User.authenticate("tom", "secret")).isNotEqualTo("");
    }

    @Test
    public void verifyEmailSetsUserStatusToActive() {
        User user = User.find.where().eq("email", "toph@hopburp.com").findUnique();
        user.emailVerify = UUID.fromString("b41e527d-3ee4-40f5-a31d-bb29cfe518d9");
        user.update();

        assertThat(user.active).isEqualTo(false);

        Result result = callAction(
            controllers.routes.ref.Application.verifyEmail("b41e527d-3ee4-40f5-a31d-bb29cfe518d9"),
            fakeRequest()
        );

        assertEquals(status(result), SEE_OTHER);

        user = User.find.where().eq("emailVerify", "b41e527d-3ee4-40f5-a31d-bb29cfe518d9").findUnique();
        assertNotNull(user);

        assertThat(user.active).isEqualTo(true);
    }

    @Test
    public void userHasProfile_toph() {
        User toph = User.find.where().eq("email", "toph@toph.com").findUnique();
        assertThat(toph.firstname).isEqualTo("Topher");
        assertThat(toph.lastname).isEqualTo("Bartos");
        assertThat(toph.email).isEqualTo("toph@toph.com");
        assertThat(toph.password).isEqualTo("secret");
        assertThat(toph.profile).isEqualTo("This is my profile!");
        assertThat(toph.location).isEqualTo("Columbus, OH");
        assertThat(toph.website).isEqualTo("www.hopburp.com");
        assertThat(toph.title).isEqualTo("Web App Developer, Homebrewer");
        assertThat(toph.updates).isEqualTo(true);
        assertThat(toph.reminders).isEqualTo(true);
        assertThat(toph.notifications).isEqualTo(true);
    }

}
