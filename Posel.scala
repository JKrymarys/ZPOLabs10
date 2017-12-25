import Committee.Committee
import Party.Party

object Party extends Enumeration {
  type Party = Value
  val PO,PiS, SLD = Value

}

object Committee extends Enumeration {
  type Committee = Value
  val Sport, EU, Education, Communication = Value
}

class Posel(fn: String, ln: String, a: Int, p: Party, f : String, c : Vector[Committee]) {
  var first_name = fn
  var last_name = ln
  var age = a
  var party = p
  var function : String = f
  var committees : Vector[Committee] = c

  override def toString: String = {
    var comString = ""
    this.committees.foreach(committee => comString += committee + " ")

    return first_name + " " + last_name + " " + a + " " + p + " " + f + " " + comString
  }


}


object Main
{
  def main(args: Array[String]) : Unit =
  {
      val p1 = new Posel("Adam", "Mickiewicz", 23, Party.PiS, "marszałek", Vector(Committee.Education, Committee.EU) )
    val p2 = new Posel("Juliusz", "Słowacki", 43, Party.SLD, "wicemarszałek", Vector(Committee.Sport) )
    val p3 = new Posel("Arkadiusz", "Kowalski", 29, Party.PO, "wicemarszałek", Vector(Committee.Education, Committee.EU) )
    val p4 = new Posel("Marek", "Poniatowski", 18, Party.PiS, "", Vector(Committee.Sport, Committee.EU) )
    val p5 = new Posel("Andrzej", "Najman", 52, Party.SLD, "", Vector(Committee.EU) )

    val Posels: Vector[Posel]  = Vector(p1,p2,p3,p4,p5)

    val byAge = Posels.filter( _.age < 40)
    val byName = Posels.filter( _.last_name.charAt(0) >= 'D').filter( _.last_name.charAt(0) <= 'K')
    val byCommittee = Posels.filter(_.committees == Committee.Sport)
    val ifMarszalek = Posels.filter( _.function == "marszałek")
    val composition = Posels.filter(_.age < 40).filter( _.last_name.charAt(0) >= 'D').filter( _.last_name.charAt(0) <= 'K')

    print(byAge)
    print(byName)
    print(byCommittee)
    print(ifMarszalek)
    print(composition)

  }

}