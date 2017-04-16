package es.david.cap09

object PorgFuncional04 {

  // Quieres un metodo que toma una funcion como parametro
  // y que la funcion tiene uno o mas parametros de entrada y puede devolver un valor

  def exec(callback: Int => Unit) {
    // invoca a una funcion que recibe un parametro
    callback(1)
  }                                               //> exec: (callback: Int => Unit)Unit
  val sumaUno = (i: Int) => { println(i + 1) }    //> sumaUno  : Int => Unit = <function1>
  exec(sumaUno)                                   //> 2
  // Como la funcion es llamada desde dentro, imprime 2
  // Cualquier funcion con la misma signatura, podra ser llamada en el metodo
  val sumaDiez = (i: Int) => { println(i + 10) }  //> sumaDiez  : Int => Unit = <function1>
  exec(sumaDiez)                                  //> 11

  // Por lo tanto si queremos una funcion que toma un String y devuelve un Int
  // executeFunction(f:(String) => Int)
  // Podemos omitir los parentesis, ya que es solo un parametro
  // executeFunction(f:String => Int)

  // Podemos ver como pasar distintos tipos y devolver diversos tipos tambien
  // executeFunction(f: (Int, Int) => Boolean)
  // exec(f: (String, Int, Double) => Seq[String])
  // exec(f: (Int) => Unit)

  // Pasando una funcion con otros parametros
  val sayHello = () => println("Hello")           //> sayHello  : () => Unit = <function0>
  def executeXTimes(callback: () => Unit, numTimes: Int) {
    for (i <- 1 to numTimes) callback()
  }                                               //> executeXTimes: (callback: () => Unit, numTimes: Int)Unit
  executeXTimes(sayHello, 3)                      //> Hello
                                                  //| Hello
                                                  //| Hello

  // Veamos algo mas interesante, como tener varias funciones y hacer la llamada justo a la que queremos
  def executeAndPrint(f: (Int, Int) => Int, x: Int, y: Int) {
    val resultado = f(x, y)
    println(resultado)
  }                                               //> executeAndPrint: (f: (Int, Int) => Int, x: Int, y: Int)Unit
  val sum = (x: Int, y: Int) => x + y             //> sum  : (Int, Int) => Int = <function2>
  val multiply = (x: Int, y: Int) => x * y        //> multiply  : (Int, Int) => Int = <function2>

  executeAndPrint(sum, 2, 9)                      //> 11
  executeAndPrint(multiply, 3, 9)                 //> 27

  // Como podemos ver al metodo executeAndPrint, le pasamos 3 argumentos una funcion, y dos Int

  val isPar = (i: Int) => { i % 2 == 0 }          //> isPar  : Int => Boolean = <function1>
  def metodoIsPar(f: (Int) => Boolean,x:Int):Unit ={
    println(f(x))
  }                                               //> metodoIsPar: (f: Int => Boolean, x: Int)Unit
	metodoIsPar(isPar,2)                      //> true
	metodoIsPar(isPar,1)                      //> false

  /////////////////////
  // Otro ejemplo libro
  /////////////////////
  // 1 - define the method
  def exec2(callback: (Any, Any) => Unit, x: Any, y: Any) {
    callback(x, y)
  }                                               //> exec2: (callback: (Any, Any) => Unit, x: Any, y: Any)Unit
  // 2 - define a function to pass in
  val printTwoThings = (a: Any, b: Any) => {
    println(a)
    println(b)
  }                                               //> printTwoThings  : (Any, Any) => Unit = <function2>
  // 3 - pass the function and some parameters to the method
  case class Person(name: String)
  exec2(printTwoThings, "Hello", Person("Dave"))  //> Hello
                                                  //| Person(Dave)
}