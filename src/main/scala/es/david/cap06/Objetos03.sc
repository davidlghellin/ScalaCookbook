package es.david.cap06

object Objetos03 {

  // como en Scala no es necesario declarar el tipo de clase, puede que nos sea de ayuda
  // podemos usar getClass
  val a = 9                                       //> a  : Int = 9
  a.getClass                                      //> res0: Class[Int] = int
  val hola = <p>Hola, mundo</p>                   //> hola  : scala.xml.Elem = <p>Hola, mundo</p>
  hola.getClass                                   //> res1: Class[?0] = class scala.xml.Elem
  hola.child.foreach(e => println(e.getClass))    //> class scala.xml.Text
  val hello = <p>Hello, <br/>world</p>            //> hello  : scala.xml.Elem = <p>Hello, <br/>world</p>
  hello.child.foreach(e => println(e.getClass))   //> class scala.xml.Text
                                                  //| class scala.xml.Elem
                                                  //| class scala.xml.Text

  // pequenyo test para saberr que tipo de clase
  def printClass(c: Any) { println(c.getClass) }  //> printClass: (c: Any)Unit
  printClass(1)                                   //> class java.lang.Integer
  printClass("yo")                                //> class java.lang.String
}