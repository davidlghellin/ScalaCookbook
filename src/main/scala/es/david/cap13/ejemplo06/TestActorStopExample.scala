package es.david.cap13.ejemplo06

import akka.actor._

class TestActorStopExample extends Actor {
  def receive = {
    case _ => println("a message was received in TestActorStopExample")
  }
}


object SystemStopExample extends App {
  val actorSystem = ActorSystem("SystemStopExample")
  val actor = actorSystem.actorOf(Props[TestActorStopExample], name = "test")
  actor ! "hello"
  // stop our actor
  actorSystem.stop(actor)
  actorSystem.shutdown
}
/*
a message was received in TestActorStopExample
*/