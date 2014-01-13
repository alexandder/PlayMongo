
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
object add extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[Form[scala.Tuple11[String, String, String, org.joda.time.DateTime, String, org.joda.time.DateTime, org.joda.time.DateTime, String, String, Int, Int]],Lang,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(personForm: Form[(String,String,String,org.joda.time.DateTime,String,org.joda.time.DateTime,org.joda.time.DateTime,String,String,Int,Int)])(implicit lang: Lang):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.163*/(""" 

"""),_display_(Seq[Any](/*3.2*/main(Messages("persons.add"))/*3.31*/ {_display_(Seq[Any](format.raw/*3.33*/("""
	
	
	<div id="content">
		<div id="map">

		</div>
	<div id="formDiv">
		<form id="addForm" name="personForm" method="post" action=""""),_display_(Seq[Any](/*11.63*/controllers/*11.74*/.routes.Persons.addForm())),format.raw/*11.99*/("""">
			<table class="formTable">
				<tbody>
					<tr>
						<td>Name</td>
						<td><input name="name" type="text"></td>
					</tr>
					<tr>
						<td>Surname</td>
						<td><input name="lastName" type="text"></td>
					</tr>
					<tr>
						<td>Sex</td>
						<td>Male<input name="sex" value="male" checked="checked"
							type="radio"> Female<input name="sex" value="female"
							type="radio"></td>
					</tr>
					<tr>
						<td>Date of birth</td>
						<td><input name="dateOfBirth" type="date"></td>
					</tr>
					<!--<tr>
							<td>Personal identity number</td>
							<td><input type="text" name="pin" /></td>
						</tr> -->
					<tr>
						<td>Civil status</td>
						<td><select name="civilStatus">
								<option selected value="Single">Single</option>
								<option value="Married">Married</option>
								<option value="Widowed">Widowed</option>
								<option value="Separated">Separated</option>
								<option value="Divorced">Divorced</option>
						</select></td>
					</tr>
					<tr>
						<td>Date of sign insurance</td>
						<td><input name="dateOfInsuranceSigning" type="date"></td>
					</tr>
					<tr>
						<td>Date of insurance end</td>
						<td><input name="dateOfInsuranceEnding" type="date"></td>
					</tr>
					<tr>
						<td>Location</td>
						<td><input name="location" id="location_input"
							value="Select location on the map"
							type="text"></td>
					</tr>
					<tr>
						<td>Type of insurance</td>
						<td><select name="insuranceType">
								<option selected="selected" value="Health">Health</option>
								<option value="Life">Life</option>
								<option value="Casualty">Casualty</option>
								<option value="Car">Car</option>
						</select></td>
					</tr>
					<tr>
						<td>Insurance premium</td>
						<td><input name="insurancePremium" type="text"> €</td>
					</tr>
					<tr>
						<td>Insurance value</td>
						<td><input name="insuranceValue" type="text"> €</td>
					</tr>
				</tbody>
			</table>
			<input value="Add" type="submit"> <input value="Reset"
				type="reset">
		</form>
	</div>
</div>
			<script type="text/javascript">
				draw2();
			</script>
""")))})))}
    }
    
    def render(personForm:Form[scala.Tuple11[String, String, String, org.joda.time.DateTime, String, org.joda.time.DateTime, org.joda.time.DateTime, String, String, Int, Int]],lang:Lang): play.api.templates.HtmlFormat.Appendable = apply(personForm)(lang)
    
    def f:((Form[scala.Tuple11[String, String, String, org.joda.time.DateTime, String, org.joda.time.DateTime, org.joda.time.DateTime, String, String, Int, Int]]) => (Lang) => play.api.templates.HtmlFormat.Appendable) = (personForm) => (lang) => apply(personForm)(lang)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Jan 12 19:40:39 CET 2014
                    SOURCE: /home/aleksander/projects/playProjects/BigDataProject/app/views/persons/add.scala.html
                    HASH: 9a3dcea5334cb7b83585b1322875520ba6aa1da8
                    MATRIX: 710->1|966->162|1004->166|1041->195|1080->197|1250->331|1270->342|1317->367
                    LINES: 19->1|22->1|24->3|24->3|24->3|32->11|32->11|32->11
                    -- GENERATED --
                */
            