import scala.io.StdIn
object Eight_Poblem {
def main(args: Array[String]): Unit = {
    println("Enter the first number")
   val a = StdIn.readInt()
    println(s"First Value is $a")
  println("Enter the second number")
  val b = StdIn.readInt()
  println(s"Second Value is $b")
  println("Divisible by 11 in the given range are")
  for (i<- a to b ) {
    if (i % 11 == 0)
      println(i)
  }
  }
}
