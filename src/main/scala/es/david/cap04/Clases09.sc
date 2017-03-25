package es.david.cap04

object Clases09 {

  // queremos inicializar una variable asi:
  // var x=
  case class Person(var username: String, var password: String) {

    var age = 0
    var firstName = ""
    var lastName = ""
    var address = None: Option[Address]
  }
  case class Address(city: String, state: String, zip: String)

  val p = Person("alvinalexander", "secret")      //> p  : es.david.cap04.Clases09.Person = Person(alvinalexander,secret)
  //p.address = Some(Address("Talkeetna", "AK", "99676"))

  p.address.foreach { a =>
    println(a.city)
    println(a.state)
    println(a.zip)
  }
  println(p.address)                              //> None
}