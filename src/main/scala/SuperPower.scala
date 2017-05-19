object SuperPower extends Enumeration {

  val FLY = "fly ability";
  val SPEED = "super velocity";
  val TIME_TRAVEL = "time travel ability";

   def value(): Array[String] = {
    Array(FLY, SPEED, TIME_TRAVEL);
  }

}