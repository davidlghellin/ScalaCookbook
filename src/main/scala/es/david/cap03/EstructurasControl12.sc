package es.david.cap03

object EstructurasControl12 {

  // deseas coincidir una clase o un objeto, como con los actores y los mensajes en concurrencia

  def determinarTipo(x: Animal): String = x match {
    case Perro(moniker) => "Tengo un Perro, name = " + moniker
    case _: Gato        => "Tengo un Gato (ignoramos nombre)"
    case Woodpecker     => "That was a Woodpecker"
    case _              => "That was something else"
  }                                               //> determinarTipo: (x: es.david.cap03.Animal)String

  println(determinarTipo(new Perro("Rocky")))     //> Tengo un Perro, name = Rocky
  println(determinarTipo(new Gato("Rusty the Cat")))
                                                  //> Tengo un Gato (ignoramos nombre)
  println(determinarTipo(Woodpecker))             //> That was a Woodpecker
}

trait Animal
case class Perro(name: String) extends Animal
case class Gato(name: String) extends Animal
case object Woodpecker extends Animal