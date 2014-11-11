
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
object verify_email extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(emailVerifyLink: String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.27*/("""

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
	<h1>Please verify your email!</h1>
	<p>
	Hey there!
	</p>
	<p>
	We've detected that you recently used this email to register an account on HopBurp!
	If this wasn't you, safely dispose of this message.
	</p>
	<p>
	To verify your email address, click the link below!
	</p>
	<p>
	<a href=""""),_display_(Seq[Any](/*56.12*/emailVerifyLink)),format.raw/*56.27*/("""">"""),_display_(Seq[Any](/*56.30*/emailVerifyLink)),format.raw/*56.45*/("""</a>
	</p>
</div>
</body>
</html>
"""))}
    }
    
    def render(emailVerifyLink:String): play.api.templates.HtmlFormat.Appendable = apply(emailVerifyLink)
    
    def f:((String) => play.api.templates.HtmlFormat.Appendable) = (emailVerifyLink) => apply(emailVerifyLink)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Jun 12 22:47:47 EDT 2014
                    SOURCE: /Users/topher/Sites/hopburp21/app/views/email/verify_email.scala.html
                    HASH: b93ff683337727a1d63ad4ba7fe4f07d9a597f4b
                    MATRIX: 787->1|906->26|1319->411|1348->412|1386->422|1415->423|1450->431|1478->432|1608->533|1638->534|1688->556|1717->557|1756->568|1785->569|1932->687|1962->688|2009->706|2039->707|2090->730|2119->731|2220->804|2249->805|2286->815|2314->816|2410->884|2439->885|2476->895|2505->896|2545->908|2574->909|2617->924|2646->925|2688->939|2717->940|2750->946|2778->947|2820->961|2849->962|2904->989|2933->990|2985->1014|3014->1015|3081->1054|3110->1055|3161->1078|3190->1079|3300->1161|3329->1162|3384->1190|3412->1191|3528->1279|3557->1280|3616->1312|3644->1313|3684->1325|3713->1326|3767->1352|3796->1353|3832->1362|3861->1363|3960->1434|3989->1435|4021->1440|4049->1441|4091->1455|4120->1456|4501->1801|4538->1816|4577->1819|4614->1834
                    LINES: 26->1|29->1|38->10|38->10|38->10|38->10|39->11|39->11|39->11|39->11|41->13|41->13|41->13|41->13|42->14|42->14|42->14|42->14|44->16|44->16|44->16|44->16|46->18|46->18|46->18|46->18|47->19|47->19|47->19|47->19|48->20|48->20|48->20|48->20|50->22|50->22|50->22|50->22|52->24|52->24|52->24|52->24|54->26|54->26|54->26|54->26|56->28|56->28|58->30|58->30|60->32|60->32|62->34|62->34|63->35|63->35|63->35|63->35|64->36|64->36|64->36|64->36|65->37|65->37|65->37|65->37|84->56|84->56|84->56|84->56
                    -- GENERATED --
                */
            