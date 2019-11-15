package scala

/**
  * @author HaoxuanLi  Github:bestksl
  * @version created date：2019-11-13 14:45
  */
object Fibonacci {

  private def fibonacci(index: Int): Int = {
    if (index <= 2)
      1
    else {
      fibonacci(index - 1) + fibonacci(index - 2)
    }
  }

  private def f(x: Int): Int = {
    if (x == 1)
      3
    else
      2 * f(x - 1) + 1
  }

  private def peachNum(day: Int = 1): Int = {
    if (day == 10) {
      1
    }
    else {
      2 * (peachNum(day + 1) + 1)
    }
  }


  def f111 ="NB"

  def aa(): Unit = {
    print(11121312)
  }

  def main(args: Array[String]): Unit = {
    println(fibonacci(7))
    println(f(3))
    print(peachNum())
    println(f111)
    aa
  }


}
