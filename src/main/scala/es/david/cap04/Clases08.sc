package es.david.cap04

object Clases08 {

  // se quiere inicializar un atributo llamando a un bloque o a una funcion

  class Foo {
    // setearemos el valor
    val text = {
      var lines = ""
      try {
        lines = io.Source.fromFile("/etc/passwd").getLines.mkString
      } catch {
        case e: Exception => lines = "Error happened"
      }
      lines
    }
    //println(text)
    println()
    // tambien podemos asignar el contenido
    //import scala.xml.XML
    // assign the xml field to the result of the load method
    //val xml = XML.load("http://example.com/foo.xml")
    val text2 =io.Source.fromFile("/etc/passwd").getLines.foreach(println)
  }
  new Foo                                         //> 
                                                  //| root:x:0:0:root:/root:/bin/bash
                                                  //| bin:x:1:1:bin:/bin:/usr/bin/nologin
                                                  //| daemon:x:2:2:daemon:/:/usr/bin/nologin
                                                  //| mail:x:8:12:mail:/var/spool/mail:/usr/bin/nologin
                                                  //| ftp:x:14:11:ftp:/srv/ftp:/usr/bin/nologin
                                                  //| http:x:33:33:http:/srv/http:/usr/bin/nologin
                                                  //| uuidd:x:68:68:uuidd:/:/usr/bin/nologin
                                                  //| dbus:x:81:81:dbus:/:/usr/bin/nologin
                                                  //| nobody:x:99:99:nobody:/:/usr/bin/nologin
                                                  //| systemd-journal-gateway:x:191:191:systemd-journal-gateway:/:/usr/bin/nologin
                                                  //| 
                                                  //| systemd-timesync:x:192:192:systemd-timesync:/:/usr/bin/nologin
                                                  //| systemd-network:x:193:193:systemd-network:/:/usr/bin/nologin
                                                  //| systemd-bus-proxy:x:194:194:systemd-bus-proxy:/:/usr/bin/nologin
                                                  //| systemd-resolve:x:195:195:systemd-resolve:/:/usr/bin/nologin
                                                  //| systemd-journal-upload:x:999:999:systemd Journal Upload:/:/sbin/nologin
                                                  //| systemd-journal-remote:x:997:997:systemd Journal Remote:/:/sbin/nologin
                                                  //| systemd-coredump:x:998:998:systemd Core Dumper:/:/sbin/nologin
                                                  //| polkitd:x:102:102:Polic
                                                  //| Output exceeds cutoff limit.
}