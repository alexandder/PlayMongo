// @SOURCE:/home/aleksander/projects/playProjects/BigDataProject/conf/routes
// @HASH:4fffa7c98e8451e521236601ea48c7db1a732ad9
// @DATE:Sun Jan 12 19:40:38 CET 2014

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._


import Router.queryString


// @LINE:22
// @LINE:20
// @LINE:18
// @LINE:16
// @LINE:14
// @LINE:12
// @LINE:9
// @LINE:6
package controllers {

// @LINE:9
class ReverseAssets {
    

// @LINE:9
def at(file:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                
    
}
                          

// @LINE:22
// @LINE:20
// @LINE:18
// @LINE:16
// @LINE:14
class ReversePersons {
    

// @LINE:14
def generate(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "persons/generate")
}
                                                

// @LINE:22
def show(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "persons/show")
}
                                                

// @LINE:18
def add(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "persons/add")
}
                                                

// @LINE:16
def generateForm(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "persons/generate")
}
                                                

// @LINE:20
def addForm(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "persons/add")
}
                                                
    
}
                          

// @LINE:12
// @LINE:6
class ReverseApplication {
    

// @LINE:12
def home(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "home")
}
                                                

// @LINE:6
def index(): Call = {
   Call("GET", _prefix)
}
                                                
    
}
                          
}
                  


// @LINE:22
// @LINE:20
// @LINE:18
// @LINE:16
// @LINE:14
// @LINE:12
// @LINE:9
// @LINE:6
package controllers.javascript {

// @LINE:9
class ReverseAssets {
    

// @LINE:9
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        
    
}
              

// @LINE:22
// @LINE:20
// @LINE:18
// @LINE:16
// @LINE:14
class ReversePersons {
    

// @LINE:14
def generate : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Persons.generate",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "persons/generate"})
      }
   """
)
                        

// @LINE:22
def show : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Persons.show",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "persons/show"})
      }
   """
)
                        

// @LINE:18
def add : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Persons.add",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "persons/add"})
      }
   """
)
                        

// @LINE:16
def generateForm : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Persons.generateForm",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "persons/generate"})
      }
   """
)
                        

// @LINE:20
def addForm : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Persons.addForm",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "persons/add"})
      }
   """
)
                        
    
}
              

// @LINE:12
// @LINE:6
class ReverseApplication {
    

// @LINE:12
def home : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.home",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "home"})
      }
   """
)
                        

// @LINE:6
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
   """
)
                        
    
}
              
}
        


// @LINE:22
// @LINE:20
// @LINE:18
// @LINE:16
// @LINE:14
// @LINE:12
// @LINE:9
// @LINE:6
package controllers.ref {


// @LINE:9
class ReverseAssets {
    

// @LINE:9
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      
    
}
                          

// @LINE:22
// @LINE:20
// @LINE:18
// @LINE:16
// @LINE:14
class ReversePersons {
    

// @LINE:14
def generate(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Persons.generate(), HandlerDef(this, "controllers.Persons", "generate", Seq(), "GET", """""", _prefix + """persons/generate""")
)
                      

// @LINE:22
def show(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Persons.show(), HandlerDef(this, "controllers.Persons", "show", Seq(), "GET", """""", _prefix + """persons/show""")
)
                      

// @LINE:18
def add(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Persons.add(), HandlerDef(this, "controllers.Persons", "add", Seq(), "GET", """""", _prefix + """persons/add""")
)
                      

// @LINE:16
def generateForm(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Persons.generateForm(), HandlerDef(this, "controllers.Persons", "generateForm", Seq(), "POST", """""", _prefix + """persons/generate""")
)
                      

// @LINE:20
def addForm(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Persons.addForm(), HandlerDef(this, "controllers.Persons", "addForm", Seq(), "POST", """""", _prefix + """persons/add""")
)
                      
    
}
                          

// @LINE:12
// @LINE:6
class ReverseApplication {
    

// @LINE:12
def home(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.home(), HandlerDef(this, "controllers.Application", "home", Seq(), "GET", """""", _prefix + """home""")
)
                      

// @LINE:6
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Seq(), "GET", """ Home page""", _prefix + """""")
)
                      
    
}
                          
}
        
    