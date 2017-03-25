package es.david.cap04

object Clases06
{

  // quieres sobreescribir los getters y los setters que genera implicitamente scala por defecto
  //esto no es normal hacerlo y Scala no nos dejara y tendremos que hacer unas cosas

  class Person(private var _name: String)
  {
    def name = _name // accessor
    def name_=(aName: String) { _name = aName } // mutator
  }
  
  val p = new Person("Jonathan")                  //> p  : es.david.cap04.Clases06.Person = es.david.cap04.Clases06$Person@78e03bb
                                                  //| 5
  println(p.name)                                 //> Jonathan

  p.name = "Jony"
  println(p.name)                                 //> Jony
}