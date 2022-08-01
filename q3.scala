object Q5 extends App{
  def toUpper(a:String):String={
      a.toUpperCase()
   }
  def toLower(a:String):String={
     a.toLowerCase()
   }
  def formatNames(name: String)(func: String => String): String = {
   func(name)
 }
  println(formatNames("Benny")(toUpper(_)))
  println(formatNames("Niroshan")(toLower(_)))
  println(formatNames("Saman")(toLower(_)))
  println(formatNames("Kumara")(toUpper(_))) 
}
