package es.david.cap13.ejemplo03

import akka.actor._

case object PingMessage
case object PongMessage
case object StartMessage
case object StopMessage

class Ping(pong: ActorRef) extends Actor {
  var count = 0
  def incrementAndPrint { count += 1; println(s"ping $count") }
  def receive = {
    case StartMessage =>
      incrementAndPrint
      pong ! PingMessage
    case PongMessage =>
      incrementAndPrint
      if (count > 99) {
        sender ! StopMessage
        println(s"ping stopped $count")
        context.stop(self)
      } else {
        sender ! PingMessage
      }
    case _ => println("Ping got something unexpected.")
  }
}

class Pong extends Actor {
  def receive = {
    case PingMessage =>
      println("   pong")
      sender ! PongMessage
    case StopMessage =>
      println("pong stopped")
      context.stop(self)
    case _ => println("Pong got something unexpected.")
  }
}
object PingPongTest extends App {
  // Creamos el ActorSystem
  val system = ActorSystem("PingPongSystem")
  
  // Creamos pong, una instancia de Actor Pong, (en realidad una instancia de ActorRef)
  val pong = system.actorOf(Props[Pong], name = "pong")
  
  // Creamos ping, una instancia de Actor Ping, el constructor toma un argumento, un ActorRef, y por ello usa una version diferente de la sintaxis Props
  val ping = system.actorOf(Props(new Ping(pong)), name = "ping")
  
  // Empezamos la accion enviando un mensaje a actor ping
  ping ! StartMessage
  // commented-out so you can see all the output
  //system.shutdown
}

// Como podemos ver para empezar en Ping, le pasamos la instancia del pong que vamos a usar, que solamente lo usaremos la primera vez
// Despues en cada una de las clases usamos la instancia de sender (que es el que nos ha enviado el mensaje)
// El metodo receive, es como capturamos los mensajes que hemos reciido
