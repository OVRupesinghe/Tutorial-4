package Assignment3
import scala.io.StdIn.readInt;

object Q4 extends App{
  
  def display(num:Int)=num match{
        case x if x<=0=> println("Negative/Zero")
        case x if x%2==0 => println("Even number")
        case x if x%2!=0 => println("Odd number")
    }
  println("Enter an integer: ")
  var a = readInt()
  display(a)
  
}
