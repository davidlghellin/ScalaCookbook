package es.david.cap03

object EstructurasControl01 {
  //queremos iterar sobre una coleccion
  val frutas = Array("platano", "pera", "manzana")//> frutas  : Array[String] = Array(platano, pera, manzana)

  for (f <- frutas) println(f)                    //> platano
                                                  //| pera
                                                  //| manzana

  // si nuestro algoritmo necesita de multiples lineas podemos encerrarlo entre llaves
  for (f <- frutas) {
    val fr = f.toUpperCase()
    println(fr)
  }                                               //> PLATANO
                                                  //| PERA
                                                  //| MANZANA

  // si queremos devolver valores desde un bucle
  val newArray = for (e <- frutas) yield e.toUpperCase()
                                                  //> newArray  : Array[String] = Array(PLATANO, PERA, MANZANA)
  // si tenemos mas lineas en nuestro algoritmo usaremos llaves despues de 'yield'

  val newArray2 = for (e <- frutas) yield {
    val s = e.toUpperCase()
    s
  }                                               //> newArray2  : Array[String] = Array(PLATANO, PERA, MANZANA)

  // si necesitamos acceder al iterador
  for (i <- 0 until frutas.length) {
    println(s"$i es: ${frutas(i)}")               //> 0 es: platano
                                                  //| 1 es: pera
                                                  //| 2 es: manzana
  }

  //scala tiene una metodo que podemos usar para simular
  for ((elemento, indice) <- frutas.zipWithIndex) {
    println(s"$indice es: $elemento")             //> 0 es: platano
                                                  //| 1 es: pera
                                                  //| 2 es: manzana
  }

  // como podemos ver estamos iterando con el bucle for, tambien tenemos el foreach para las colecciones
  frutas.foreach(println)                         //> platano
                                                  //| pera
                                                  //| manzana
  // podemos usar las funciones anonimas
  frutas.foreach(f => println(f.toUpperCase()))   //> PLATANO
                                                  //| PERA
                                                  //| MANZANA
  // si tenemos más de una linea de nuestro algoritmo , lo cerraremos entre llaves
  frutas.foreach { f =>
    val s = f.toUpperCase()
    println(s)
  }                                               //> PLATANO
                                                  //| PERA
                                                  //| MANZANA
  //un bucle for, sera comvertido por el compilador por un foreach
  //por ejemplo
  for (i <- 0 to 10) println(i)                   //> 0
                                                  //| 1
                                                  //| 2
                                                  //| 3
                                                  //| 4
                                                  //| 5
                                                  //| 6
                                                  //| 7
                                                  //| 8
                                                  //| 9
                                                  //| 10
  //se convertira por el compilador en:
  1.to(10).foreach((i) => println(i))             //> 1
                                                  //| 2
                                                  //| 3
                                                  //| 4
                                                  //| 5
                                                  //| 6
                                                  //| 7
                                                  //| 8
                                                  //| 9
                                                  //| 10
  // guardas en las condiciones del for
  for {
    i <- 1 to 10
    if i % 2 == 0
  } println(i)                                    //> 2
                                                  //| 4
                                                  //| 6
                                                  //| 8
                                                  //| 10
  // se transformara por el compilador en:
  1.to(10).withFilter(((i) => i.$percent(2).$eq$eq(0))).foreach((i) => println(i))
                                                  //> 2
                                                  //| 4
                                                  //| 6
                                                  //| 8
                                                  //| 10
  for {
    i <- 1 to 10
    if i != 2
    if i % 2 == 0
  } println(i)                                    //> 4
                                                  //| 6
                                                  //| 8
                                                  //| 10

  //un yield internamente se convertira en un map, como veremos
  for (i <- 1 to 10) yield i                      //> res0: scala.collection.immutable.IndexedSeq[Int] = Vector(1, 2, 3, 4, 5, 6,
                                                  //|  7, 8, 9, 10)
  1.to(10).map(i => i)                            //> res1: scala.collection.immutable.IndexedSeq[Int] = Vector(1, 2, 3, 4, 5, 6,
                                                  //|  7, 8, 9, 10)
  // un for con guardas e yield tambien se transforma
  for {
    i <- 1 to 10
    if i % 2 == 0
  } yield i                                       //> res2: scala.collection.immutable.IndexedSeq[Int] = Vector(2, 4, 6, 8, 10)
  1.to(10).withFilter(((i) => i.$percent(2).$eq$eq(0))).map(((i) => i))
                                                  //> res3: scala.collection.immutable.IndexedSeq[Int] = Vector(2, 4, 6, 8, 10)
}