package controllers;

import models.*;
import play.*;
import play.mvc.*;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import com.fasterxml.jackson.databind.JsonNode;
import play.mvc.BodyParser;
import play.libs.Json;
import views.html.*;
import java.sql.*;
import java.util.*;
import com.fasterxml.jackson.databind.node.ObjectNode;

import com.typesafe.plugin.*;

@Security.Authenticated(Secured.class)
public class StoreService extends Controller {

    /**
     * GET /
     */
    public static Result getStore() {
      List<Store> stores = Store.find.all();
      JsonNode json = Json.toJson(stores);
      return ok(json);
    }

}
