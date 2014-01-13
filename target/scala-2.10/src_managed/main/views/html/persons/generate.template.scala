
package views.html.persons

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
object generate extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[Form[Int],Lang,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(generateForm: Form[Int])(implicit lang: Lang):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._


Seq[Any](format.raw/*1.48*/("""

"""),format.raw/*4.1*/("""
"""),_display_(Seq[Any](/*5.2*/main(Messages("persons.generate"))/*5.36*/ {_display_(Seq[Any](format.raw/*5.38*/("""
	 
	"""),_display_(Seq[Any](/*7.3*/helper/*7.9*/.form(action = routes.Persons.generateForm())/*7.54*/ {_display_(Seq[Any](format.raw/*7.56*/("""
			"""),_display_(Seq[Any](/*8.5*/helper/*8.11*/.inputText(generateForm("number"), '_label -> Messages("persons.generate.number"), '_showConstraints -> false))),format.raw/*8.121*/("""
		
			<p>
				<input type="submit" value='"""),_display_(Seq[Any](/*11.34*/Messages("persons.generate.submit"))),format.raw/*11.69*/("""' />
			</p>	
		""")))})),format.raw/*13.4*/("""
	
	""")))})),format.raw/*15.3*/("""
"""))}
    }
    
    def render(generateForm:Form[Int],lang:Lang): play.api.templates.HtmlFormat.Appendable = apply(generateForm)(lang)
    
    def f:((Form[Int]) => (Lang) => play.api.templates.HtmlFormat.Appendable) = (generateForm) => (lang) => apply(generateForm)(lang)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Jan 13 01:13:52 CET 2014
                    SOURCE: /home/aleksander/projects/playProjects/BigDataProject/app/views/persons/generate.scala.html
                    HASH: 1817106e8ca261e9f234646145bb818c6f05ed8f
                    MATRIX: 575->1|731->47|759->66|795->68|837->102|876->104|916->110|929->116|982->161|1021->163|1060->168|1074->174|1206->284|1286->328|1343->363|1391->380|1427->385
                    LINES: 19->1|23->1|25->4|26->5|26->5|26->5|28->7|28->7|28->7|28->7|29->8|29->8|29->8|32->11|32->11|34->13|36->15
                    -- GENERATED --
                */
            