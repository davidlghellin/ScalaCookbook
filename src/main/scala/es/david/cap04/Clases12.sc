package es.david.cap04

object Clases12 {

  // ¿cuando tengo que usar clases abstractas?ya que tenemos en Scala los traits y son mas flexibles
  // (1) quieres crear una clases base que requiere un consstructor con parametros
  // (2) codigo llamado desde Java

  //(1)
  // trait Animal (name: String) //traits or objects may not have parameters
  abstract class Animal(nombre: String)

  // las clases abstractas actuan como en Java, por eso se puede llamar
  // puedes declarar metodos para luego implementar
  abstract class Animal2(nombre: String) {
    def decir
  }

  //class Perro(nombre: String) extends Animal2(nombre){}
  //error: class Perro needs to be abstract, since method decir in class Animal2 of type => Unit is not defined

  class Perro2(nombre: String) extends Animal2(nombre) {
    override def decir = println("Guau")
  }
  val p = new Perro2("Koki")                      //> p  : es.david.cap04.Clases12.Perro2 = es.david.cap04.Clases12$Perro2@78e03bb
                                                  //| 5
	p.decir                                   //> Guau
}