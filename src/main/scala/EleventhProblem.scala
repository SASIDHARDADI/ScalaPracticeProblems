import scala.io.StdIn
object EleventhProblem {
  def main(args: Array[String]): Unit = {
    println("Enter the first number")
    val a = StdIn.readInt()
    println(s"First Value is $a")
    println("Enter the second number")
    val b = StdIn.readInt()
    println(s"Second Value is $b")
    println("Odd numbers in the given range are")
    for (i <- b to a) {
      if (i % 2 == 1)
        println(i)
    }
  }

}
