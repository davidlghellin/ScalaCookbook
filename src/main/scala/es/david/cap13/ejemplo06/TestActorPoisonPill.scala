package es.david.cap13.ejemplo06

import akka.actor._

class TestActorPoisonPill extends Actor {
  def receive = {
    case s: String => println("Message Received: " + s)
    case _         => println("TestActorPoisonPill got an unknown message")
  }
  override def postStop { println("TestActorPoisonPill::postStop called") }
}

object PoisonPillTest extends App {
  val system = ActorSystem("PoisonPillTest")
  val actor = system.actorOf(Props[TestActorPoisonPill], name = "test")
  // a simple message
  actor ! "before PoisonPill"
  // the PoisonPill
  actor ! PoisonPill
  // these messages will not be processed
  actor ! "after PoisonPill"
  actor ! "hello?!"
  system.shutdown
}

/*
Message Received: before PoisonPill
TestActorPoisonPill::postStop called
[INFO] [04/17/2017 10:27:06.676] [PoisonPillTest-akka.actor.default-dispatcher-3] [akka://PoisonPillTest/user/test] Message [java.lang.String] from Actor[akka://PoisonPillTest/deadLetters] to Actor[akka://PoisonPillTest/user/test#1552544174] was not delivered. [1] dead letters encountered. This logging can be turned off or adjusted with configuration settings 'akka.log-dead-letters' and 'akka.log-dead-letters-during-shutdown'.
[INFO] [04/17/2017 10:27:06.677] [PoisonPillTest-akka.actor.default-dispatcher-3] [akka://PoisonPillTest/user/test] Message [java.lang.String] from Actor[akka://PoisonPillTest/deadLetters] to Actor[akka://PoisonPillTest/user/test#1552544174] was not delivered. [2] dead letters encountered. This logging can be turned off or adjusted with configuration settings 'akka.log-dead-letters' and 'akka.log-dead-letters-during-shutdown'.
*/