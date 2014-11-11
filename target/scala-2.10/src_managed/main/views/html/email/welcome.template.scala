
package views.html.email

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
object welcome extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(loginUrl: String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.20*/("""

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<meta name="viewport" content="width=device-width, initial-scale=1.0"/>
	<title>HopBurp Correspondence</title>
	<style type="text/css">
		#outlook a """),format.raw/*10.14*/("""{"""),format.raw/*10.15*/("""padding:0;"""),format.raw/*10.25*/("""}"""),format.raw/*10.26*/("""
		body"""),format.raw/*11.7*/("""{"""),format.raw/*11.8*/("""width:100% !important; -webkit-text-size-adjust:100%; -ms-text-size-adjust:100%; margin:0; padding:0;"""),format.raw/*11.109*/("""}"""),format.raw/*11.110*/("""

		.ExternalClass """),format.raw/*13.18*/("""{"""),format.raw/*13.19*/("""width:100%;"""),format.raw/*13.30*/("""}"""),format.raw/*13.31*/("""
		.ExternalClass, .ExternalClass p, .ExternalClass span, .ExternalClass font, .ExternalClass td, .ExternalClass div """),format.raw/*14.117*/("""{"""),format.raw/*14.118*/("""line-height: 100%;"""),format.raw/*14.136*/("""}"""),format.raw/*14.137*/("""

		#backgroundTable """),format.raw/*16.20*/("""{"""),format.raw/*16.21*/("""margin:0; padding:0; width:100% !important; line-height: 100% !important;"""),format.raw/*16.94*/("""}"""),format.raw/*16.95*/("""

		img """),format.raw/*18.7*/("""{"""),format.raw/*18.8*/("""outline:none; text-decoration:none; -ms-interpolation-mode: bicubic;"""),format.raw/*18.76*/("""}"""),format.raw/*18.77*/("""
		a img """),format.raw/*19.9*/("""{"""),format.raw/*19.10*/("""border:none;"""),format.raw/*19.22*/("""}"""),format.raw/*19.23*/("""
		.image_fix """),format.raw/*20.14*/("""{"""),format.raw/*20.15*/("""display:block;"""),format.raw/*20.29*/("""}"""),format.raw/*20.30*/("""

		p """),format.raw/*22.5*/("""{"""),format.raw/*22.6*/("""margin: 1em 0;"""),format.raw/*22.20*/("""}"""),format.raw/*22.21*/("""

		h1, h2, h3, h4, h5, h6 """),format.raw/*24.26*/("""{"""),format.raw/*24.27*/("""color: black !important;"""),format.raw/*24.51*/("""}"""),format.raw/*24.52*/("""

		h1 a, h2 a, h3 a, h4 a, h5 a, h6 a """),format.raw/*26.38*/("""{"""),format.raw/*26.39*/("""color: blue !important;"""),format.raw/*26.62*/("""}"""),format.raw/*26.63*/("""

		h1 a:active, h2 a:active,  h3 a:active, h4 a:active, h5 a:active, h6 a:active """),format.raw/*28.81*/("""{"""),format.raw/*28.82*/("""
		color: red !important;
		"""),format.raw/*30.3*/("""}"""),format.raw/*30.4*/("""

		h1 a:visited, h2 a:visited,  h3 a:visited, h4 a:visited, h5 a:visited, h6 a:visited """),format.raw/*32.87*/("""{"""),format.raw/*32.88*/("""
		color: purple !important;
		"""),format.raw/*34.3*/("""}"""),format.raw/*34.4*/("""
		table td """),format.raw/*35.12*/("""{"""),format.raw/*35.13*/("""border-collapse: collapse;"""),format.raw/*35.39*/("""}"""),format.raw/*35.40*/("""
		table """),format.raw/*36.9*/("""{"""),format.raw/*36.10*/(""" border-collapse:collapse; mso-table-lspace:0pt; mso-table-rspace:0pt; """),format.raw/*36.81*/("""}"""),format.raw/*36.82*/("""
		a """),format.raw/*37.5*/("""{"""),format.raw/*37.6*/("""color: orange;"""),format.raw/*37.20*/("""}"""),format.raw/*37.21*/("""


	</style>
</head>
<body>
<div style="margin: 30px">
	<h1>Welcome!</h1>
	<p>
	Hey there!
	</p>
	<p>
	We want to take this time to thank you for joining HopBurp! We have ton of amazing resources
	for homebrewers. We want you to stay as long as humanly possible, so if there is anything we
	can do to make your stay a little more enjoyable, please use the feedback form on HopBurp.com!
	</p>
	<p>
	Click the link below to log in!
	</p>
	<p>
	<a href=""""),_display_(Seq[Any](/*57.12*/loginUrl)),format.raw/*57.20*/("""">"""),_display_(Seq[Any](/*57.23*/loginUrl)),format.raw/*57.31*/("""</a>
	</p>
</div>
</body>
</html>
"""))}
    }
    
    def render(loginUrl:String): play.api.templates.HtmlFormat.Appendable = apply(loginUrl)
    
    def f:((String) => play.api.templates.HtmlFormat.Appendable) = (loginUrl) => apply(loginUrl)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Jun 12 22:47:47 EDT 2014
                    SOURCE: /Users/topher/Sites/hopburp21/app/views/email/welcome.scala.html
                    HASH: 8da0fcb1ad0fed44e3b21717543c5ed440d4e271
                    MATRIX: 782->1|894->19|1306->403|1335->404|1373->414|1402->415|1436->422|1464->423|1594->524|1624->525|1671->544|1700->545|1739->556|1768->557|1914->674|1944->675|1991->693|2021->694|2070->715|2099->716|2200->789|2229->790|2264->798|2292->799|2388->867|2417->868|2453->877|2482->878|2522->890|2551->891|2593->905|2622->906|2664->920|2693->921|2726->927|2754->928|2796->942|2825->943|2880->970|2909->971|2961->995|2990->996|3057->1035|3086->1036|3137->1059|3166->1060|3276->1142|3305->1143|3360->1171|3388->1172|3504->1260|3533->1261|3591->1292|3619->1293|3659->1305|3688->1306|3742->1332|3771->1333|3807->1342|3836->1343|3935->1414|3964->1415|3996->1420|4024->1421|4066->1435|4095->1436|4583->1888|4613->1896|4652->1899|4682->1907
                    LINES: 26->1|29->1|38->10|38->10|38->10|38->10|39->11|39->11|39->11|39->11|41->13|41->13|41->13|41->13|42->14|42->14|42->14|42->14|44->16|44->16|44->16|44->16|46->18|46->18|46->18|46->18|47->19|47->19|47->19|47->19|48->20|48->20|48->20|48->20|50->22|50->22|50->22|50->22|52->24|52->24|52->24|52->24|54->26|54->26|54->26|54->26|56->28|56->28|58->30|58->30|60->32|60->32|62->34|62->34|63->35|63->35|63->35|63->35|64->36|64->36|64->36|64->36|65->37|65->37|65->37|65->37|85->57|85->57|85->57|85->57
                    -- GENERATED --
                */
            