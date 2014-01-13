
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
object home extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Lang,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/()(implicit lang: Lang):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.25*/("""

"""),_display_(Seq[Any](/*3.2*/main("Home")/*3.14*/ {_display_(Seq[Any](format.raw/*3.16*/("""
		<div id="content">
			<div id="textContent">
				<h1>Welcome to the Insurance Big Data Generator!</h1> 
				<p style="margin-left: 30px;">What you want to do?</p>
				<p>
				</p
				><ul style="margin-left: 40px;">
					<li><a href=""""),_display_(Seq[Any](/*11.20*/controllers/*11.31*/.routes.Persons.generate)),format.raw/*11.55*/("""">I want to automatically generate big amount of data.</a></li>
					<li><a href=""""),_display_(Seq[Any](/*12.20*/controllers/*12.31*/.routes.Persons.add)),format.raw/*12.50*/("""">I want to manually add data to database.</a></li>
					<li><a href=""""),_display_(Seq[Any](/*13.20*/controllers/*13.31*/.routes.Persons.show)),format.raw/*13.51*/("""">I want to see what's in database.</a></li>
				</ul>
			</div>
		</div>
	
	
	""")))})))}
    }
    
    def render(lang:Lang): play.api.templates.HtmlFormat.Appendable = apply()(lang)
    
    def f:(() => (Lang) => play.api.templates.HtmlFormat.Appendable) = () => (lang) => apply()(lang)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Jan 12 19:40:39 CET 2014
                    SOURCE: /home/aleksander/projects/playProjects/BigDataProject/app/views/home.scala.html
                    HASH: 841ab5efb385a990f6953742ceeaff3788198727
                    MATRIX: 553->1|670->24|707->27|727->39|766->41|1040->279|1060->290|1106->314|1225->397|1245->408|1286->427|1393->498|1413->509|1455->529
                    LINES: 19->1|22->1|24->3|24->3|24->3|32->11|32->11|32->11|33->12|33->12|33->12|34->13|34->13|34->13
                    -- GENERATED --
                */
            