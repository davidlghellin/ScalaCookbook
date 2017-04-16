package es.david.cap13.ejemplo01

import akka.actor.Actor
import akka.actor.ActorSystem
import akka.actor.Props
import akka.actor.actorRef2Scala

class HolaActor01 extends Actor {
  def receive = {
    case "hello" => println("hello back at you")
    case _       => println("huh?")
  }
}
object Main extends App {
  // un Actor necesita un ActorSystem
  val system = ActorSystem("HelloSystem")
  // Creamos y start el actor
  val helloActor = system.actorOf(Props[HolaActor01], name = "helloactor")
  // enviamos el actor dos mensajes
  helloActor ! "hello"
  helloActor ! "buenos dias"
  // apagamos el sistema
  system.shutdown
}
/*
hello back at you
huh?
*/