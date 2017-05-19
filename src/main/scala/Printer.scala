class Printer {

  val matcher = new Matcher;

  def print(separator : String, objs : Any*): Unit = {
    objs.foreach((o : Any) => print(o + separator))
  }

  def printInline(array: Array[Integer], len: Integer): Unit = {
    for (i <- 0 to len) {
      print(array(i) + (matcher.matcherLast(i, len)))
    }
  }

}