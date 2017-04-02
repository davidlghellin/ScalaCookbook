package es.david.cap05

object Metodos02 {
  //queremos llamar a metodos de la clase padre, usaremos super como en Java

  class AnimalCuatroPatas {
    def andar { println("I'm walking") }
    def correr { println("I'm running") }
  }

  class Perro extends AnimalCuatroPatas {
    def andarCorrer {
      super.andar
      super.correr
    }
  }

  val p = new Perro                               //> p  : es.david.cap05.Metodos02.Perro = es.david.cap05.Metodos02$Perro@deb6432
                                                  //| 
  p.andarCorrer                                   //> I'm walking
                                                  //| I'm running

  // si estamos heredando de multiples traits, podemos definir de cual

  trait Humano {
    def hola = "the Human trait"
  }
  trait Madre extends Humano {
    override def hola = "Mother"
  }
  trait Padre extends Humano {
    override def hola = "Father"
  }

  class Hijo extends Humano with Madre with Padre {
    def printSuper = super.hola
    def printMadre = super[Madre].hola
    def printPadre = super[Padre].hola
    def printHumano = super[Humano].hola
  }
  val c = new Hijo                                //> c  : es.david.cap05.Metodos02.Hijo = es.david.cap05.Metodos02$$anonfun$main$
                                                  //| 1$Hijo$1@880ec60
  println(s"c.printSuper = ${c.printSuper}")      //> c.printSuper = Father
  println(s"c.printMother = ${c.printMadre}")     //> c.printMother = Mother
  println(s"c.printFather = ${c.printPadre}")     //> c.printFather = Father
  println(s"c.printHuman = ${c.printHumano}")     //> c.printHuman = the Human trait

}