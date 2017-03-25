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

  ///////////////////
  // tenemos que eliminar el uso de null, para ello tenemos los Option
  trait Animal {
    val greeting: Option[String]
    var age: Option[Int] = None
    override def toString = s"I say $greeting, and I'm $age years old."
  }
  class Dog extends Animal {
    val greeting = Some("Woof")
    age = Some(2)
  }

  class DogNull extends Animal {
    val greeting = Some("Woof")
  }
  val d = new Dog                                 //> d  : es.david.cap04.Clases13.Dog = I say Some(Woof), and I'm Some(2) years 
                                                  //| old.
  println(d)                                      //> I say Some(Woof), and I'm Some(2) years old.
 
 
  val dNull = new DogNull                         //> dNull  : es.david.cap04.Clases13.DogNull = I say Some(Woof), and I'm None y
                                                  //| ears old.

  // como podemos ver tenemos no dara error de NullPointer
  println(dNull)                                  //> I say Some(Woof), and I'm None years old.
  println(dNull.age)                              //> None
  if(dNull.age == None) println("Es none")        //> Es none
}