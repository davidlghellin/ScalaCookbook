package es.david.cap06

object Objetos02 {
  //cuando en una API necesitas NombreClase.class como objeto Java, pero no funciona en Scala
  // usaremos classOf[NombreClase]
  val stringClass = classOf[String]               //> stringClass  : Class[String] = class java.lang.String
  stringClass.getMethods                          //> res0: Array[java.lang.reflect.Method] = Array(public boolean java.lang.Strin
                                                  //| g.equals(java.lang.Object), public java.lang.String java.lang.String.toStrin
                                                  //| g(), public int java.lang.String.hashCode(), public int java.lang.String.com
                                                  //| pareTo(java.lang.Object), public int java.lang.String.compareTo(java.lang.St
                                                  //| ring), public int java.lang.String.indexOf(java.lang.String,int), public int
                                                  //|  java.lang.String.indexOf(int), public int java.lang.String.indexOf(java.lan
                                                  //| g.String), public int java.lang.String.indexOf(int,int), public static java.
                                                  //| lang.String java.lang.String.valueOf(char), public static java.lang.String j
                                                  //| ava.lang.String.valueOf(java.lang.Object), public static java.lang.String ja
                                                  //| va.lang.String.valueOf(boolean), public static java.lang.String java.lang.St
                                                  //| ring.valueOf(char[],int,int), public static java.lang.String java.lang.Strin
                                                  //| g.valueOf(char[]), public static java.lang.String java.lang.String.valueOf(d
                                                  //| ouble), public static ja
                                                  //| Output exceeds cutoff limit.
}