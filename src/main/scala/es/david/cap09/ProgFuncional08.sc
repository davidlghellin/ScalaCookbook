package es.david.cap09

object ProgFuncional {
  // Creando funciones parciales
  // Desea crear unas funciones que solamente funcionaran con un subconjunto de valores
  // y otras funciones que funciona con otro subconjunto
  // y desea combinar esas funciones para resolver completamente el problema

  // Ejemplo simple
  val divideMal = (x: Int) => 42 / x              //> divideMal  : Int => Int = <function1>
  //divide2(0)
  val divide = new PartialFunction[Int, Int] {
    def apply(x: Int) = 42 / x
    def isDefinedAt(x: Int) = x != 0
  }                                               //> divide  : PartialFunction[Int,Int] = <function1>

  // Podiamos haber definido que se lanzara una excepcion, pero asi podemos indicar explicitamente cuando el parametro no es cero
  divide.isDefinedAt(1)                           //> res0: Boolean = true
  if (divide.isDefinedAt(1)) divide(1)            //> res1: AnyVal = 42
  divide.isDefinedAt(0)                           //> res2: Boolean = false

  // Mientras que la funcion anterior es explicita
  // las funciones parciales se escriben a menudo utilizando casos
  // Aunque esta forma no implementa isDefinedAt, se implementa implicitamente
  val divide2: PartialFunction[Int, Int] = {
    case d: Int if d != 0 => 42 / d
  }                                               //> divide2  : PartialFunction[Int,Int] = <function1>
  divide2.isDefinedAt(1)                          //> res3: Boolean = true
  divide2.isDefinedAt(0)                          //> res4: Boolean = false

  ///////
  // La signatura de PartialFuntion es:
  //trait PartialFunction[-A, +B] extends (A) => B
  val convertLowNumToString = new PartialFunction[Int, String] {
    val nums = Array("one", "two", "three", "four", "five")
    def apply(i: Int) = nums(i - 1)
    def isDefinedAt(i: Int) = i > 0 && i < 6
  }                                               //> convertLowNumToString  : PartialFunction[Int,String]{val nums: Array[String
                                                  //| ]} = <function1>
  convertLowNumToString(3)                        //> res5: String = three

  // Una caracteristica fantastica es que puede anidar
  val convert1to5 = new PartialFunction[Int, String] {
    val nums = Array("one", "two", "three", "four", "five")
    def apply(i: Int) = nums(i - 1)
    def isDefinedAt(i: Int) = i > 0 && i < 6
  }                                               //> convert1to5  : PartialFunction[Int,String]{val nums: Array[String]} = <func
                                                  //| tion1>
  val convert6to10 = new PartialFunction[Int, String] {
    val nums = Array("six", "seven", "eight", "nine", "ten")
    def apply(i: Int) = nums(i - 6)
    def isDefinedAt(i: Int) = i > 5 && i < 11
  }                                               //> convert6to10  : PartialFunction[Int,String]{val nums: Array[String]} = <fun
                                                  //| ction1>
  val handle1to10 = convert1to5 orElse convert6to10
                                                  //> handle1to10  : PartialFunction[Int,String] = <function1>
  handle1to10(3)                                  //> res6: String = three
  handle1to10(8)                                  //> res7: String = eight

  ///////////////////
  //List(0,1,2) map { divide } //fallaria
  List(0, 1, 2) collect { divide }                //> res8: List[Int] = List(42, 21)
  // Esto se debe a que el método collect se escribe para probar el método isDefinedAt para cada
  // elemento que se da. Como resultado, no ejecuta el algoritmo de división cuando el valor de entrada
  // es 0 (pero lo ejecuta para cada otro elemento).
  List(42, "cat") collect { case i: Int => i + 1 }//> res9: List[Int] = List(43)

  val sample = 1 to 5                             //> sample  : scala.collection.immutable.Range.Inclusive = Range(1, 2, 3, 4, 5)
                                                  //| 
  val isEven: PartialFunction[Int, String] = {
    case x if x % 2 == 0 => x + " is even"
  }                                               //> isEven  : PartialFunction[Int,String] = <function1>
  val evenNumbers = sample collect isEven         //> evenNumbers  : scala.collection.immutable.IndexedSeq[String] = Vector(2 is 
                                                  //| even, 4 is even)
}