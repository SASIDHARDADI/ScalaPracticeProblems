import scala.io.StdIn

object FifthProblem {
  def main(args: Array[String]): Unit = {
    println("Enter the number")
    val n = StdIn.readInt()
    println(s"Entered Value is: $n")
    if ((n>0)&(n<100))
      {
        if ((n>90)&(n<100))
          println("Super Smart")
        else if ((n>80)&(n<90))
          println("Smart")
        else if ((n > 70) & (n < 80))
          println("Smart Enough")
        else if ((n > 60) & (n < 70))
          println("Just Smart")
        else if ((n > 35) & (n < 60))
          println("No Smart")
        else if ((n >0) & (n < 35))
          println("Dump")
      }
    else println("Invalid Input")

  }

}
