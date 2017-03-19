package es.david.cap03

object EstructurasControl08 {
  // multiples casos en el match

  val i = 8                                       //> i  : Int = 8
  i match {
    case 1 | 3 | 5 | 7 | 9 => println("impar")
    case 2 | 4 | 6 | 8     => println("par")
    case _                 => println("no definido")
  }                                               //> par

  trait Command
  case object Start extends Command
  case object Go extends Command
  case object Stop extends Command
  case object Whoa extends Command
  def ejecutaComandos(cmd: Command) = cmd match {
    case Start | Go  => println("go()")
    case Stop | Whoa => println("stop()")
  }                                               //> ejecutaComandos: (cmd: es.david.cap03.EstructurasControl08.Command)Unit
  
  trait Coche {
		val nombre:String
  }
  class Audi extends Coche{
  	val nombre:String = "Audi"
  }
  class BMV extends Coche{
  	val nombre:String = "BMV"
  }
  def cocheExe(car: Coche) = car match {
    case bmv:BMV  => println(bmv.nombre)
    case audi:Audi  => println(audi.nombre)
  }                                               //> cocheExe: (car: es.david.cap03.EstructurasControl08.Coche)Unit
  cocheExe(new BMV)                               //> BMV
  cocheExe(new Audi)                              //> Audi
}