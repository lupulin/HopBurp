// @SOURCE:/Users/topher/Sites/hopburp21/conf/routes
// @HASH:cd9c3170f8b0123df1848afe1607cc314484b419
// @DATE:Mon Jun 16 14:17:57 EDT 2014


import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString

object Routes extends Router.Routes {

private var _prefix = "/"

def setPrefix(prefix: String) {
  _prefix = prefix
  List[(String,Routes)]().foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" }


// @LINE:6
private[this] lazy val controllers_Application_index0 = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
        

// @LINE:8
private[this] lazy val controllers_Application_app1 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("app/"))))
        

// @LINE:16
private[this] lazy val controllers_StoreService_getStore2 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("store"))))
        

// @LINE:17
private[this] lazy val controllers_UserService_getUser3 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("user"))))
        

// @LINE:18
private[this] lazy val controllers_UserService_getUserRecipes4 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("user/recipes"))))
        

// @LINE:19
private[this] lazy val controllers_UserService_getUserById5 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("user/"),DynamicPart("publicId", """[^/]+""",true))))
        

// @LINE:20
private[this] lazy val controllers_UserService_getRecipeById6 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("user/recipes/"),DynamicPart("publicId", """[^/]+""",true))))
        

// @LINE:21
private[this] lazy val controllers_UserService_getFriendRecipes7 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("user/"),DynamicPart("publicId", """[^/]+""",true),StaticPart("/recipes"))))
        

// @LINE:22
private[this] lazy val controllers_UserService_getUserMembers8 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("member"))))
        

// @LINE:23
private[this] lazy val controllers_UserService_searchUsers9 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("user/search/"),DynamicPart("search", """[^/]+""",true))))
        

// @LINE:24
private[this] lazy val controllers_ClubService_get10 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("club/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:25
private[this] lazy val controllers_UserService_newRecipe11 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("recipe/new"))))
        

// @LINE:26
private[this] lazy val controllers_UserService_newRecipeScore12 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("recipe/"),DynamicPart("publicId", """[^/]+""",true),StaticPart("/note"))))
        

// @LINE:27
private[this] lazy val controllers_UserService_newRecipeComment13 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("recipe/"),DynamicPart("publicId", """[^/]+""",true),StaticPart("/comment"))))
        

// @LINE:28
private[this] lazy val controllers_Application_sendFeedback14 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("feedback"))))
        

// @LINE:31
private[this] lazy val controllers_Application_renderLogin15 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("login"))))
        

// @LINE:32
private[this] lazy val controllers_Application_login16 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("login"))))
        

// @LINE:33
private[this] lazy val controllers_Application_logout17 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("logout"))))
        

// @LINE:34
private[this] lazy val controllers_Application_signup18 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("signup"))))
        

// @LINE:35
private[this] lazy val controllers_Application_verifyEmail19 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("register/verify/"),DynamicPart("uid", """[^/]+""",true))))
        

// @LINE:36
private[this] lazy val controllers_Application_editProfile20 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("profile/edit"))))
        

// @LINE:39
private[this] lazy val controllers_Assets_at21 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
        
def documentation = List(("""GET""", prefix,"""controllers.Application.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """app/""","""controllers.Application.app()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """store""","""controllers.StoreService.getStore()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """user""","""controllers.UserService.getUser()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """user/recipes""","""controllers.UserService.getUserRecipes()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """user/$publicId<[^/]+>""","""controllers.UserService.getUserById(publicId:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """user/recipes/$publicId<[^/]+>""","""controllers.UserService.getRecipeById(publicId:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """user/$publicId<[^/]+>/recipes""","""controllers.UserService.getFriendRecipes(publicId:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """member""","""controllers.UserService.getUserMembers()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """user/search/$search<[^/]+>""","""controllers.UserService.searchUsers(search:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """club/$id<[^/]+>""","""controllers.ClubService.get(id:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """recipe/new""","""controllers.UserService.newRecipe()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """recipe/$publicId<[^/]+>/note""","""controllers.UserService.newRecipeScore(publicId:String)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """recipe/$publicId<[^/]+>/comment""","""controllers.UserService.newRecipeComment(publicId:String)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """feedback""","""controllers.Application.sendFeedback()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """login""","""controllers.Application.renderLogin()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """login""","""controllers.Application.login()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """logout""","""controllers.Application.logout()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """signup""","""controllers.Application.signup()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """register/verify/$uid<[^/]+>""","""controllers.Application.verifyEmail(uid:String)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """profile/edit""","""controllers.Application.editProfile()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]] 
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:6
case controllers_Application_index0(params) => {
   call { 
        invokeHandler(controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Nil,"GET", """ Home page""", Routes.prefix + """"""))
   }
}
        

// @LINE:8
case controllers_Application_app1(params) => {
   call { 
        invokeHandler(controllers.Application.app(), HandlerDef(this, "controllers.Application", "app", Nil,"GET", """GET 	 /app/ 										  controllers.Assets.at(path="/public", file="/app/index.html")""", Routes.prefix + """app/"""))
   }
}
        

// @LINE:16
case controllers_StoreService_getStore2(params) => {
   call { 
        invokeHandler(controllers.StoreService.getStore(), HandlerDef(this, "controllers.StoreService", "getStore", Nil,"GET", """ Restful Web Services""", Routes.prefix + """store"""))
   }
}
        

// @LINE:17
case controllers_UserService_getUser3(params) => {
   call { 
        invokeHandler(controllers.UserService.getUser(), HandlerDef(this, "controllers.UserService", "getUser", Nil,"GET", """""", Routes.prefix + """user"""))
   }
}
        

// @LINE:18
case controllers_UserService_getUserRecipes4(params) => {
   call { 
        invokeHandler(controllers.UserService.getUserRecipes(), HandlerDef(this, "controllers.UserService", "getUserRecipes", Nil,"GET", """""", Routes.prefix + """user/recipes"""))
   }
}
        

// @LINE:19
case controllers_UserService_getUserById5(params) => {
   call(params.fromPath[String]("publicId", None)) { (publicId) =>
        invokeHandler(controllers.UserService.getUserById(publicId), HandlerDef(this, "controllers.UserService", "getUserById", Seq(classOf[String]),"GET", """""", Routes.prefix + """user/$publicId<[^/]+>"""))
   }
}
        

// @LINE:20
case controllers_UserService_getRecipeById6(params) => {
   call(params.fromPath[String]("publicId", None)) { (publicId) =>
        invokeHandler(controllers.UserService.getRecipeById(publicId), HandlerDef(this, "controllers.UserService", "getRecipeById", Seq(classOf[String]),"GET", """""", Routes.prefix + """user/recipes/$publicId<[^/]+>"""))
   }
}
        

// @LINE:21
case controllers_UserService_getFriendRecipes7(params) => {
   call(params.fromPath[String]("publicId", None)) { (publicId) =>
        invokeHandler(controllers.UserService.getFriendRecipes(publicId), HandlerDef(this, "controllers.UserService", "getFriendRecipes", Seq(classOf[String]),"GET", """""", Routes.prefix + """user/$publicId<[^/]+>/recipes"""))
   }
}
        

// @LINE:22
case controllers_UserService_getUserMembers8(params) => {
   call { 
        invokeHandler(controllers.UserService.getUserMembers(), HandlerDef(this, "controllers.UserService", "getUserMembers", Nil,"GET", """""", Routes.prefix + """member"""))
   }
}
        

// @LINE:23
case controllers_UserService_searchUsers9(params) => {
   call(params.fromPath[String]("search", None)) { (search) =>
        invokeHandler(controllers.UserService.searchUsers(search), HandlerDef(this, "controllers.UserService", "searchUsers", Seq(classOf[String]),"GET", """""", Routes.prefix + """user/search/$search<[^/]+>"""))
   }
}
        

// @LINE:24
case controllers_ClubService_get10(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.ClubService.get(id), HandlerDef(this, "controllers.ClubService", "get", Seq(classOf[Long]),"GET", """""", Routes.prefix + """club/$id<[^/]+>"""))
   }
}
        

// @LINE:25
case controllers_UserService_newRecipe11(params) => {
   call { 
        invokeHandler(controllers.UserService.newRecipe(), HandlerDef(this, "controllers.UserService", "newRecipe", Nil,"POST", """""", Routes.prefix + """recipe/new"""))
   }
}
        

// @LINE:26
case controllers_UserService_newRecipeScore12(params) => {
   call(params.fromPath[String]("publicId", None)) { (publicId) =>
        invokeHandler(controllers.UserService.newRecipeScore(publicId), HandlerDef(this, "controllers.UserService", "newRecipeScore", Seq(classOf[String]),"POST", """""", Routes.prefix + """recipe/$publicId<[^/]+>/note"""))
   }
}
        

// @LINE:27
case controllers_UserService_newRecipeComment13(params) => {
   call(params.fromPath[String]("publicId", None)) { (publicId) =>
        invokeHandler(controllers.UserService.newRecipeComment(publicId), HandlerDef(this, "controllers.UserService", "newRecipeComment", Seq(classOf[String]),"POST", """""", Routes.prefix + """recipe/$publicId<[^/]+>/comment"""))
   }
}
        

// @LINE:28
case controllers_Application_sendFeedback14(params) => {
   call { 
        invokeHandler(controllers.Application.sendFeedback(), HandlerDef(this, "controllers.Application", "sendFeedback", Nil,"POST", """""", Routes.prefix + """feedback"""))
   }
}
        

// @LINE:31
case controllers_Application_renderLogin15(params) => {
   call { 
        invokeHandler(controllers.Application.renderLogin(), HandlerDef(this, "controllers.Application", "renderLogin", Nil,"GET", """ User routes (login, logout, register)""", Routes.prefix + """login"""))
   }
}
        

// @LINE:32
case controllers_Application_login16(params) => {
   call { 
        invokeHandler(controllers.Application.login(), HandlerDef(this, "controllers.Application", "login", Nil,"POST", """""", Routes.prefix + """login"""))
   }
}
        

// @LINE:33
case controllers_Application_logout17(params) => {
   call { 
        invokeHandler(controllers.Application.logout(), HandlerDef(this, "controllers.Application", "logout", Nil,"GET", """""", Routes.prefix + """logout"""))
   }
}
        

// @LINE:34
case controllers_Application_signup18(params) => {
   call { 
        invokeHandler(controllers.Application.signup(), HandlerDef(this, "controllers.Application", "signup", Nil,"POST", """""", Routes.prefix + """signup"""))
   }
}
        

// @LINE:35
case controllers_Application_verifyEmail19(params) => {
   call(params.fromPath[String]("uid", None)) { (uid) =>
        invokeHandler(controllers.Application.verifyEmail(uid), HandlerDef(this, "controllers.Application", "verifyEmail", Seq(classOf[String]),"GET", """""", Routes.prefix + """register/verify/$uid<[^/]+>"""))
   }
}
        

// @LINE:36
case controllers_Application_editProfile20(params) => {
   call { 
        invokeHandler(controllers.Application.editProfile(), HandlerDef(this, "controllers.Application", "editProfile", Nil,"POST", """""", Routes.prefix + """profile/edit"""))
   }
}
        

// @LINE:39
case controllers_Assets_at21(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
   }
}
        
}

}
     