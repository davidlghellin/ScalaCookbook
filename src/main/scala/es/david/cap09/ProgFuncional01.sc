package es.david.cap09

object ProgFuncional01 {

  // desea utilizar una funcion anonima conocida tb como funcion literal
  val x = List.range(1, 10)                       //> x  : List[Int] = List(1, 2, 3, 4, 5, 6, 7, 8, 9)

  // pasamos la funcion anonima es lo que contiene el metodo filter
  //(1)
  val evens = x.filter((i: Int) => i % 2 == 0)    //> evens  : List[Int] = List(2, 4, 6, 8)

  // aunque eso funciona, es la forma mas explicita de definirla
  // veamos una forma que es mas simple
  //(2)
  val evens2 = x.filter(_ % 2 == 0)               //> evens2  : List[Int] = List(2, 4, 6, 8)

  // como hemos visto en (1), definimos todos los parametros de la funcion que devuelve un booleano
  // estamos indicando que el parametro de entrada es un Int, como Scala puede inferir podiamos haber scrito
  // val evens = x.filter(i => i % 2 == 0)

  // (2) como podemos usar "_" esto nos simplifica mas aun el codigo

  //veamos otros ejemplos
  x.foreach((i: Int) => print(i + " "))           //> 1 2 3 4 5 6 7 8 9 
  x.foreach((i) => print(i + " "))                //> 1 2 3 4 5 6 7 8 9 
  x.foreach(i => print(i + " "))                  //> 1 2 3 4 5 6 7 8 9 
  x.foreach(print(_))                             //> 123456789
  x.foreach(println)                              //> 1
                                                  //| 2
                                                  //| 3
                                                  //| 4
                                                  //| 5
                                                  //| 6
                                                  //| 7
                                                  //| 8
                                                  //| 9
}