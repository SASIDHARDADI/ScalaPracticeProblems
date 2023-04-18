import scala.io.StdIn

object Seventh_Problem {
  def main(args : Array[String]): Unit ={
    println("Enter the no of times Sekho Big Data Prints")
    val n= StdIn.readInt()
    println(s"Entered value is $n")
    for(i<-1 to n)
      {
        println("Sekho BigData")
      }
  }

}
