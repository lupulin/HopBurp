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

public class RealDataTest extends WithApplication {

  // @Before
  // public void setUp() {
  //   start(fakeApplication(inMemoryDatabase()));
  //   if (User.find.findRowCount() == 0) {
  //     Ebean.save((List) Yaml.load("user-data.yml"));
  //   }
  //   if (Club.find.findRowCount() == 0) {
  //     Ebean.save((List) Yaml.load("club-data.yml"));
  //   }
  // }

  // @Test
  // public void createEvent() {
  //   Club sodz = Club.find.where().eq("abbreviatedName", "SODZ").findUnique();
  //   Event newEvent = new Event("Beer for Boobs");
  //   newEvent.save();
  //   sodz.events.add(newEvent);
  //   sodz.save();
  // }

}
