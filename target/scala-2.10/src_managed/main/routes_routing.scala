// @SOURCE:/home/aleksander/projects/playProjects/BigDataProject/conf/routes
// @HASH:4fffa7c98e8451e521236601ea48c7db1a732ad9
// @DATE:Sun Jan 12 19:40:38 CET 2014


import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._


import Router.queryString

object Routes extends Router.Routes {

private var _prefix = "/"

def setPrefix(prefix: String) {
  _prefix = prefix
  List[(String,Routes)]().foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" }


// @LINE:6
private[this] lazy val controllers_Application_index0 = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
        

// @LINE:9
private[this] lazy val controllers_Assets_at1 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
        

// @LINE:12
private[this] lazy val controllers_Application_home2 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("home"))))
        

// @LINE:14
private[this] lazy val controllers_Persons_generate3 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("persons/generate"))))
        

// @LINE:16
private[this] lazy val controllers_Persons_generateForm4 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("persons/generate"))))
        

// @LINE:18
private[this] lazy val controllers_Persons_add5 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("persons/add"))))
        

// @LINE:20
private[this] lazy val controllers_Persons_addForm6 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("persons/add"))))
        

// @LINE:22
private[this] lazy val controllers_Persons_show7 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("persons/show"))))
        
def documentation = List(("""GET""", prefix,"""controllers.Application.index"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """home""","""controllers.Application.home"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """persons/generate""","""controllers.Persons.generate"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """persons/generate""","""controllers.Persons.generateForm"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """persons/add""","""controllers.Persons.add"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """persons/add""","""controllers.Persons.addForm"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """persons/show""","""controllers.Persons.show""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]] 
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:6
case controllers_Application_index0(params) => {
   call { 
        invokeHandler(controllers.Application.index, HandlerDef(this, "controllers.Application", "index", Nil,"GET", """ Home page""", Routes.prefix + """"""))
   }
}
        

// @LINE:9
case controllers_Assets_at1(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
   }
}
        

// @LINE:12
case controllers_Application_home2(params) => {
   call { 
        invokeHandler(controllers.Application.home, HandlerDef(this, "controllers.Application", "home", Nil,"GET", """""", Routes.prefix + """home"""))
   }
}
        

// @LINE:14
case controllers_Persons_generate3(params) => {
   call { 
        invokeHandler(controllers.Persons.generate, HandlerDef(this, "controllers.Persons", "generate", Nil,"GET", """""", Routes.prefix + """persons/generate"""))
   }
}
        

// @LINE:16
case controllers_Persons_generateForm4(params) => {
   call { 
        invokeHandler(controllers.Persons.generateForm, HandlerDef(this, "controllers.Persons", "generateForm", Nil,"POST", """""", Routes.prefix + """persons/generate"""))
   }
}
        

// @LINE:18
case controllers_Persons_add5(params) => {
   call { 
        invokeHandler(controllers.Persons.add, HandlerDef(this, "controllers.Persons", "add", Nil,"GET", """""", Routes.prefix + """persons/add"""))
   }
}
        

// @LINE:20
case controllers_Persons_addForm6(params) => {
   call { 
        invokeHandler(controllers.Persons.addForm, HandlerDef(this, "controllers.Persons", "addForm", Nil,"POST", """""", Routes.prefix + """persons/add"""))
   }
}
        

// @LINE:22
case controllers_Persons_show7(params) => {
   call { 
        invokeHandler(controllers.Persons.show, HandlerDef(this, "controllers.Persons", "show", Nil,"GET", """""", Routes.prefix + """persons/show"""))
   }
}
        
}

}
     