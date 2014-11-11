package controllers;

import com.fasterxml.jackson.databind.JsonNode;
import java.sql.*;

import com.typesafe.plugin.*;

import play.*;
import play.mvc.*;
import play.data.*;
import static play.data.Form.*;

import utils.*;

import models.*;
import views.html.*;

public class Application extends Controller {

		public static class Login {
			public String email;
			public String password;
			public Boolean remember;

			public String validate() {
				String error = User.authenticate(email, password);
				if (!error.equals("")) {
					return error;
				}
				return null;
			}
		}

		public static class Signup {
			public String firstname;
			public String lastname;
			public String email;
			public String password;
			public String validate() {
				return null;
			}
		}

		/**
		* GET /
		*/
		public static Result index() {
			return ok(index.render("Your new application is ready."));
		}

		@Security.Authenticated(Secured.class)
		public static Result app() {
			return ok(authenticated.render("lksdjf"));
		}

		/**
		* GET /login
		*/
		public static Result renderLogin() {
			return ok(
				login.render(Form.form(Login.class), Form.form(Signup.class))
			);
		}

		/**
		* POST /login {username: "", password: ""}
		*/
		public static Result login() {
			Form<Login> loginForm = Form.form(Login.class).bindFromRequest();
			if (loginForm.hasErrors()) {
					return badRequest(login.render(loginForm, null));
			} else {
					session().clear();
					session("email", loginForm.get().email);
					return redirect(
							routes.Application.app()
					);
			}
		}

		public static Result signup() {
			Form<Signup> signupForm = Form.form(Signup.class).bindFromRequest();
			if (signupForm.hasErrors()) {
					return badRequest(login.render(null, signupForm));
			} else {
					User.create(
						signupForm.get().firstname,
						signupForm.get().lastname,
						signupForm.get().email,
						signupForm.get().password
					);
					flash("success", "Thank you! Before you can log in, please check your email to verify your email address.");
					return redirect(routes.Application.login());
			}
		}

		/**
		* GET /logout
		*/
		public static Result logout() {
			session().clear();
			flash("success", "You've been logged out");
			return redirect(
					routes.Application.login()
			);
		}

		/**
		* TODO:
		* Provide a salt on the UID with encrypted user information to provide more security.
		* Is this necessary?
		*
		* GET /register/verify/:uid
		*/
		public static Result verifyEmail(String uid) {
			User user = User.find.where().eq("emailVerify", uid).findUnique();
			user.active = true;
			user.update();
			WelcomeEmail welcomeEmail = new WelcomeEmail(user);
			welcomeEmail.sendEmail();
			flash("success", "Your email has successfully been verified! You can now login.");
			return redirect(
					routes.Application.login() // or a welcome screen?
			);
		}

		/**
		* POST /profile/edit {... data ...}
		*/
		public static Result editProfile() {
			JsonNode json = request().body().asJson();
			if(json == null) {
				return badRequest("Not valid JSON");
			} else {
				String email = json.findPath("email").textValue();
				String profile = json.findPath("profile").textValue();
				String location = json.findPath("location").textValue();
				String website = json.findPath("website").textValue();
				String title = json.findPath("title").textValue();
				Boolean updates = json.findPath("updates").booleanValue();
				Boolean notifications = json.findPath("notifications").booleanValue();
				Boolean reminders = json.findPath("reminders").booleanValue();
				User.saveProfile(email, profile, location, website, title, updates, notifications, reminders);

				return ok(index.render(""));
			}
		}

		public static Result sendFeedback() {
			JsonNode json = request().body().asJson();
			if(json == null) {
				return badRequest("Not valid JSON");
			} else {
				String name = json.findPath("name").textValue();
				String email = json.findPath("email").textValue();
				String location = json.findPath("url").textValue();
				String message = json.findPath("message").textValue();
				Feedback.save(name, email, message, location);

				return ok();
			}
		}
}
