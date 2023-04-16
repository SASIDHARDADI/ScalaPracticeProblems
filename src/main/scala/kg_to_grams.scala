import scala.io.StdIn
object kg_to_grams {
  def main(args: Array[String]): Unit = {
    import scala.io.StdIn
    //ask the user for t54he value of item in KG
    println("Enter the value of amount to be converted from KG to grams")
    val n = StdIn.readInt()
    println(s"Entered value for the conversion is $n:")
    val m = n * 1000
    println("Value in grams is", m)
  }
}
