
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
object index extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[String,play.api.templates.HtmlFormat.Appendable] {

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
    <link rel="stylesheet" href=""""),_display_(Seq[Any](/*14.35*/routes/*14.41*/.Assets.at("app/bower_components/bootstrap/dist/css/bootstrap.css"))),format.raw/*14.108*/("""" />
    <link rel="stylesheet" href=""""),_display_(Seq[Any](/*15.35*/routes/*15.41*/.Assets.at("app/bower_components/font-awesome/css/font-awesome.min.css"))),format.raw/*15.113*/("""">
    <link rel="stylesheet" href=""""),_display_(Seq[Any](/*16.35*/routes/*16.41*/.Assets.at("app/styles/main.css"))),format.raw/*16.74*/("""">
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
      <!-- Jumbotron -->
      <div class="jumbotron" style="width: 1200px; margin: auto;">
        <h1>Join Hopburp!</h1>
        <p class="lead">Save all your homebrew scoresheets here!</p>
        <p><a class="btn btn-lg btn-success" href="/login" role="button">Get started today</a></p>
      </div>

      <!-- Example row of columns -->
      <div class="row" style="width: 1200px; margin: auto;">
        <div class="col-lg-4">
          <h2>Upload your recipes</h2>
          </p>
            It doesn't matter where you have your recipes saved, (beersmith, brewtoad, etc.). Just type in the link to your recipe
            and keep sending us your homebrew scores.
          </p>
        </div>
        <div class="col-lg-4">
          <h2>Improve your brewing skills</h2>
          <p>We keep track of when you get awards for your homebrews and a graph of all your scores!</p>
       </div>
        <div class="col-lg-4">
          <h2>Decide the fate of Hopburp</h2>
          <p>
            This is only a prototype. If you want any improvements or cool features, continually sending us feedback
            will bend Hopburp to your will. Something not working? Something amiss? Give us your ideas!
          </p>
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
       (function(i,s,o,g,r,a,m)"""),format.raw/*91.32*/("""{"""),format.raw/*91.33*/("""i['GoogleAnalyticsObject']=r;i[r]=i[r]||function()"""),format.raw/*91.83*/("""{"""),format.raw/*91.84*/("""
       (i[r].q=i[r].q||[]).push(arguments)"""),format.raw/*92.43*/("""}"""),format.raw/*92.44*/(""",i[r].l=1*new Date();a=s.createElement(o),
       m=s.getElementsByTagName(o)[0];a.async=1;a.src=g;m.parentNode.insertBefore(a,m)
       """),format.raw/*94.8*/("""}"""),format.raw/*94.9*/(""")(window,document,'script','//www.google-analytics.com/analytics.js','ga');

       ga('create', 'UA-XXXXX-X');
       ga('send', 'pageview');
    </script>
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
                    DATE: Mon Jun 16 15:07:06 EDT 2014
                    SOURCE: /Users/topher/Sites/hopburp21/app/views/index.scala.html
                    HASH: 9d495331de8616a8422c17fbc438b27a16d180f8
                    MATRIX: 774->1|885->18|1497->594|1512->600|1602->667|1677->706|1692->712|1787->784|1860->821|1875->827|1930->860|4903->3805|4932->3806|5010->3856|5039->3857|5110->3900|5139->3901|5303->4038|5331->4039
                    LINES: 26->1|29->1|42->14|42->14|42->14|43->15|43->15|43->15|44->16|44->16|44->16|119->91|119->91|119->91|119->91|120->92|120->92|122->94|122->94
                    -- GENERATED --
                */
            