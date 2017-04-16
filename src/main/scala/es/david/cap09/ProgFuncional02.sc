package es.david.cap09

object ProgFuncional02 {

  // queremos pasar una funcion como si fuera una variable (Strin, int ....)
  // podemos pensar "=>" como un transformador

  val doble = (i: Int) => { i * 2 }               //> doble  : Int => Int = <function1>
  doble(2)                                        //> res0: Int = 4
  doble(3)                                        //> res1: Int = 6

  // podemos usar el map, para asignar el valor de las funciones creadas
  val list = List.range(1, 5)                     //> list  : List[Int] = List(1, 2, 3, 4)
  list.map(doble)                                 //> res2: List[Int] = List(2, 4, 6, 8)

  // Podemos definir una funcion, con valores implicitos del lado derecho, ya que el compilador lo infiere
  val f = (i: Int) => { i % 2 == 0 }              //> f  : Int => Boolean = <function1>
  val f2: (Int) => Boolean = i => { i % 2 == 0 }  //> f2  : Int => Boolean = <function1>
  val f3: Int => Boolean = i => { i % 2 == 0 }    //> f3  : Int => Boolean = <function1>
  val f4: Int => Boolean = i => i % 2 == 0        //> f4  : Int => Boolean = <function1>
  val f5: Int => Boolean = _ % 2 == 0             //> f5  : Int => Boolean = <function1>

  // En el siguiente ejemplo podemos ver la diferencia de los enfoques
  // implicit approach
  val addImplicit = (x: Int, y: Int) => { x + y } //> addImplicit  : (Int, Int) => Int = <function2>
  // explicit approach
  val addExplicit: (Int, Int) => Int = (x, y) => { x + y }
                                                  //> addExplicit  : (Int, Int) => Int = <function2>

  // Usaremos def para definir metodo
  // Usaremos val para definir una funcion
}