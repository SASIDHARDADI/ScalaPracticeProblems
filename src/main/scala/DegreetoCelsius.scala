import scala.io.StdIn

object DegreetoCelsius {
  def main(args: Array[String]): Unit = {
    //ask the user for the value of temperature in celsius
    println("Enter the value of degree in celsius to be converted into farenheit")
    val c = StdIn.readInt()
    println(s"Entered value for the conversion is $c:")
    val f = ((c * 9) / 5) + 32
    println("Value of temp in farenheit is", f)
  }

}
