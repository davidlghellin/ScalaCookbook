package es.david.cap04
import org.scalatest.FunSuite
class Person1515Tests extends FunSuite {
  // these first two instances should be equal
  val nimoy = new Person15("Leonard Nimoy", 82)
  val nimoy2 = new Person15("Leonard Nimoy", 82)
  val shatner = new Person15("William Shatner", 82)
  val ed = new Person15("Ed Chigliak", 20)
  // all tests pass
  test("nimoy == nimoy") { assert(nimoy == nimoy) }
  test("nimoy == nimoy2") { assert(nimoy == nimoy2) }
  test("nimoy2 == nimoy") { assert(nimoy2 == nimoy) }
  test("nimoy != shatner") { assert(nimoy != shatner) }
  test("shatner != nimoy") { assert(shatner != nimoy) }
  test("nimoy != null") { assert(nimoy != null) }
  test("nimoy != String") { assert(nimoy != "Leonard Nimoy") }
  test("nimoy != ed") { assert(nimoy != ed) }
  /*
Run starting. Expected test count is: 1
Person1515Tests:
- nimoy2 == nimoy
Run completed in 111 milliseconds.
Total number of tests run: 1
Suites: completed 1, aborted 0
Tests: succeeded 1, failed 0, canceled 0, ignored 0, pending 0
All tests passed.
   */
}