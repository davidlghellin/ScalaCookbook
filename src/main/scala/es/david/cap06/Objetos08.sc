package es.david.cap06

object Objetos08 {

  // quieres no tener que poner new, al crear nuevas variables
  // val a = Array(Person("John"), Person("Paul"))

  // tenemos dos formas de hacer esto:
  // (1)creando un "compinion object"(objeto complementario) y definiendo apply
  // (2)case class

  //(1)
  class Person {
    var name: String = _
    var age = 0
  }
  object Person {
    def apply(name: String): Person = {
      var p = new Person
      p.name = name
      p
    }
    // a two-arg constructor
    def apply(name: String, age: Int): Person = {
      var p = new Person
      p.name = name
      p.age = age
      p
    }
  }

  val p = Person("David")                         //> p  : es.david.cap06.Objetos08.Person = es.david.cap06.Objetos08$Person@694f9
                                                  //| 431
  val a = Array(Person("Dan"), Person("Elijah"))  //> a  : Array[es.david.cap06.Objetos08.Person] = Array(es.david.cap06.Objetos08
                                                  //| $Person@60f82f98, es.david.cap06.Objetos08$Person@35f983a6)
  val p2 = new Person                             //> p2  : es.david.cap06.Objetos08.Person = es.david.cap06.Objetos08$Person@6108
                                                  //| b2d7
  //(2)
  case class PersonCaseClass(var name: String)
  val pCase = PersonCaseClass("Fred Flinstone")   //> pCase  : es.david.cap06.Objetos08.PersonCaseClass = PersonCaseClass(Fred Fli
                                                  //| nstone)

  ////////////////////////////////
  /**
   * scala> :paste
   * // Entering paste mode (ctrl-D to finish)
   *
   * case class PersonCaseClass2(var name: String, var age: Int)
   * val ee= PersonCaseClass2("Dav",3)
   * object PersonCaseClass2 {
   * def apply() = new PersonCaseClass2("<no name>", 0)
   * def apply(name: String) = new PersonCaseClass2(name, 0)
   * }
   *
   * // Exiting paste mode, now interpreting.
   *
   * defined class PersonCaseClass2
   * ee: PersonCaseClass2 = PersonCaseClass2(Dav,3)
   * defined object PersonCaseClass2
   *
   * scala>     val a = PersonCaseClass2()
   * a: PersonCaseClass2 = PersonCaseClass2(<no name>,0)
   *
   * scala> val b = PersonCaseClass2("Al")
   * b: PersonCaseClass2 = PersonCaseClass2(Al,0)
   *
   * scala> val c = PersonCaseClass2("William Shatner", 82)
   * c: PersonCaseClass2 = PersonCaseClass2(William Shatner,82)
   *
   * }
   */
}