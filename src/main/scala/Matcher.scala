class Matcher {

  def matcher(i: String): String = {
    return i match {
      case "fly" => SuperPower.FLY
      case "time" => SuperPower.TIME_TRAVEL
      case "speed" => SuperPower.SPEED
      case _ => "is not a power in this context"
    }
  }

  def matcherLast(i: Int, len: Int): String = {
    i match {
      case `len` => "\n"
      case _ => ", "
    }
  }

}