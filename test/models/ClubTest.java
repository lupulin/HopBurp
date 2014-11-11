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

public class ClubTest extends WithApplication {

    @Before
    public void setUp() {
        start(fakeApplication(inMemoryDatabase(), fakeGlobal()));
        Ebean.save((List) Yaml.load("user-data.yml"));
    }

    @Test
    public void createClub_Successful() {
      User admin = User.find.where().eq("email", "toph@toph.com").findUnique();
      Club sodz = new Club(admin, "Scioto, Olentangy, Derby Zymurgists", "SODZ");
      sodz.save();

      Club getSodz = Club.find.where().eq("abbreviatedName", "SODZ").findUnique();
      assertThat(getSodz).isNotNull();
      assertThat(getSodz.admin.user.email).isEqualTo("toph@toph.com");
      assertThat(getSodz.members.size()).isEqualTo(1);
      assertThat(getSodz.members.get(0).user.email).isEqualTo("toph@toph.com");
    }

    @Test
    public void addMemberToClub_Successful() {
      User member = User.find.where().eq("email", "toph@hopburp.com").findUnique();
      User admin = User.find.where().eq("email", "toph@toph.com").findUnique();
      Club sodz = new Club(admin, "Scioto, Olentangy, Derby Zymurgists", "SODZ");
      sodz.save();

      sodz.addMember(member);

      assertThat(sodz.members.size()).isEqualTo(2);
    }

    @Test
    public void handOffClubAdminToDifferentMember_Successful() {
      User member = User.find.where().eq("email", "toph@hopburp.com").findUnique();
      User admin = User.find.where().eq("email", "toph@toph.com").findUnique();
      Club sodz = new Club(admin, "Scioto, Olentangy, Derby Zymurgists", "SODZ");
      sodz.save();

      sodz.addMember(member);

      assertThat(sodz.admin.user.email).isEqualTo("toph@toph.com");

      sodz.handOffAdmin(member);

      assertThat(sodz.admin.user.email).isEqualTo("toph@hopburp.com");
      assertThat(sodz.members.size()).isEqualTo(2);
    }

    @Test
    public void determineIfUserPaidDues() {
      User member = User.find.where().eq("email", "toph@hopburp.com").findUnique();
      User admin = User.find.where().eq("email", "toph@toph.com").findUnique();
      User lifeMember = User.find.where().eq("email", "bob@bob.com").findUnique();
      Club sodz = new Club(admin, "Scioto, Olentangy, Derby Zymurgists", "SODZ");
      sodz.save();
      sodz.addMember(member);
      sodz.addMember(lifeMember);

      sodz.addLifeMember(lifeMember.email);
      sodz.findMember(member.email).payDues();

      assertThat(sodz.findMember("toph@hopburp.com")).isNotNull();

      assertThat(sodz.duesPaid("toph@hopburp.com")).isEqualTo(true); // paid dues
      assertThat(sodz.duesPaid("bob@bob.com")).isEqualTo(true);      // lifemember
      assertThat(sodz.duesPaid("toph@toph.com")).isEqualTo(false);   // haven't paid dues
    }

}
