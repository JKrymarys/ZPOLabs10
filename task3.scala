object task3 {

 def buildString(v : Vector[String]): String  =

  v.length match {
    case 0 => "{}"
    case 1 => "{" + v.head + "}"
    case 2 =>  "{" + v(0) + " i " + v(1) + "}"
    case _ => {
      var s = "{"
      for (i <- 0 to (v.length - 3))
      {
         s += v(i) + ","
      }
      s +=  v(v.length-2) + " i " + v(v.length-1) + "}"

      return s
    }

  }


  def main(args: Array[String]) {
    print(buildString(Vector("A")))
    print(buildString(Vector("A", "B")))
    print(buildString(Vector("A", "B", "C")))


  }
}