object task1 {

  def main(args: Array[String]) {

    val temp1 = checkIfPerfect(6)
    val temp2 = 6
    assert(temp1 == temp2.toInt)

    val temp3 = checkIfPerfect(16)
    val temp4 = 16
    assert(temp3 != temp4)

    val temp5 = checkIfPerfect(28)
    val temp6 = 496
    assert(temp5 == temp6)
  }


  def checkIfPerfect(number : Int): Unit =
  {
    var isSquare : Boolean = math.sqrt(number)%1 == 0


    var check = 2
    val max = math.sqrt(number)

    var sum = 1
    while (check < max) {
      if ((number % check) == 0) {
        sum += check
        sum += (number / check)
        println(check)
      }

      if(isSquare)
        {
          sum -= math.sqrt(number).toInt
        }

        check += 1

    }
    //println(sum)

    sum.toInt //return, and to Int
  }


  def checkSetIfPerfect(): Unit =
  {
    val vector =  Vector( 6, 28, 496, 8128 )

    for( number <- vector)
     {
       assert(number == checkIfPerfect(number))
     }

  }

}