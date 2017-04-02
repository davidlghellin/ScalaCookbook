package es.david.cap06

object Objetos04 extends App {

  // queremos empezar con un metodo main, o un acceso a un script
  if (args.length == 1)
    println(s"Hello, ${args(0)}")
  else
    println("I didn't get your name.")
  def main(args: Array[String]) {
    println("Hello, world")
  }
}

object Objetos04b {
  def main(args: Array[String]) {
    println("Hello, world")
  }
}