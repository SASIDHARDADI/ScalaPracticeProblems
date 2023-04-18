import scala.io.StdIn
object TenthProblem {
  def main(args: Array[String]): Unit = {
    println("Enter the first number")
    val a = StdIn.readInt()
    println(s"First Value is $a")
    println("Enter the second number")
    val b = StdIn.readInt()
    println(s"Second Value is $b")
    println("Even numbers in the given range are")
    for (i <- a to b) {
      if (i%2 == 0)
       println(i)
    }
  }


}
