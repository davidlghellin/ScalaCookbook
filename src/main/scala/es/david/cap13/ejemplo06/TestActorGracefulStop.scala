package es.david.cap13.ejemplo06

import akka.actor._
import akka.pattern.gracefulStop
import scala.concurrent.{ Await, ExecutionContext, Future }
import scala.concurrent.duration._
import scala.language.postfixOps

class TestActorGracefulStop extends Actor {
  def receive = {
    case _ => println("TestActor got message")
  }
  override def postStop { println("TestActor: postStop") }
}

object GracefulStopTest extends App {
  val system = ActorSystem("GracefulStopTest")
  val testActor = system.actorOf(Props[TestActorGracefulStop], name = "TestActor")
  // try to stop the actor gracefully
  try {
    val stopped: Future[Boolean] = gracefulStop(testActor, 2 seconds, "fin")
    Await.result(stopped, 3 seconds)
    println("testActor was stopped")
  } catch {
    case e: Exception => e.printStackTrace
  } finally {
    system.shutdown
  }
}