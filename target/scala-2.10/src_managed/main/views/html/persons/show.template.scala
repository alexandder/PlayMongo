
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
object show extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template3[List[Person],Int,Lang,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(persons: List[Person], personsNumber: Int)(implicit lang: Lang):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.66*/("""

"""),_display_(Seq[Any](/*3.2*/main(Messages("application.name"))/*3.36*/ {_display_(Seq[Any](format.raw/*3.38*/("""
	<br/>
	<div class="personsNumber">
		<h2>
			Actually, there are """),_display_(Seq[Any](/*7.25*/personsNumber)),format.raw/*7.38*/(""" persons in the database. Here are some of them: 
		</h2>
	</div>
	<br/>
	<table class="personsTable">
		<tr>
			<th>"""),_display_(Seq[Any](/*13.9*/Messages("name"))),format.raw/*13.25*/("""</th>
			<th>"""),_display_(Seq[Any](/*14.9*/Messages("lastName"))),format.raw/*14.29*/("""</th>
			<th>"""),_display_(Seq[Any](/*15.9*/Messages("sex"))),format.raw/*15.24*/("""</th>
			<th>"""),_display_(Seq[Any](/*16.9*/Messages("dateOfBirth"))),format.raw/*16.32*/("""</th>
			<th>"""),_display_(Seq[Any](/*17.9*/Messages("civilStatus"))),format.raw/*17.32*/("""</th>
			<th>"""),_display_(Seq[Any](/*18.9*/Messages("dateOfInsuranceSigning"))),format.raw/*18.43*/("""</th>
			<th>"""),_display_(Seq[Any](/*19.9*/Messages("dateOfInsuranceEnding"))),format.raw/*19.42*/("""</th>
			<th>"""),_display_(Seq[Any](/*20.9*/Messages("location"))),format.raw/*20.29*/("""</th>
			<th>"""),_display_(Seq[Any](/*21.9*/Messages("insuranceType"))),format.raw/*21.34*/("""</th>
			<th>"""),_display_(Seq[Any](/*22.9*/Messages("insurancePremium"))),format.raw/*22.37*/("""</th>
			<th>"""),_display_(Seq[Any](/*23.9*/Messages("insuranceValue"))),format.raw/*23.35*/("""</th>
		</tr>
		"""),_display_(Seq[Any](/*25.4*/for(person <- persons) yield /*25.26*/ {_display_(Seq[Any](format.raw/*25.28*/("""
			<tr>
				<td>"""),_display_(Seq[Any](/*27.10*/person/*27.16*/.name)),format.raw/*27.21*/("""</td>			
				<td>"""),_display_(Seq[Any](/*28.10*/person/*28.16*/.lastName)),format.raw/*28.25*/("""</td>		
				<td>"""),_display_(Seq[Any](/*29.10*/person/*29.16*/.sex)),format.raw/*29.20*/("""</td>			
				<td>"""),_display_(Seq[Any](/*30.10*/person/*30.16*/.dateOfBirth)),format.raw/*30.28*/("""</td>			
				<td>"""),_display_(Seq[Any](/*31.10*/person/*31.16*/.civilStatus)),format.raw/*31.28*/("""</td>
				<td>"""),_display_(Seq[Any](/*32.10*/person/*32.16*/.dateOfInsuranceSigning)),format.raw/*32.39*/("""</td>
				<td>"""),_display_(Seq[Any](/*33.10*/person/*33.16*/.dateOfInsuranceEnding)),format.raw/*33.38*/("""</td>
				<td>"""),_display_(Seq[Any](/*34.10*/person/*34.16*/.location)),format.raw/*34.25*/("""</td>
				<td>"""),_display_(Seq[Any](/*35.10*/person/*35.16*/.insuranceType)),format.raw/*35.30*/("""</td>				
				<td>"""),_display_(Seq[Any](/*36.10*/person/*36.16*/.insurancePremium)),format.raw/*36.33*/("""</td>
				<td>"""),_display_(Seq[Any](/*37.10*/person/*37.16*/.insuranceValue)),format.raw/*37.31*/("""</td>
			</tr>
			""")))})),format.raw/*39.5*/("""
	
	</table>
	
	""")))})))}
    }
    
    def render(persons:List[Person],personsNumber:Int,lang:Lang): play.api.templates.HtmlFormat.Appendable = apply(persons,personsNumber)(lang)
    
    def f:((List[Person],Int) => (Lang) => play.api.templates.HtmlFormat.Appendable) = (persons,personsNumber) => (lang) => apply(persons,personsNumber)(lang)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Jan 13 00:42:00 CET 2014
                    SOURCE: /home/aleksander/projects/playProjects/BigDataProject/app/views/persons/show.scala.html
                    HASH: c49c4f507e179c7a81698dadd66317a741e8a813
                    MATRIX: 578->1|736->65|773->68|815->102|854->104|957->172|991->185|1144->303|1182->319|1231->333|1273->353|1322->367|1359->382|1408->396|1453->419|1502->433|1547->456|1596->470|1652->504|1701->518|1756->551|1805->565|1847->585|1896->599|1943->624|1992->638|2042->666|2091->680|2139->706|2191->723|2229->745|2269->747|2323->765|2338->771|2365->776|2419->794|2434->800|2465->809|2518->826|2533->832|2559->836|2613->854|2628->860|2662->872|2716->890|2731->896|2765->908|2816->923|2831->929|2876->952|2927->967|2942->973|2986->995|3037->1010|3052->1016|3083->1025|3134->1040|3149->1046|3185->1060|3240->1079|3255->1085|3294->1102|3345->1117|3360->1123|3397->1138|3447->1157
                    LINES: 19->1|22->1|24->3|24->3|24->3|28->7|28->7|34->13|34->13|35->14|35->14|36->15|36->15|37->16|37->16|38->17|38->17|39->18|39->18|40->19|40->19|41->20|41->20|42->21|42->21|43->22|43->22|44->23|44->23|46->25|46->25|46->25|48->27|48->27|48->27|49->28|49->28|49->28|50->29|50->29|50->29|51->30|51->30|51->30|52->31|52->31|52->31|53->32|53->32|53->32|54->33|54->33|54->33|55->34|55->34|55->34|56->35|56->35|56->35|57->36|57->36|57->36|58->37|58->37|58->37|60->39
                    -- GENERATED --
                */
            