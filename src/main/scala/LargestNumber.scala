import scala.io.StdIn
  object LargestNumber {
    def main(args: Array[String]): Unit = {
      //ask the user for the numbers
      println("Enter the first number")
      val a = StdIn.readInt()
      println(s"First Number Value is $a:")
      println("Enter the second number")
      val b = StdIn.readInt()
      println(s"Second Number Value is $b:")
      println("Enter the third number")
      val c = StdIn.readInt()
      println(s"Third Number Value is $c:")
      if ((a > b) & (a > c))
        println("Largest number among 3numbers is", a)
      else if (b > c)
        println("Largest number among 3 numbers is", b)
      else
        println("Largest number among 3numbers is", c)
    }

  }
