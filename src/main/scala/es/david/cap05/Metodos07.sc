package es.david.cap05

object Metodos07 {
  // queremos un metodo que recibe un numero variable de parametros, como si fuera un array
  def printAll(strings: String*) {
    strings.foreach(println)
  }                                               //> printAll: (strings: String*)Unit
  printAll()
  printAll("foo")                                 //> foo
  printAll("foo", "bar")                          //> foo
                                                  //| bar
  printAll("foo", "bar", "baz")                   //> foo
                                                  //| bar
                                                  //| baz

  val fruits = List("apple", "banana", "cherry")  //> fruits  : List[String] = List(apple, banana, cherry)
  printAll(fruits: _*)                            //> apple
                                                  //| banana
                                                  //| cherry
	//en este caso podemos ver que usamos foreach, que seria lo mismo que usar el for(i<-array) println
}