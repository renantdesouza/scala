abstract class Person(val firstName: String, val lastName: String)  {

  def name(): String = {
    firstName + " " + lastName
  }

  def bio(): String = ???

  override def equals(that: Any): Boolean = {
    if (!that.isInstanceOf[Person]) {
      false
    } else {
      val other = that.asInstanceOf[Person]
      firstName == other.firstName && lastName == other.lastName
    }
  }

}