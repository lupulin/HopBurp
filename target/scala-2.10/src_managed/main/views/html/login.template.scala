
package views.html

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._
/**/
object login extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[Form[Application.Login],Form[Application.Signup],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(loginForm: Form[Application.Login], signupForm: Form[Application.Signup]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.76*/("""

<!doctype html>
<!--[if lt IE 7]>      <html class="no-js lt-ie9 lt-ie8 lt-ie7"> <![endif]-->
<!--[if IE 7]>         <html class="no-js lt-ie9 lt-ie8"> <![endif]-->
<!--[if IE 8]>         <html class="no-js lt-ie9"> <![endif]-->
<!--[if gt IE 8]><!--> <html class="no-js"> <!--<![endif]-->
  <head>
    <meta charset="utf-8">
    <title></title>
    <meta name="description" content="">
    <meta name="viewport" content="width=device-width">
    <link href='http://fonts.googleapis.com/css?family=Ubuntu' rel='stylesheet' type='text/css'>
    <link rel="stylesheet" href=""""),_display_(Seq[Any](/*14.35*/routes/*14.41*/.Assets.at("app/bower_components/bootstrap/dist/css/bootstrap.css"))),format.raw/*14.108*/("""" />
    <link rel="stylesheet" href=""""),_display_(Seq[Any](/*15.35*/routes/*15.41*/.Assets.at("app/bower_components/font-awesome/css/font-awesome.min.css"))),format.raw/*15.113*/("""">
    <link rel="stylesheet" href=""""),_display_(Seq[Any](/*16.35*/routes/*16.41*/.Assets.at("app/styles/main.css"))),format.raw/*16.74*/("""">
    <script src=""""),_display_(Seq[Any](/*17.19*/routes/*17.25*/.Assets.at("app/bower_components/jquery/jquery.min.js"))),format.raw/*17.80*/(""""></script>
  </head>
  <body>
    <!--[if lt IE 7]>
      <p class="browsehappy">You are using an <strong>outdated</strong> browser. Please <a href="http://browsehappy.com/">upgrade your browser</a> to improve your experience.</p>
    <![endif]-->

    <!-- Add your site or application content here -->
    <div class="view-container">
      <div class="navbar navbar-inverse navbar-fixed-top" role="navigation">
        <div class="container">
          <div class="navbar-header">
            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
              <span class="sr-only">Toggle navigation</span>
              <span class="icon-bar"></span>
              <span class="icon-bar"></span>
              <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="/">HopBurp</a>
          </div>
          <div class="collapse navbar-collapse">
            <ul class="nav navbar-nav">
              <li><a href="http://blog.hopburp.com">Blog</a></li>
            </ul>
            <ul class="nav navbar-nav navbar-right">
              <li><a href="/app/">Login</a></li>
            </ul>
          </div><!--/.nav-collapse -->
        </div>
      </div>
      <div class="container view-frame">
          <div id="loginbox" style="margin-top:50px;" class="mainbox col-md-6 col-md-offset-3 col-sm-8 col-sm-offset-2">
            <div class="panel panel-info" >
                    <div class="panel-heading">
                        <div class="panel-title">Sign In</div>
                        <!-- <div style="float:right; font-size: 80%; position: relative; top:-10px"><a href="/password/forgot">Forgot password?</a></div> -->
                    </div>

                    <div style="padding-top:30px" class="panel-body" >

                        <div style="display:none" id="login-alert" class="alert alert-danger col-sm-12"></div>

                        """),_display_(Seq[Any](/*59.26*/helper/*59.32*/.form(routes.Application.login, 'class -> "form-horizontal")/*59.92*/ {_display_(Seq[Any](format.raw/*59.94*/("""

                            """),_display_(Seq[Any](/*61.30*/if(flash.contains("success"))/*61.59*/ {_display_(Seq[Any](format.raw/*61.61*/("""
                                <p class="success">
                                    """),_display_(Seq[Any](/*63.38*/flash/*63.43*/.get("success"))),format.raw/*63.58*/("""
                                </p>
                            """)))})),format.raw/*65.30*/("""

                            """),_display_(Seq[Any](/*67.30*/if(loginForm.hasGlobalErrors)/*67.59*/ {_display_(Seq[Any](format.raw/*67.61*/("""
                                <p class="error">
                                    """),_display_(Seq[Any](/*69.38*/loginForm/*69.47*/.globalError.message)),format.raw/*69.67*/("""
                                </p>
                            """)))})),format.raw/*71.30*/("""

                            <div style="margin-bottom: 25px" class="input-group">
                                        <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
                                        <input type="text" class="form-control" name="email" value=""""),_display_(Seq[Any](/*75.102*/loginForm("email")/*75.120*/.value)),format.raw/*75.126*/(""""  placeholder="email">
                                    </div>

                            <div style="margin-bottom: 25px" class="input-group">
                                        <span class="input-group-addon"><i class="glyphicon glyphicon-lock"></i></span>
                                        <input type="password" class="form-control" name="password" placeholder="password">
                                    </div>



                            <!-- <div class="input-group">
                              <div class="checkbox">
                                <label>
                                  <input type="checkbox" name="remember" /> Remember me
                                </label>
                              </div>
                            </div> -->


                            <div style="margin-top:10px" class="form-group">
                                <!-- Button -->

                                <div class="col-sm-12 controls">
                                  <input type="submit" class="btn btn-success" value="Login" />
                                  <!-- <a id="btn-fblogin" href="#" class="btn btn-primary">Login with Facebook</a> -->

                                </div>
                            </div>


                            <div class="form-group">
                                <div class="col-md-12 control">
                                    <div style="border-top: 1px solid#888; padding-top:15px; font-size:85%" >
                                        Don't have an account!
                                    <a href="#" onClick="$('#loginbox').hide(); $('#signupbox').show()">
                                        Sign Up Here
                                    </a>
                                    </div>
                                </div>
                            </div>
                            """)))})),format.raw/*115.30*/("""
                        </div>
                    </div>
                </div>
                <div id="signupbox" style="display:none; margin-top:50px" class="mainbox col-md-6 col-md-offset-3 col-sm-8 col-sm-offset-2">
                    <div class="panel panel-info">
                        <div class="panel-heading">
                            <div class="panel-title">Sign Up</div>
                            <div style="float:right; font-size: 85%; position: relative; top:-10px"><a id="signinlink" href="#" onclick="$('#signupbox').hide(); $('#loginbox').show()">Sign In</a></div>
                        </div>
                        <div class="panel-body" >
                            """),_display_(Seq[Any](/*126.30*/helper/*126.36*/.form(routes.Application.signup, 'class -> "form-horizontal")/*126.97*/ {_display_(Seq[Any](format.raw/*126.99*/("""

                              <div class="form-group">
                                  <label for="firstname" class="col-md-3 control-label">First Name</label>
                                  <div class="col-md-9">
                                      <input type="text" class="form-control" name="firstname" placeholder="First Name">
                                  </div>
                              </div>
                              <div class="form-group">
                                  <label for="lastname" class="col-md-3 control-label">Last Name</label>
                                  <div class="col-md-9">
                                      <input type="text" class="form-control" name="lastname" placeholder="Last Name">
                                  </div>
                              </div>
                              <div class="form-group">
                                  <label for="email" class="col-md-3 control-label">Email</label>
                                  <div class="col-md-9">
                                      <input type="text" class="form-control" name="email" placeholder="Email Address">
                                  </div>
                              </div>
                              <div class="form-group">
                                  <label for="password" class="col-md-3 control-label">Password</label>
                                  <div class="col-md-9">
                                      <input type="password" class="form-control" name="password" placeholder="Password">
                                  </div>
                              </div>

                              <div class="form-group">
                                  <div class="col-md-offset-3 col-md-9">
                                      <input id="btn-signup" type="submit" class="btn btn-info" value="Sign Up"/>
                                      <!-- <span style="margin-left:8px;">or</span> -->
                                  </div>
                              </div>

                              <!-- <div style="border-top: 1px solid #999; padding-top:20px"  class="form-group">

                                  <div class="col-md-offset-3 col-md-9">
                                      <button id="btn-fbsignup" type="button" class="btn btn-primary"><i class="icon-facebook"></i>   Sign Up with Facebook</button>
                                  </div>

                              </div> -->
                            """)))})),format.raw/*167.30*/("""
                         </div>
                    </div>
         </div>

      </div>
      <!-- FOOTER -->
      <div class="container">
          <hr />
          <footer>
              <div class="row">
                  <div class="col-lg-12">
                      Copyright &copy; HopBurp 2014
                      <hr />
                  </div>
              </div>
          </footer>
      </div>
    </div>

    <!-- Google Analytics: change UA-XXXXX-X to be your site's ID -->
     <script>
       (function(i,s,o,g,r,a,m)"""),format.raw/*189.32*/("""{"""),format.raw/*189.33*/("""i['GoogleAnalyticsObject']=r;i[r]=i[r]||function()"""),format.raw/*189.83*/("""{"""),format.raw/*189.84*/("""
       (i[r].q=i[r].q||[]).push(arguments)"""),format.raw/*190.43*/("""}"""),format.raw/*190.44*/(""",i[r].l=1*new Date();a=s.createElement(o),
       m=s.getElementsByTagName(o)[0];a.async=1;a.src=g;m.parentNode.insertBefore(a,m)
       """),format.raw/*192.8*/("""}"""),format.raw/*192.9*/(""")(window,document,'script','//www.google-analytics.com/analytics.js','ga');

       ga('create', 'UA-XXXXX-X');
       ga('send', 'pageview');
    </script>
</body>
</html>
"""))}
    }
    
    def render(loginForm:Form[Application.Login],signupForm:Form[Application.Signup]): play.api.templates.HtmlFormat.Appendable = apply(loginForm,signupForm)
    
    def f:((Form[Application.Login],Form[Application.Signup]) => play.api.templates.HtmlFormat.Appendable) = (loginForm,signupForm) => apply(loginForm,signupForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Jun 16 13:43:30 EDT 2014
                    SOURCE: /Users/topher/Sites/hopburp21/app/views/login.scala.html
                    HASH: b064bccbb37e1e30e2633663d545cc5a609da28a
                    MATRIX: 816->1|984->75|1596->651|1611->657|1701->724|1776->763|1791->769|1886->841|1959->878|1974->884|2029->917|2086->938|2101->944|2178->999|4175->2960|4190->2966|4259->3026|4299->3028|4366->3059|4404->3088|4444->3090|4570->3180|4584->3185|4621->3200|4720->3267|4787->3298|4825->3327|4865->3329|4989->3417|5007->3426|5049->3446|5148->3513|5490->3818|5518->3836|5547->3842|7498->5760|8240->6465|8256->6471|8327->6532|8368->6534|10934->9067|11502->9606|11532->9607|11611->9657|11641->9658|11713->9701|11743->9702|11908->9839|11937->9840
                    LINES: 26->1|29->1|42->14|42->14|42->14|43->15|43->15|43->15|44->16|44->16|44->16|45->17|45->17|45->17|87->59|87->59|87->59|87->59|89->61|89->61|89->61|91->63|91->63|91->63|93->65|95->67|95->67|95->67|97->69|97->69|97->69|99->71|103->75|103->75|103->75|143->115|154->126|154->126|154->126|154->126|195->167|217->189|217->189|217->189|217->189|218->190|218->190|220->192|220->192
                    -- GENERATED --
                */
            