package es.david.cap04

object Clases13 {

  // queremos definir propiedades en una clase abastracta o trait, a la que puedan hacer referencia las clases hijas
  abstract class Mascota(nombre: String) {
    val saludo: String
    var edad: Int
    def diHola { println(saludo) }
    override def toString = s"yo digo $saludo, y tengo $edad anyos"
  }

  class Perro(nombre: String) extends Mascota(nombre) {
    val saludo = "guau"
    var edad = 2
  }
  class Gato(nombre: String) extends Mascota(nombre) {
    val saludo = "miau"
    var edad = 2
  }

  val p = new Perro("koki")                       //> p  : es.david.cap04.Clases13.Perro = yo digo guau, y tengo 2 anyos
  p.diHola                                        //> guau
  val g = new Gato("katy")                        //> g  : es.david.cap04.Clases13.Gato = yo digo miau, y tengo 2 anyos
  g.diHola                                        //> miau
  
  
  // cuando defines un campo en una clase abstracta o trait, el compilador de Scala , solo generara lso metodos asociados a var o val
}