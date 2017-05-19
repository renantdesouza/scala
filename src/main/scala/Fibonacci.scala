object Fibonacci {

  def fibonaci(num:Integer): Array[Integer] = {
    val fibo = new Array[Integer](num)
    for (i <- 0 to num -1) {
      fibo(i) = if (i < 2) 1 else fibo(i - 1) + fibo(i - 2)
    }
    fibo
  }

  def main(args: Array[String]) {
    val fibo = fibonaci(6)
    val printer = new Printer

    printer.print("\n", fibo)
    printer.printInline(fibo, fibo.length)
  }

}