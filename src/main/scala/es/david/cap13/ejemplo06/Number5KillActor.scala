package es.david.cap13.ejemplo06

import akka.actor._

class Number5KillActor extends Actor {
  def receive = {
    case _ => println("Number5 got a message")
  }
  override def preStart { println("Number5KillActor is alive") }
  override def postStop { println("Number5KillActor::postStop called") }
  override def preRestart(reason: Throwable, message: Option[Any]) {
    println("Number5KillActor::preRestart called")
  }
  override def postRestart(reason: Throwable) {
    println("Number5KillActor::postRestart called")
  }
}

object KillTest extends App {
  val system = ActorSystem("KillTestSystem")
  val number5 = system.actorOf(Props[Number5KillActor], name = "Number5KillActor")
  number5 ! "hello"
  // send the Kill message
  number5 ! Kill
  system.shutdown
}

/*
Number5KillActor is alive
Number5 got a message
Number5KillActor::postStop called
*/
