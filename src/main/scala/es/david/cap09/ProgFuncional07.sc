package es.david.cap09

object ProgFuncional07 {

  // Desea devolver una funcion desde una funcion o metodo

  // (s: String) => { prefix + " " + s }

  def saySomething(prefix: String) = (s: String) => {
    prefix + " " + s
  }                                               //> saySomething: (prefix: String)String => String
  
  val sayHello = saySomething("Hello")            //> sayHello  : String => String = <function1>
  sayHello("Al")                                  //> res0: String = Hello Al
  
  // Como podemos ver podemos partir la funcion en dos a partir de "="
  //  def saySomething(prefix: String)
  //  (s: String) => { prefix + " " + s }
}