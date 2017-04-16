package es.david.cap09

object PorgFuncional05 {
  // Closures
  // Desea pasar una funcion como una variable, y mientras lo hace, quiere que
  // la funcion para poder referirse a uno o mas campos que estuvieran en la misma
  // funcion cuando se declaro.
  class Foo {
    // a method that takes a function and a string, and passes the string into
    // the function, and then executes the function
    def exec(f: (String) => Unit, name: String) {
      f(name)
    }
  }

  var hello = "Hello"                             //> hello  : String = Hello
  def sayHello(name: String) { println(s"$hello, $name") }
                                                  //> sayHello: (name: String)Unit
  // execute sayHello from the exec method foo
  val foo = new Foo                               //> foo  : es.david.cap09.PorgFuncional05.Foo = es.david.cap09.PorgFuncional05$F
                                                  //| oo@30c7da1e
  foo.exec(sayHello, "Al")                        //> Hello, Al
  // change the local variable 'hello', then execute sayHello from
  // the exec method of foo, and see what happens
  hello = "Hola"
  foo.exec(sayHello, "Lorenzo")                   //> Hola, Lorenzo

  ///////////////////////////////////////
  val isOfVotingAge = (age: Int) => age >= 18     //> isOfVotingAge  : Int => Boolean = <function1>
  isOfVotingAge(16) // false                      //> res0: Boolean = false
  isOfVotingAge(20) // true                       //> res1: Boolean = true

  // La siguiente variable sera la que usaremos en la clausura
  var votingAge = 18                              //> votingAge  : Int = 18
  val isOfVotingAge2 = (age: Int) => age >= votingAge
                                                  //> isOfVotingAge2  : Int => Boolean = <function1>
  isOfVotingAge2(16)                              //> res2: Boolean = false
  isOfVotingAge2(20)                              //> res3: Boolean = true
  def printResult(f: Int => Boolean, x: Int) {
    println(f(x))
  }                                               //> printResult: (f: Int => Boolean, x: Int)Unit
  printResult(isOfVotingAge2, 20)                 //> true
  votingAge = 21
  // the change to votingAge affects the result
  printResult(isOfVotingAge2, 20)                 //> false

  ////////////////////////
  // Usando closures con otros tipos de datos
  import scala.collection.mutable.ArrayBuffer
  val fruits = ArrayBuffer("manzanas")            //> fruits  : scala.collection.mutable.ArrayBuffer[String] = ArrayBuffer(manzan
                                                  //| as)
  // Funcion para anyadir a la cesta frutas
  val addToBasket = (s: String) => {
    fruits += s
    println(fruits.mkString(", "))
  }                                               //> addToBasket  : String => Unit = <function1>
  def buyStuff(f: String => Unit, s: String): Unit = {
    f(s)
  }                                               //> buyStuff: (f: String => Unit, s: String)Unit
  buyStuff(addToBasket, "platanos")               //> manzanas, platanos
  buyStuff(addToBasket, "uvas")                   //> manzanas, platanos, uvas
}