class SuperPerson(override val firstName: String,
                  override val lastName: String,
                  var superPower: String) extends Person(firstName, lastName) {

  def this(firstName: String, lastName: String) {
    this(firstName, lastName, null)
  }

  def setSuperPower(superPower: String) = {
    this.superPower = superPower
  }

  override def bio(): String = {
    return name() + " has " + superPower
  }

}