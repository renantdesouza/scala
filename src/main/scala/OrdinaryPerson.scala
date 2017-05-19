class OrdinaryPerson(override val firstName: String, override val lastName: String) extends Person(firstName, lastName) {

  override def bio(): String = {
    return name() + " is an ordinary person "
  }

}