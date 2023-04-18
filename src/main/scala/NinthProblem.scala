import scala.io.StdIn
object NinthProblem {
  def main(args: Array[String]): Unit = {
    println("Enter the first number")
    val a = StdIn.readInt()
    println(s"First Value is $a")
    println("Enter the second number")
    val b = StdIn.readInt()
    println(s"Second Value is $b")
    var sum=0
    println("Sum of all the numbers in the given range is")
    for (i <- a to b) {
      sum = sum+i
    }
    println(sum)
  }

}
