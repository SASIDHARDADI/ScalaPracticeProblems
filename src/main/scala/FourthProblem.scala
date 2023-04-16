import scala.io.StdIn
object FourthProblem {
  def main(args: Array[String]): Unit = {
    println("Enter the number")
    val n = StdIn.readInt()
    println(s"Entered value is: $n")
    if ((n > 100) & (n < 1000)) {
      if (n % 2 == 0) {
        println("Even Number")
        val m = n / 3
        println("Even Number & The remainder is", m)
      }
      else if (n % 2 != 0) {
        val o = n / 2
        println("Odd Number & The remainder is", o)
      }
    }
    else println("Wrong Number")

  }
}
