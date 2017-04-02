package es.david.cap06

object Objetos09 {

  // problema de la factory

  trait Animal {
    def speak
  }
  object Animal {
    private class Dog extends Animal {
      override def speak { println("woof") }
    }
    private class Cat extends Animal {
      override def speak { println("meow") }
    }
    // the factory method
    def apply(s: String): Animal = {
      if (s == "dog") new Dog
      else new Cat
    }
  }

  val cat = Animal("cat")                         //> cat  : es.david.cap06.Objetos09.Animal = es.david.cap06.Objetos09$Animal$Cat
                                                  //| @deb6432
  val dog = Animal("dog")                         //> dog  : es.david.cap06.Objetos09.Animal = es.david.cap06.Objetos09$Animal$Dog
                                                  //| @880ec60
}