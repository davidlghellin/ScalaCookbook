package es.david.cap13.ejemplo04

import akka.actor._

class Kenny extends Actor {
  println("Entrando al constructor de Kenny")
  override def preStart { println("kenny: preStart") }
  override def postStop { println("kenny: postStop") }
  override def preRestart(reason: Throwable, message: Option[Any]) {
    println("kenny: preRestart")
    println(s" MESSAGE: ${message.getOrElse("")}")
    println(s" REASON: ${reason.getMessage}")
    super.preRestart(reason, message)
  }
  override def postRestart(reason: Throwable) {
    println("kenny: postRestart")
    println(s" REASON: ${reason.getMessage}")
    super.postRestart(reason)
  }
  def receive = {
    case ForceRestart => throw new Exception("Boom!")
    case _            => println("Kenny recibe un mensaje")
  }
}

case object ForceRestart

object LifecycleDemo extends App {
  val system = ActorSystem("LifecycleDemo")
  val kenny = system.actorOf(Props[Kenny], name = "Kenny")
  println("Enviando a Kenny un mensaje simple Strin")
  kenny ! "hello"
  Thread.sleep(1000)
  println("make kenny restart")
  kenny ! ForceRestart
  Thread.sleep(1000)
  println("stopping kenny")
  system.stop(kenny)
  println("shutting down system")
  system.shutdown
}

/*

Entrando al constructor de Kenny
Enviando a Kenny un mensaje simple Strin
kenny: preStart
Kenny recibe un mensaje
make kenny restart
kenny: preRestart
 MESSAGE: ForceRestart
 REASON: Boom!
kenny: postStop
Entrando al constructor de Kenny
kenny: postRestart
 REASON: Boom!
kenny: preStart
[ERROR] [04/17/2017 01:39:14.052] [LifecycleDemo-akka.actor.default-dispatcher-4] [akka://LifecycleDemo/user/Kenny] Boom!
java.lang.Exception: Boom!
	at es.david.cap13.ejemplo04.Kenny$$anonfun$receive$1.applyOrElse(Kenny.scala:21)
	at akka.actor.Actor$class.aroundReceive(Actor.scala:480)
	at es.david.cap13.ejemplo04.Kenny.aroundReceive(Kenny.scala:5)
	at akka.actor.ActorCell.receiveMessage(ActorCell.scala:526)
	at akka.actor.ActorCell.invoke(ActorCell.scala:495)
	at akka.dispatch.Mailbox.processMailbox(Mailbox.scala:257)
	at akka.dispatch.Mailbox.run(Mailbox.scala:224)
	at akka.dispatch.Mailbox.exec(Mailbox.scala:234)
	at scala.concurrent.forkjoin.ForkJoinTask.doExec(ForkJoinTask.java:260)
	at scala.concurrent.forkjoin.ForkJoinPool$WorkQueue.runTask(ForkJoinPool.java:1339)
	at scala.concurrent.forkjoin.ForkJoinPool.runWorker(ForkJoinPool.java:1979)
	at scala.concurrent.forkjoin.ForkJoinWorkerThread.run(ForkJoinWorkerThread.java:107)

stopping kenny
shutting down system
kenny: postStop
*/