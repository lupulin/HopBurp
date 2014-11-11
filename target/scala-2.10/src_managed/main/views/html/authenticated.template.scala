
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
object authenticated extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(message: String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.19*/("""

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
    <!-- Place favicon.ico and apple-touch-icon.png in the root directory -->
    <!-- build:css styles/vendor.css -->
    <!-- bower:css -->
    <link rel="stylesheet" href=""""),_display_(Seq[Any](/*17.35*/routes/*17.41*/.Assets.at("app/bower_components/bootstrap/dist/css/bootstrap.css"))),format.raw/*17.108*/("""" />
    <link rel="stylesheet" href=""""),_display_(Seq[Any](/*18.35*/routes/*18.41*/.Assets.at("app/bower_components/morris.js/morris.css"))),format.raw/*18.96*/("""" />
    <link rel="stylesheet" href=""""),_display_(Seq[Any](/*19.35*/routes/*19.41*/.Assets.at("app/bower_components/fullcalendar/fullcalendar.css"))),format.raw/*19.105*/("""" />
    <!-- endbower -->
    <!-- endbuild -->
    <!-- build:css styles/vendor/fontawesome.css -->
    <link rel="stylesheet" href=""""),_display_(Seq[Any](/*23.35*/routes/*23.41*/.Assets.at("app/bower_components/font-awesome/css/font-awesome.min.css"))),format.raw/*23.113*/("""">
    <!-- endbuild -->
    <!-- build:css("""),format.raw/*25.20*/("""{"""),format.raw/*25.21*/(""".tmp,app"""),format.raw/*25.29*/("""}"""),format.raw/*25.30*/(""") styles/main.css -->
    <link rel="stylesheet" href=""""),_display_(Seq[Any](/*26.35*/routes/*26.41*/.Assets.at("app/styles/main.css"))),format.raw/*26.74*/("""">
    <!-- endbuild -->
    <!-- build:css("""),format.raw/*28.20*/("""{"""),format.raw/*28.21*/(""".tmp,app"""),format.raw/*28.29*/("""}"""),format.raw/*28.30*/(""") styles/animations.css -->
    <link rel="stylesheet" href=""""),_display_(Seq[Any](/*29.35*/routes/*29.41*/.Assets.at("app/styles/animations.css"))),format.raw/*29.80*/("""">
    <!-- endbuild -->
  </head>
  <body ng-app="frontendApp">
    <!--[if lt IE 7]>
      <p class="browsehappy">You are using an <strong>outdated</strong> browser. Please <a href="http://browsehappy.com/">upgrade your browser</a> to improve your experience.</p>
    <![endif]-->

    <!-- Add your site or application content here -->
    <div class="view-container" ng-controller="ParentCtrl">
      <div class="navbar navbar-inverse navbar-fixed-top" role="navigation">
        <div class="container">
          <div class="navbar-header">
            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
              <span class="sr-only">Toggle navigation</span>
              <span class="icon-bar"></span>
              <span class="icon-bar"></span>
              <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="/app/">HopBurp</a>
          </div>
          <div class="collapse navbar-collapse">
            <ul class="nav navbar-nav">
              <!-- <li class="active dropdown">
                <a href="#" class="dropdown-toggle" data-toggle="dropdown" ng-show="members.size() > 0">
                  Clubs <span class="caret"></span>
                </a>
                <ul class="dropdown-menu" ng-show="members.size() > 0">
                  <li><a href="#/club/"""),format.raw/*57.39*/("""{"""),format.raw/*57.40*/("""{"""),format.raw/*57.41*/("""club.id"""),format.raw/*57.48*/("""}"""),format.raw/*57.49*/("""}"""),format.raw/*57.50*/(""""><span class="glyphicon glyphicon-globe"></span>&nbsp;&nbsp;"""),format.raw/*57.111*/("""{"""),format.raw/*57.112*/("""{"""),format.raw/*57.113*/("""club.abbrevName"""),format.raw/*57.128*/("""}"""),format.raw/*57.129*/("""}"""),format.raw/*57.130*/("""</a></li>
                </ul>
              </li> -->
              <!-- <li class="dropdown">
                <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                  Club <span class="caret"></span>
                </a>
                <ul class="dropdown-menu">
                  <li><a href="#/awards"><span class="glyphicon glyphicon-tower"></span>&nbsp;&nbsp;Awards</a></li>
                  <li><a href="#/forums"><span class="glyphicon glyphicon-comment"></span>&nbsp;&nbsp;Forums</a></li>
                  <li><a href="#/news"><span class="glyphicon glyphicon-pencil"></span>&nbsp;&nbsp;News</a></li>
                  <li><a href="#/members"><span class="glyphicon glyphicon-user"></span>&nbsp;&nbsp;Members</a></li>
                  <li><a href="#/dues"><span class="glyphicon glyphicon-tag"></span>&nbsp;&nbsp;Dues</a></li>
                  <li><a href="#/calendar"><span class="glyphicon glyphicon-calendar"></span>&nbsp;&nbsp;Calendar</a></li>
                  <li><a href="#/docs"><span class="glyphicon glyphicon-print"></span>&nbsp;&nbsp;Documents</a></li>
                  <li><a href="#/photos"><span class="glyphicon glyphicon-picture"></span>&nbsp;&nbsp;Photos</a></li>
                </ul>
              </li> -->
              <li class="dropdown">
                <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                  Recipes <span class="caret"></span>
                </a>
                <ul class="dropdown-menu">
                  <li><a href="#/recipes"><span class="glyphicon glyphicon-hdd"></span>&nbsp;&nbsp;My Recipes</a></li>
                </ul>
              </li>
              <li>
                <!-- <a href="#/store">
                  Store
                </a> -->
              </li>
            </ul>

            <ul class="nav navbar-nav navbar-right">
              <!-- <li class="dropdown messages-dropdown">
                <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                  <span class="badge" ng-show="user.unreadMessages > 0">"""),format.raw/*93.73*/("""{"""),format.raw/*93.74*/("""{"""),format.raw/*93.75*/("""user.messageStreams.length"""),format.raw/*93.101*/("""}"""),format.raw/*93.102*/("""}"""),format.raw/*93.103*/("""</span>
                  <i class="fa fa-envelope"></i>
                  <b class="caret"></b>
                </a>
                <ul class="dropdown-menu">
                  <li class="message-preview" ng-repeat="messageStream in user.messageStreams">
                    <a href="#">
                      <span class="avatar"><img src="http://placehold.it/50x50"></span>
                      <span class="name">"""),format.raw/*101.42*/("""{"""),format.raw/*101.43*/("""{"""),format.raw/*101.44*/("""messageStream.messagee.fullname"""),format.raw/*101.75*/("""}"""),format.raw/*101.76*/("""}"""),format.raw/*101.77*/(""":</span>
                      <span class="message">Hey there, I wanted to ask you something...</span>
                      <span class="time"><i class="fa fa-clock-o"></i> 4:34 PM</span>
                    </a>
                  </li>
                  <li><a href="#/messages">View Inbox <span class="badge"></span></a></li>
                </ul>
              </li> -->
              <li class="dropdown">
                <a href="#" class="dropdown-toggle" data-toggle="dropdown">"""),format.raw/*110.76*/("""{"""),format.raw/*110.77*/("""{"""),format.raw/*110.78*/("""user.firstname"""),format.raw/*110.92*/("""}"""),format.raw/*110.93*/("""}"""),format.raw/*110.94*/(""" """),format.raw/*110.95*/("""{"""),format.raw/*110.96*/("""{"""),format.raw/*110.97*/("""user.lastname"""),format.raw/*110.110*/("""}"""),format.raw/*110.111*/("""}"""),format.raw/*110.112*/(""" <b class="caret"></b></a>
                <ul class="dropdown-menu">
                  <li><a href="#/profile"><span class="glyphicon glyphicon-tasks"></span>&nbsp;&nbsp;My Profile</a></li>
                  <!-- <li><a href="#/settings"><span class="glyphicon glyphicon-cog"></span>&nbsp;&nbsp;Settings</a></li> -->
                  <li class="divider"></li>
                  <li><a href="/logout"><span class="glyphicon glyphicon-off"></span>&nbsp;&nbsp;Logout</a></li>
                </ul>
              </li>
            </ul>
            <script type="text/ng-template" id="clubpeople.html">
              <a>
                <img gravatar-src="'"""),format.raw/*121.37*/("""{"""),format.raw/*121.38*/("""{"""),format.raw/*121.39*/("""match.model.email"""),format.raw/*121.56*/("""}"""),format.raw/*121.57*/("""}"""),format.raw/*121.58*/("""'" gravatar-size="50" alt="Profile Image" />
                <span style="margin-left: 20px;">"""),format.raw/*122.50*/("""{"""),format.raw/*122.51*/("""{"""),format.raw/*122.52*/("""match.model.fullname"""),format.raw/*122.72*/("""}"""),format.raw/*122.73*/("""}"""),format.raw/*122.74*/("""</span>
              </a>
            </script>
            <form class="navbar-form navbar-right" role="search">
              <div class="input-group" style="width:300px">
                  <input type="text" class="form-control" placeholder="Search for people" typeahead-template-url="clubpeople.html" typeahead-on-select="profile($item, $model, $label)" ng-model="selected" typeahead="user as user.lastname for user in getUsers($viewValue)">
                  <div class="input-group-btn">
                      <button class="btn btn-default" type="submit"><i class="glyphicon glyphicon-search"></i></button>
                  </div>
              </div>
            </form>
          </div><!--/.nav-collapse -->
        </div>
      </div>
      <div class="container view-frame" ng-view></div>
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

    <script type="text/ng-template" id="newRecipeModal.html">
        <div class="modal-header">
            <h3 class="modal-title">I'm a modal!</h3>
        </div>
        <div class="modal-body">
          <form class="form-horizontal" action="" method="post" style="margin-top: 30px">

          <!-- Name input-->
          <div class="form-group">
            <label class="col-md-3 control-label" for="name">Recipe name:</label>
            <div class="col-md-9">
              <input type="text" placeholder="" ng-model="recipe.name" value="" class="form-control">
            </div>
          </div>

          <div class="form-group">
            <label class="col-md-3 control-label" for="name">Beer Style:</label>
            <div class="col-md-9">
              <input type="text" placeholder="" ng-model="recipe.style" value="" class="form-control">
            </div>
          </div>

          <!-- Email input-->
          <div class="form-group">
            <label class="col-md-3 control-label" for="email">Recipe Link: (i.e. BrewToad, BeerSmith links)</label>
            <div class="col-md-9">
              <input type="text" placeholder="" ng-model="recipe.link" value="" class="form-control">
            </div>
          </div>
        </div>
        <div class="modal-footer">
            <button class="btn btn-primary" ng-click="ok()">OK</button>
            <button class="btn btn-warning" ng-click="cancel()">Cancel</button>
        </div>
    </script>

    <div ng-controller="FeedbackCtrl">
        <div class="contact-form" ng-click="open()">
            Feedback
        </div>
    </div>

    <!-- Google Analytics: change UA-XXXXX-X to be your site's ID -->
     <script>
       (function(i,s,o,g,r,a,m)"""),format.raw/*195.32*/("""{"""),format.raw/*195.33*/("""i['GoogleAnalyticsObject']=r;i[r]=i[r]||function()"""),format.raw/*195.83*/("""{"""),format.raw/*195.84*/("""
       (i[r].q=i[r].q||[]).push(arguments)"""),format.raw/*196.43*/("""}"""),format.raw/*196.44*/(""",i[r].l=1*new Date();a=s.createElement(o),
       m=s.getElementsByTagName(o)[0];a.async=1;a.src=g;m.parentNode.insertBefore(a,m)
       """),format.raw/*198.8*/("""}"""),format.raw/*198.9*/(""")(window,document,'script','//www.google-analytics.com/analytics.js','ga');

       ga('create', 'UA-XXXXX-X');
       ga('send', 'pageview');
    </script>

    <!--[if lt IE 9]>
    <script src=""""),_display_(Seq[Any](/*205.19*/routes/*205.25*/.Assets.at("app/bower_components/es5-shim/es5-shim.js"))),format.raw/*205.80*/(""""></script>
    <script src=""""),_display_(Seq[Any](/*206.19*/routes/*206.25*/.Assets.at("app/bower_components/json3/lib/json3.min.js"))),format.raw/*206.82*/(""""></script>
    <![endif]-->

    <!-- build:js scripts/vendor.js -->
    <!-- bower:js -->
    <script src=""""),_display_(Seq[Any](/*211.19*/routes/*211.25*/.Assets.at("app/bower_components/jquery/jquery.js"))),format.raw/*211.76*/(""""></script>
    <script src=""""),_display_(Seq[Any](/*212.19*/routes/*212.25*/.Assets.at("app/bower_components/angular/angular.js"))),format.raw/*212.78*/(""""></script>
    <script src=""""),_display_(Seq[Any](/*213.19*/routes/*213.25*/.Assets.at("app/bower_components/bootstrap/dist/js/bootstrap.js"))),format.raw/*213.90*/(""""></script>
    <script src=""""),_display_(Seq[Any](/*214.19*/routes/*214.25*/.Assets.at("app/bower_components/angular-resource/angular-resource.js"))),format.raw/*214.96*/(""""></script>
    <script src=""""),_display_(Seq[Any](/*215.19*/routes/*215.25*/.Assets.at("app/bower_components/angular-cookies/angular-cookies.js"))),format.raw/*215.94*/(""""></script>
    <script src=""""),_display_(Seq[Any](/*216.19*/routes/*216.25*/.Assets.at("app/bower_components/angular-sanitize/angular-sanitize.js"))),format.raw/*216.96*/(""""></script>
    <script src=""""),_display_(Seq[Any](/*217.19*/routes/*217.25*/.Assets.at("app/bower_components/angular-route/angular-route.js"))),format.raw/*217.90*/(""""></script>
    <script src=""""),_display_(Seq[Any](/*218.19*/routes/*218.25*/.Assets.at("app/bower_components/angular-bootstrap/ui-bootstrap-tpls.js"))),format.raw/*218.98*/(""""></script>
    <script src=""""),_display_(Seq[Any](/*219.19*/routes/*219.25*/.Assets.at("app/bower_components/raphael/raphael.js"))),format.raw/*219.78*/(""""></script>
    <script src=""""),_display_(Seq[Any](/*220.19*/routes/*220.25*/.Assets.at("app/bower_components/mocha/mocha.js"))),format.raw/*220.74*/(""""></script>
    <script src=""""),_display_(Seq[Any](/*221.19*/routes/*221.25*/.Assets.at("app/bower_components/morris.js/morris.js"))),format.raw/*221.79*/(""""></script>
    <script src=""""),_display_(Seq[Any](/*222.19*/routes/*222.25*/.Assets.at("app/bower_components/angular-animate/angular-animate.js"))),format.raw/*222.94*/(""""></script>
    <script src=""""),_display_(Seq[Any](/*223.19*/routes/*223.25*/.Assets.at("app/bower_components/draggable/draggable.min.js"))),format.raw/*223.86*/(""""></script>
    <script src=""""),_display_(Seq[Any](/*224.19*/routes/*224.25*/.Assets.at("app/bower_components/jquery-ui/ui/jquery-ui.js"))),format.raw/*224.85*/(""""></script>
    <script src=""""),_display_(Seq[Any](/*225.19*/routes/*225.25*/.Assets.at("app/bower_components/angular-dragdrop/src/angular-dragdrop.js"))),format.raw/*225.100*/(""""></script>
    <script src=""""),_display_(Seq[Any](/*226.19*/routes/*226.25*/.Assets.at("app/bower_components/fullcalendar/fullcalendar.js"))),format.raw/*226.88*/(""""></script>
    <script src=""""),_display_(Seq[Any](/*227.19*/routes/*227.25*/.Assets.at("app/bower_components/angular-ui-calendar/src/calendar.js"))),format.raw/*227.95*/(""""></script>
    <script src=""""),_display_(Seq[Any](/*228.19*/routes/*228.25*/.Assets.at("app/bower_components/angular-relative-date/angular-relative-date.min.js"))),format.raw/*228.110*/(""""></script>
    <script src=""""),_display_(Seq[Any](/*229.19*/routes/*229.25*/.Assets.at("app/bower_components/angular-facebook/lib/angular-facebook.js"))),format.raw/*229.100*/(""""></script>
    <script src=""""),_display_(Seq[Any](/*230.19*/routes/*230.25*/.Assets.at("app/bower_components/angular-gravatar/src/md5.js"))),format.raw/*230.87*/(""""></script>
    <script src=""""),_display_(Seq[Any](/*231.19*/routes/*231.25*/.Assets.at("app/bower_components/angular-gravatar/build/angular-gravatar.js"))),format.raw/*231.102*/(""""></script>
    <!-- endbower -->
    <!-- endbuild -->

    <!-- build:js("""),format.raw/*235.19*/("""{"""),format.raw/*235.20*/(""".tmp,app"""),format.raw/*235.28*/("""}"""),format.raw/*235.29*/(""") scripts/scripts.js -->
    <script src=""""),_display_(Seq[Any](/*236.19*/routes/*236.25*/.Assets.at("app/scripts/app.js"))),format.raw/*236.57*/(""""></script>
    <script src=""""),_display_(Seq[Any](/*237.19*/routes/*237.25*/.Assets.at("app/scripts/controllers/parent.js"))),format.raw/*237.72*/(""""></script>
    <script src=""""),_display_(Seq[Any](/*238.19*/routes/*238.25*/.Assets.at("app/scripts/controllers/recipe.js"))),format.raw/*238.72*/(""""></script>
    <script src=""""),_display_(Seq[Any](/*239.19*/routes/*239.25*/.Assets.at("app/scripts/directives/linechart.js"))),format.raw/*239.74*/(""""></script>
    <script src=""""),_display_(Seq[Any](/*240.19*/routes/*240.25*/.Assets.at("app/scripts/controllers/friend.profile.js"))),format.raw/*240.80*/(""""></script>
    <script src=""""),_display_(Seq[Any](/*241.19*/routes/*241.25*/.Assets.at("app/scripts/controllers/profile.js"))),format.raw/*241.73*/(""""></script>
    <script src=""""),_display_(Seq[Any](/*242.19*/routes/*242.25*/.Assets.at("app/scripts/controllers/settings.js"))),format.raw/*242.74*/(""""></script>
    <script src=""""),_display_(Seq[Any](/*243.19*/routes/*243.25*/.Assets.at("app/scripts/controllers/awards.js"))),format.raw/*243.72*/(""""></script>
    <script src=""""),_display_(Seq[Any](/*244.19*/routes/*244.25*/.Assets.at("app/scripts/controllers/forums.js"))),format.raw/*244.72*/(""""></script>
    <script src=""""),_display_(Seq[Any](/*245.19*/routes/*245.25*/.Assets.at("app/scripts/controllers/news.js"))),format.raw/*245.70*/(""""></script>
    <script src=""""),_display_(Seq[Any](/*246.19*/routes/*246.25*/.Assets.at("app/scripts/controllers/members.js"))),format.raw/*246.73*/(""""></script>
    <script src=""""),_display_(Seq[Any](/*247.19*/routes/*247.25*/.Assets.at("app/scripts/controllers/dues.js"))),format.raw/*247.70*/(""""></script>
    <script src=""""),_display_(Seq[Any](/*248.19*/routes/*248.25*/.Assets.at("app/scripts/controllers/calendar.js"))),format.raw/*248.74*/(""""></script>
    <script src=""""),_display_(Seq[Any](/*249.19*/routes/*249.25*/.Assets.at("app/scripts/controllers/docs.js"))),format.raw/*249.70*/(""""></script>
    <script src=""""),_display_(Seq[Any](/*250.19*/routes/*250.25*/.Assets.at("app/scripts/controllers/photos.js"))),format.raw/*250.72*/(""""></script>
    <script src=""""),_display_(Seq[Any](/*251.19*/routes/*251.25*/.Assets.at("app/scripts/controllers/recipes.js"))),format.raw/*251.73*/(""""></script>
    <script src=""""),_display_(Seq[Any](/*252.19*/routes/*252.25*/.Assets.at("app/scripts/controllers/recipes.new.js"))),format.raw/*252.77*/(""""></script>
    <script src=""""),_display_(Seq[Any](/*253.19*/routes/*253.25*/.Assets.at("app/scripts/controllers/recipes.club.js"))),format.raw/*253.78*/(""""></script>
    <script src=""""),_display_(Seq[Any](/*254.19*/routes/*254.25*/.Assets.at("app/scripts/controllers/club.js"))),format.raw/*254.70*/(""""></script>
    <script src=""""),_display_(Seq[Any](/*255.19*/routes/*255.25*/.Assets.at("app/scripts/controllers/friends.js"))),format.raw/*255.73*/(""""></script>
    <script src=""""),_display_(Seq[Any](/*256.19*/routes/*256.25*/.Assets.at("app/scripts/controllers/messages.js"))),format.raw/*256.74*/(""""></script>
    <script src=""""),_display_(Seq[Any](/*257.19*/routes/*257.25*/.Assets.at("app/scripts/controllers/newsitem.js"))),format.raw/*257.74*/(""""></script>
    <script src=""""),_display_(Seq[Any](/*258.19*/routes/*258.25*/.Assets.at("app/scripts/controllers/forummessage.js"))),format.raw/*258.78*/(""""></script>
    <script src=""""),_display_(Seq[Any](/*259.19*/routes/*259.25*/.Assets.at("app/scripts/controllers/store.js"))),format.raw/*259.71*/(""""></script>
    <script src=""""),_display_(Seq[Any](/*260.19*/routes/*260.25*/.Assets.at("app/scripts/controllers/home.js"))),format.raw/*260.70*/(""""></script>
    <script src=""""),_display_(Seq[Any](/*261.19*/routes/*261.25*/.Assets.at("app/scripts/controllers/feedback.js"))),format.raw/*261.74*/(""""></script>
    <script src=""""),_display_(Seq[Any](/*262.19*/routes/*262.25*/.Assets.at("app/scripts/controllers/message.js"))),format.raw/*262.73*/(""""></script>
    <script src=""""),_display_(Seq[Any](/*263.19*/routes/*263.25*/.Assets.at("app/scripts/controllers/usercalendar.js"))),format.raw/*263.78*/(""""></script>
    <script src=""""),_display_(Seq[Any](/*264.19*/routes/*264.25*/.Assets.at("app/scripts/controllers/recipedetails.js"))),format.raw/*264.79*/(""""></script>
    <script src=""""),_display_(Seq[Any](/*265.19*/routes/*265.25*/.Assets.at("app/scripts/controllers/friend.recipes.js"))),format.raw/*265.80*/(""""></script>
    <script src=""""),_display_(Seq[Any](/*266.19*/routes/*266.25*/.Assets.at("app/scripts/services.js"))),format.raw/*266.62*/(""""></script>
    <!-- endbuild -->
</body>
</html>
"""))}
    }
    
    def render(message:String): play.api.templates.HtmlFormat.Appendable = apply(message)
    
    def f:((String) => play.api.templates.HtmlFormat.Appendable) = (message) => apply(message)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Jun 16 14:50:52 EDT 2014
                    SOURCE: /Users/topher/Sites/hopburp21/app/views/authenticated.scala.html
                    HASH: ab40cf5cc99098083de25e9df7c3bb04d8dcbf8a
                    MATRIX: 782->1|893->18|1647->736|1662->742|1752->809|1827->848|1842->854|1919->909|1994->948|2009->954|2096->1018|2268->1154|2283->1160|2378->1232|2450->1276|2479->1277|2515->1285|2544->1286|2636->1342|2651->1348|2706->1381|2778->1425|2807->1426|2843->1434|2872->1435|2970->1497|2985->1503|3046->1542|4452->2920|4481->2921|4510->2922|4545->2929|4574->2930|4603->2931|4693->2992|4723->2993|4753->2994|4797->3009|4827->3010|4857->3011|6949->5075|6978->5076|7007->5077|7062->5103|7092->5104|7122->5105|7570->5524|7600->5525|7630->5526|7690->5557|7720->5558|7750->5559|8266->6046|8296->6047|8326->6048|8369->6062|8399->6063|8429->6064|8459->6065|8489->6066|8519->6067|8562->6080|8593->6081|8624->6082|9308->6737|9338->6738|9368->6739|9414->6756|9444->6757|9474->6758|9597->6852|9627->6853|9657->6854|9706->6874|9736->6875|9766->6876|12674->9755|12704->9756|12783->9806|12813->9807|12885->9850|12915->9851|13080->9988|13109->9989|13344->10187|13360->10193|13438->10248|13505->10278|13521->10284|13601->10341|13748->10451|13764->10457|13838->10508|13905->10538|13921->10544|13997->10597|14064->10627|14080->10633|14168->10698|14235->10728|14251->10734|14345->10805|14412->10835|14428->10841|14520->10910|14587->10940|14603->10946|14697->11017|14764->11047|14780->11053|14868->11118|14935->11148|14951->11154|15047->11227|15114->11257|15130->11263|15206->11316|15273->11346|15289->11352|15361->11401|15428->11431|15444->11437|15521->11491|15588->11521|15604->11527|15696->11596|15763->11626|15779->11632|15863->11693|15930->11723|15946->11729|16029->11789|16096->11819|16112->11825|16211->11900|16278->11930|16294->11936|16380->11999|16447->12029|16463->12035|16556->12105|16623->12135|16639->12141|16748->12226|16815->12256|16831->12262|16930->12337|16997->12367|17013->12373|17098->12435|17165->12465|17181->12471|17282->12548|17386->12623|17416->12624|17453->12632|17483->12633|17563->12676|17579->12682|17634->12714|17701->12744|17717->12750|17787->12797|17854->12827|17870->12833|17940->12880|18007->12910|18023->12916|18095->12965|18162->12995|18178->13001|18256->13056|18323->13086|18339->13092|18410->13140|18477->13170|18493->13176|18565->13225|18632->13255|18648->13261|18718->13308|18785->13338|18801->13344|18871->13391|18938->13421|18954->13427|19022->13472|19089->13502|19105->13508|19176->13556|19243->13586|19259->13592|19327->13637|19394->13667|19410->13673|19482->13722|19549->13752|19565->13758|19633->13803|19700->13833|19716->13839|19786->13886|19853->13916|19869->13922|19940->13970|20007->14000|20023->14006|20098->14058|20165->14088|20181->14094|20257->14147|20324->14177|20340->14183|20408->14228|20475->14258|20491->14264|20562->14312|20629->14342|20645->14348|20717->14397|20784->14427|20800->14433|20872->14482|20939->14512|20955->14518|21031->14571|21098->14601|21114->14607|21183->14653|21250->14683|21266->14689|21334->14734|21401->14764|21417->14770|21489->14819|21556->14849|21572->14855|21643->14903|21710->14933|21726->14939|21802->14992|21869->15022|21885->15028|21962->15082|22029->15112|22045->15118|22123->15173|22190->15203|22206->15209|22266->15246
                    LINES: 26->1|29->1|45->17|45->17|45->17|46->18|46->18|46->18|47->19|47->19|47->19|51->23|51->23|51->23|53->25|53->25|53->25|53->25|54->26|54->26|54->26|56->28|56->28|56->28|56->28|57->29|57->29|57->29|85->57|85->57|85->57|85->57|85->57|85->57|85->57|85->57|85->57|85->57|85->57|85->57|121->93|121->93|121->93|121->93|121->93|121->93|129->101|129->101|129->101|129->101|129->101|129->101|138->110|138->110|138->110|138->110|138->110|138->110|138->110|138->110|138->110|138->110|138->110|138->110|149->121|149->121|149->121|149->121|149->121|149->121|150->122|150->122|150->122|150->122|150->122|150->122|223->195|223->195|223->195|223->195|224->196|224->196|226->198|226->198|233->205|233->205|233->205|234->206|234->206|234->206|239->211|239->211|239->211|240->212|240->212|240->212|241->213|241->213|241->213|242->214|242->214|242->214|243->215|243->215|243->215|244->216|244->216|244->216|245->217|245->217|245->217|246->218|246->218|246->218|247->219|247->219|247->219|248->220|248->220|248->220|249->221|249->221|249->221|250->222|250->222|250->222|251->223|251->223|251->223|252->224|252->224|252->224|253->225|253->225|253->225|254->226|254->226|254->226|255->227|255->227|255->227|256->228|256->228|256->228|257->229|257->229|257->229|258->230|258->230|258->230|259->231|259->231|259->231|263->235|263->235|263->235|263->235|264->236|264->236|264->236|265->237|265->237|265->237|266->238|266->238|266->238|267->239|267->239|267->239|268->240|268->240|268->240|269->241|269->241|269->241|270->242|270->242|270->242|271->243|271->243|271->243|272->244|272->244|272->244|273->245|273->245|273->245|274->246|274->246|274->246|275->247|275->247|275->247|276->248|276->248|276->248|277->249|277->249|277->249|278->250|278->250|278->250|279->251|279->251|279->251|280->252|280->252|280->252|281->253|281->253|281->253|282->254|282->254|282->254|283->255|283->255|283->255|284->256|284->256|284->256|285->257|285->257|285->257|286->258|286->258|286->258|287->259|287->259|287->259|288->260|288->260|288->260|289->261|289->261|289->261|290->262|290->262|290->262|291->263|291->263|291->263|292->264|292->264|292->264|293->265|293->265|293->265|294->266|294->266|294->266
                    -- GENERATED --
                */
            