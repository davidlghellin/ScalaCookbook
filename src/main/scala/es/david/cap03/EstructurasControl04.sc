package es.david.cap03

object EstructurasControl04 {
  // for Comprehension (combinacion for/yiel)

  //queremos crear una nueva coleccion de una coleccion existente, aplicando un algoritmo a cada elemento
  val nombres = Array("chris", "ed", "maurice")   //> nombres  : Array[String] = Array(chris, ed, maurice)

  val nombresMayusculas = for (e <- nombres) yield e.capitalize
                                                  //> nombresMayusculas  : Array[String] = Array(Chris, Ed, Maurice)
  val frutas = "manzana" :: "platano" :: "naranja" :: Nil
                                                  //> frutas  : List[String] = List(manzana, platano, naranja)
  val out = for (e <- frutas) yield e.toUpperCase //> out  : List[String] = List(MANZANA, PLATANO, NARANJA)

	// como podemos ver el uso de map, es lo mismo que la union de for/yield
  val salidaMap = frutas.map(_.toUpperCase)       //> salidaMap  : List[String] = List(MANZANA, PLATANO, NARANJA)

	// por eso mismo podemos usar map cuando queramos la convinacion
}