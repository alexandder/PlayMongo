package controllers

import play.api.mvc.{ Action, Controller }
import models.Person
import play.api.mvc.Request
import org.omg.CosNaming.NamingContextPackage.NotFound
import play.api.data._
import play.api.data.Form
import play.api.data.Forms._
import play.api.i18n.Messages
import play.api.mvc.Flash
import models.Generator
import views.html.defaultpages.badRequest
import org.bson.types.ObjectId
import models.PersonDAO

object Persons extends Controller {

  def add = Action { implicit request =>
    Ok(views.html.persons.add(personForm))
  }

  def show = Action { implicit request =>
    val tenPersons = Person.getTwenty
    val personsNumber = Person.countPersons
    Ok(views.html.persons.show(tenPersons, personsNumber))
  }

  def generateForm = Action { implicit request =>
    val number = generatorForm.bindFromRequest.get
    val generatedPersons = Generator.generatePersons(number)
    for (person <- generatedPersons) yield Person.add(person)
    val tenPersons = Person.getTwenty
    val personsNumber = Person.countPersons
    Ok(views.html.persons.show(tenPersons, personsNumber))
  }

  def generate = Action { implicit request =>

    Ok(views.html.persons.generate(generatorForm))
  }

  def addForm = Action { implicit request =>
    personForm.bindFromRequest.fold(
      formWithErrors => BadRequest("Invalid data!"), 
      {
        case (name, lastName, sex, dateOfBirth, civilStatus, dateOfInsuranceSigning,
          dateOfInsuranceEnding, location, insuranceType, insurancePremium, insuranceValue) => {
        	val newPerson = new Person(new ObjectId, name, lastName, sex, dateOfBirth.toLocalDate().toString(), civilStatus, dateOfInsuranceSigning.toLocalDate().toString(),
          dateOfInsuranceEnding.toLocalDate().toString(), location, insuranceType, insurancePremium.toDouble, insuranceValue.toDouble)  
            PersonDAO.save(newPerson)
            val tenPersons = Person.getTwenty
            val personsNumber = Person.countPersons
            Ok(views.html.persons.show(tenPersons, personsNumber))
        }
      })
  }

  private val generatorForm = Form(
    "number" -> number)

  private val personForm = Form(
    tuple("name" -> nonEmptyText,
      "lastName" -> nonEmptyText,
      "sex" -> nonEmptyText,
      "dateOfBirth" -> jodaDate("yyyy-mm-dd"),
      "civilStatus" -> nonEmptyText,
      "dateOfInsuranceSigning" -> jodaDate("yyyy-mm-dd"),
      "dateOfInsuranceEnding" -> jodaDate("yyyy-mm-dd"),
      "location" -> nonEmptyText,
      "insuranceType" -> nonEmptyText,
      "insurancePremium" -> number,
      "insuranceValue" -> number))
}