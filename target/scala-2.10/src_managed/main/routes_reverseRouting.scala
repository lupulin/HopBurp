// @SOURCE:/Users/topher/Sites/hopburp21/conf/routes
// @HASH:cd9c3170f8b0123df1848afe1607cc314484b419
// @DATE:Mon Jun 16 14:17:57 EDT 2014

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString


// @LINE:39
// @LINE:36
// @LINE:35
// @LINE:34
// @LINE:33
// @LINE:32
// @LINE:31
// @LINE:28
// @LINE:27
// @LINE:26
// @LINE:25
// @LINE:24
// @LINE:23
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:8
// @LINE:6
package controllers {

// @LINE:39
class ReverseAssets {
    

// @LINE:39
def at(file:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                
    
}
                          

// @LINE:24
class ReverseClubService {
    

// @LINE:24
def get(id:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "club/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                
    
}
                          

// @LINE:27
// @LINE:26
// @LINE:25
// @LINE:23
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
class ReverseUserService {
    

// @LINE:27
def newRecipeComment(publicId:String): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "recipe/" + implicitly[PathBindable[String]].unbind("publicId", dynamicString(publicId)) + "/comment")
}
                                                

// @LINE:19
def getUserById(publicId:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "user/" + implicitly[PathBindable[String]].unbind("publicId", dynamicString(publicId)))
}
                                                

// @LINE:18
def getUserRecipes(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "user/recipes")
}
                                                

// @LINE:26
def newRecipeScore(publicId:String): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "recipe/" + implicitly[PathBindable[String]].unbind("publicId", dynamicString(publicId)) + "/note")
}
                                                

// @LINE:25
def newRecipe(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "recipe/new")
}
                                                

// @LINE:17
def getUser(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "user")
}
                                                

// @LINE:21
def getFriendRecipes(publicId:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "user/" + implicitly[PathBindable[String]].unbind("publicId", dynamicString(publicId)) + "/recipes")
}
                                                

// @LINE:23
def searchUsers(search:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "user/search/" + implicitly[PathBindable[String]].unbind("search", dynamicString(search)))
}
                                                

// @LINE:22
def getUserMembers(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "member")
}
                                                

// @LINE:20
def getRecipeById(publicId:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "user/recipes/" + implicitly[PathBindable[String]].unbind("publicId", dynamicString(publicId)))
}
                                                
    
}
                          

// @LINE:16
class ReverseStoreService {
    

// @LINE:16
def getStore(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "store")
}
                                                
    
}
                          

// @LINE:36
// @LINE:35
// @LINE:34
// @LINE:33
// @LINE:32
// @LINE:31
// @LINE:28
// @LINE:8
// @LINE:6
class ReverseApplication {
    

// @LINE:35
def verifyEmail(uid:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "register/verify/" + implicitly[PathBindable[String]].unbind("uid", dynamicString(uid)))
}
                                                

// @LINE:34
def signup(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "signup")
}
                                                

// @LINE:33
def logout(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "logout")
}
                                                

// @LINE:31
def renderLogin(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "login")
}
                                                

// @LINE:8
def app(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "app/")
}
                                                

// @LINE:28
def sendFeedback(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "feedback")
}
                                                

// @LINE:36
def editProfile(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "profile/edit")
}
                                                

// @LINE:6
def index(): Call = {
   Call("GET", _prefix)
}
                                                

// @LINE:32
def login(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "login")
}
                                                
    
}
                          
}
                  


// @LINE:39
// @LINE:36
// @LINE:35
// @LINE:34
// @LINE:33
// @LINE:32
// @LINE:31
// @LINE:28
// @LINE:27
// @LINE:26
// @LINE:25
// @LINE:24
// @LINE:23
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:8
// @LINE:6
package controllers.javascript {

// @LINE:39
class ReverseAssets {
    

// @LINE:39
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        
    
}
              

// @LINE:24
class ReverseClubService {
    

// @LINE:24
def get : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ClubService.get",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "club/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        
    
}
              

// @LINE:27
// @LINE:26
// @LINE:25
// @LINE:23
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
class ReverseUserService {
    

// @LINE:27
def newRecipeComment : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UserService.newRecipeComment",
   """
      function(publicId) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "recipe/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("publicId", encodeURIComponent(publicId)) + "/comment"})
      }
   """
)
                        

// @LINE:19
def getUserById : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UserService.getUserById",
   """
      function(publicId) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "user/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("publicId", encodeURIComponent(publicId))})
      }
   """
)
                        

// @LINE:18
def getUserRecipes : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UserService.getUserRecipes",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "user/recipes"})
      }
   """
)
                        

// @LINE:26
def newRecipeScore : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UserService.newRecipeScore",
   """
      function(publicId) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "recipe/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("publicId", encodeURIComponent(publicId)) + "/note"})
      }
   """
)
                        

// @LINE:25
def newRecipe : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UserService.newRecipe",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "recipe/new"})
      }
   """
)
                        

// @LINE:17
def getUser : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UserService.getUser",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "user"})
      }
   """
)
                        

// @LINE:21
def getFriendRecipes : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UserService.getFriendRecipes",
   """
      function(publicId) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "user/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("publicId", encodeURIComponent(publicId)) + "/recipes"})
      }
   """
)
                        

// @LINE:23
def searchUsers : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UserService.searchUsers",
   """
      function(search) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "user/search/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("search", encodeURIComponent(search))})
      }
   """
)
                        

// @LINE:22
def getUserMembers : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UserService.getUserMembers",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "member"})
      }
   """
)
                        

// @LINE:20
def getRecipeById : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UserService.getRecipeById",
   """
      function(publicId) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "user/recipes/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("publicId", encodeURIComponent(publicId))})
      }
   """
)
                        
    
}
              

// @LINE:16
class ReverseStoreService {
    

// @LINE:16
def getStore : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.StoreService.getStore",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "store"})
      }
   """
)
                        
    
}
              

// @LINE:36
// @LINE:35
// @LINE:34
// @LINE:33
// @LINE:32
// @LINE:31
// @LINE:28
// @LINE:8
// @LINE:6
class ReverseApplication {
    

// @LINE:35
def verifyEmail : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.verifyEmail",
   """
      function(uid) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "register/verify/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("uid", encodeURIComponent(uid))})
      }
   """
)
                        

// @LINE:34
def signup : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.signup",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "signup"})
      }
   """
)
                        

// @LINE:33
def logout : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.logout",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "logout"})
      }
   """
)
                        

// @LINE:31
def renderLogin : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.renderLogin",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
      }
   """
)
                        

// @LINE:8
def app : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.app",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "app/"})
      }
   """
)
                        

// @LINE:28
def sendFeedback : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.sendFeedback",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "feedback"})
      }
   """
)
                        

// @LINE:36
def editProfile : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.editProfile",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "profile/edit"})
      }
   """
)
                        

// @LINE:6
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
   """
)
                        

// @LINE:32
def login : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.login",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
      }
   """
)
                        
    
}
              
}
        


// @LINE:39
// @LINE:36
// @LINE:35
// @LINE:34
// @LINE:33
// @LINE:32
// @LINE:31
// @LINE:28
// @LINE:27
// @LINE:26
// @LINE:25
// @LINE:24
// @LINE:23
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:8
// @LINE:6
package controllers.ref {


// @LINE:39
class ReverseAssets {
    

// @LINE:39
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      
    
}
                          

// @LINE:24
class ReverseClubService {
    

// @LINE:24
def get(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ClubService.get(id), HandlerDef(this, "controllers.ClubService", "get", Seq(classOf[Long]), "GET", """""", _prefix + """club/$id<[^/]+>""")
)
                      
    
}
                          

// @LINE:27
// @LINE:26
// @LINE:25
// @LINE:23
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
class ReverseUserService {
    

// @LINE:27
def newRecipeComment(publicId:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.UserService.newRecipeComment(publicId), HandlerDef(this, "controllers.UserService", "newRecipeComment", Seq(classOf[String]), "POST", """""", _prefix + """recipe/$publicId<[^/]+>/comment""")
)
                      

// @LINE:19
def getUserById(publicId:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.UserService.getUserById(publicId), HandlerDef(this, "controllers.UserService", "getUserById", Seq(classOf[String]), "GET", """""", _prefix + """user/$publicId<[^/]+>""")
)
                      

// @LINE:18
def getUserRecipes(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.UserService.getUserRecipes(), HandlerDef(this, "controllers.UserService", "getUserRecipes", Seq(), "GET", """""", _prefix + """user/recipes""")
)
                      

// @LINE:26
def newRecipeScore(publicId:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.UserService.newRecipeScore(publicId), HandlerDef(this, "controllers.UserService", "newRecipeScore", Seq(classOf[String]), "POST", """""", _prefix + """recipe/$publicId<[^/]+>/note""")
)
                      

// @LINE:25
def newRecipe(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.UserService.newRecipe(), HandlerDef(this, "controllers.UserService", "newRecipe", Seq(), "POST", """""", _prefix + """recipe/new""")
)
                      

// @LINE:17
def getUser(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.UserService.getUser(), HandlerDef(this, "controllers.UserService", "getUser", Seq(), "GET", """""", _prefix + """user""")
)
                      

// @LINE:21
def getFriendRecipes(publicId:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.UserService.getFriendRecipes(publicId), HandlerDef(this, "controllers.UserService", "getFriendRecipes", Seq(classOf[String]), "GET", """""", _prefix + """user/$publicId<[^/]+>/recipes""")
)
                      

// @LINE:23
def searchUsers(search:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.UserService.searchUsers(search), HandlerDef(this, "controllers.UserService", "searchUsers", Seq(classOf[String]), "GET", """""", _prefix + """user/search/$search<[^/]+>""")
)
                      

// @LINE:22
def getUserMembers(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.UserService.getUserMembers(), HandlerDef(this, "controllers.UserService", "getUserMembers", Seq(), "GET", """""", _prefix + """member""")
)
                      

// @LINE:20
def getRecipeById(publicId:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.UserService.getRecipeById(publicId), HandlerDef(this, "controllers.UserService", "getRecipeById", Seq(classOf[String]), "GET", """""", _prefix + """user/recipes/$publicId<[^/]+>""")
)
                      
    
}
                          

// @LINE:16
class ReverseStoreService {
    

// @LINE:16
def getStore(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.StoreService.getStore(), HandlerDef(this, "controllers.StoreService", "getStore", Seq(), "GET", """ Restful Web Services""", _prefix + """store""")
)
                      
    
}
                          

// @LINE:36
// @LINE:35
// @LINE:34
// @LINE:33
// @LINE:32
// @LINE:31
// @LINE:28
// @LINE:8
// @LINE:6
class ReverseApplication {
    

// @LINE:35
def verifyEmail(uid:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.verifyEmail(uid), HandlerDef(this, "controllers.Application", "verifyEmail", Seq(classOf[String]), "GET", """""", _prefix + """register/verify/$uid<[^/]+>""")
)
                      

// @LINE:34
def signup(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.signup(), HandlerDef(this, "controllers.Application", "signup", Seq(), "POST", """""", _prefix + """signup""")
)
                      

// @LINE:33
def logout(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.logout(), HandlerDef(this, "controllers.Application", "logout", Seq(), "GET", """""", _prefix + """logout""")
)
                      

// @LINE:31
def renderLogin(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.renderLogin(), HandlerDef(this, "controllers.Application", "renderLogin", Seq(), "GET", """ User routes (login, logout, register)""", _prefix + """login""")
)
                      

// @LINE:8
def app(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.app(), HandlerDef(this, "controllers.Application", "app", Seq(), "GET", """GET 	 /app/ 										  controllers.Assets.at(path="/public", file="/app/index.html")""", _prefix + """app/""")
)
                      

// @LINE:28
def sendFeedback(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.sendFeedback(), HandlerDef(this, "controllers.Application", "sendFeedback", Seq(), "POST", """""", _prefix + """feedback""")
)
                      

// @LINE:36
def editProfile(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.editProfile(), HandlerDef(this, "controllers.Application", "editProfile", Seq(), "POST", """""", _prefix + """profile/edit""")
)
                      

// @LINE:6
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Seq(), "GET", """ Home page""", _prefix + """""")
)
                      

// @LINE:32
def login(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.login(), HandlerDef(this, "controllers.Application", "login", Seq(), "POST", """""", _prefix + """login""")
)
                      
    
}
                          
}
        
    