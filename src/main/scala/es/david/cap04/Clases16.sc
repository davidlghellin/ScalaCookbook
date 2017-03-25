package es.david.cap04

object Clases16 {

  // creacion de clases internas, para encapsular codigo
  class PandorasBox {
    case class Thing(name: String)
    var things = new collection.mutable.ArrayBuffer[Thing]()
    things += Thing("Evil Thing #1")
    things += Thing("Evil Thing #2")
    def addThing(name: String) { things += new Thing(name) }
  }

  val p = new PandorasBox                         //> p  : es.david.cap04.Clases16.PandorasBox = es.david.cap04.Clases16$PandorasB
                                                  //| ox@45fe3ee3
  p.things.foreach(println)                       //> Thing(Evil Thing #1)
                                                  //| Thing(Evil Thing #2)

  // el concepto de clase interna en Scala es diferente a Java
  class OuterClass {
    class InnerClass {
      var x = 1
    }
  }
  val oc1 = new OuterClass                        //> oc1  : es.david.cap04.Clases16.OuterClass = es.david.cap04.Clases16$$anonfun
                                                  //| $main$1$OuterClass$1@3796751b
  val oc2 = new OuterClass                        //> oc2  : es.david.cap04.Clases16.OuterClass = es.david.cap04.Clases16$$anonfun
                                                  //| $main$1$OuterClass$1@67b64c45
  val ic1 = new oc1.InnerClass                    //> ic1  : es.david.cap04.Clases16.oc1.InnerClass = es.david.cap04.Clases16$$ano
                                                  //| nfun$main$1$OuterClass$1$InnerClass@4411d970
  val ic2 = new oc2.InnerClass                    //> ic2  : es.david.cap04.Clases16.oc2.InnerClass = es.david.cap04.Clases16$$ano
                                                  //| nfun$main$1$OuterClass$1$InnerClass@6442b0a6
  ic1.x = 10
  ic2.x = 20
  println(s"ic1.x = ${ic1.x}")                    //> ic1.x = 10
  println(s"ic2.x = ${ic2.x}")                    //> ic2.x = 20
}