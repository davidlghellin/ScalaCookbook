package es.david.cap03

object EstructurasControl03 {
  //quieres anñadir una o mas condiciones en el bucle
  for (i <- 1 to 10 if i % 2 == 0) println(i)     //> 2
                                                  //| 4
                                                  //| 6
                                                  //| 8
                                                  //| 10
  // o puedes usar las llaves
  for {
    i <- 1 to 10
    if i % 2 == 0
  } println(i)                                    //> 2
                                                  //| 4
                                                  //| 6
                                                  //| 8
                                                  //| 10
  // puedes poner todas las condiciones que quieras
  for {
    i <- 1 to 10
    if i > 3
    if i < 6
    if i % 2 == 0
  } println(i)                                    //> 4

  // puedes poner las condiciones y dentro del if lo que quieras hacer, pero es mejor hacerlo como antes
  for (i <- 1 to 10) {
    if (i > 3 && i < 6 && i % 2 == 0)
      println(i)                                  //> 4
  }

}