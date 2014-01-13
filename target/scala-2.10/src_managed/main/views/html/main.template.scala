
package views.html

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import play.api.i18n._
import play.api.mvc._
import play.api.data._
import views.html._
/**/
object main extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[String,Html,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(title: String)(content: Html):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.32*/("""
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <title>"""),_display_(Seq[Any](/*6.17*/title)),format.raw/*6.22*/("""</title>
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*7.54*/routes/*7.60*/.Assets.at("stylesheets/style.css"))),format.raw/*7.95*/("""">
        <script type="text/javascript" src=""""),_display_(Seq[Any](/*8.46*/routes/*8.52*/.Assets.at("javascripts/jquery-1.10.2.js"))),format.raw/*8.94*/(""""></script>
		<script type="text/javascript" src=""""),_display_(Seq[Any](/*9.40*/routes/*9.46*/.Assets.at("javascripts/d3.js"))),format.raw/*9.77*/(""""></script>
		<script type="text/javascript" src=""""),_display_(Seq[Any](/*10.40*/routes/*10.46*/.Assets.at("javascripts/data.json"))),format.raw/*10.81*/(""""></script>
		<script type="text/javascript" src=""""),_display_(Seq[Any](/*11.40*/routes/*11.46*/.Assets.at("javascripts/map1.js"))),format.raw/*11.79*/(""""></script>
    </head>
    <body>
        <div id="header">
			<div id="header-content">
				<div id="himg_home">
				</div>
				<div id="htxt">Insurance BigData Generator</div>
				<div id="menu">
					<a href=""""),_display_(Seq[Any](/*20.16*/controllers/*20.27*/.routes.Application.index())),format.raw/*20.54*/("""">Home</a>
				 	<a href=""""),_display_(Seq[Any](/*21.17*/controllers/*21.28*/.routes.Persons.generateForm())),format.raw/*21.58*/("""">Generator</a>
				 	<a href=""""),_display_(Seq[Any](/*22.17*/controllers/*22.28*/.routes.Persons.add())),format.raw/*22.49*/("""">Add</a> 
				 	<a href=""""),_display_(Seq[Any](/*23.17*/controllers/*23.28*/.routes.Persons.show())),format.raw/*23.50*/("""">Database</a> 	
				</div>
			</div>
		</div>
		
		<div>
			"""),_display_(Seq[Any](/*29.5*/content)),format.raw/*29.12*/("""
		</div>
    </body>
</html>"""))}
    }
    
    def render(title:String,content:Html): play.api.templates.HtmlFormat.Appendable = apply(title)(content)
    
    def f:((String) => (Html) => play.api.templates.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Jan 12 19:40:39 CET 2014
                    SOURCE: /home/aleksander/projects/playProjects/BigDataProject/app/views/main.scala.html
                    HASH: 0bf34613d49fae86fe5de974a55bb05af0493ce7
                    MATRIX: 560->1|684->31|858->170|884->175|981->237|995->243|1051->278|1134->326|1148->332|1211->374|1297->425|1311->431|1363->462|1450->513|1465->519|1522->554|1609->605|1624->611|1679->644|1929->858|1949->869|1998->896|2061->923|2081->934|2133->964|2201->996|2221->1007|2264->1028|2327->1055|2347->1066|2391->1088|2488->1150|2517->1157
                    LINES: 19->1|22->1|27->6|27->6|28->7|28->7|28->7|29->8|29->8|29->8|30->9|30->9|30->9|31->10|31->10|31->10|32->11|32->11|32->11|41->20|41->20|41->20|42->21|42->21|42->21|43->22|43->22|43->22|44->23|44->23|44->23|50->29|50->29
                    -- GENERATED --
                */
            