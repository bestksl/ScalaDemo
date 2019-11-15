package scala

import scala.io.StdIn
import scala.math

/**
  * @author HaoxuanLi  Github:bestksl
  * @version created date：2019-11-10 01:02
  */
object HelloWorld {
  val m1 = (a: Int, b: Int) => {
    if (a + b == 10)
      10
    else
      null
  }

  private def m2(a: Int, b: Int) = {
    if (a + b == 10)
      10
    else
      null
  }

  private def p(n: Int) = {
    for (i <- 1 to n) {
      for (j <- 1 to i)
        print(j + "* " + i + " = " + i * j + "  ")
      println()
    }
  }


  def main(args: Array[String]): Unit = {
    p(9)
    //println(m1(1, 2))
    //println(m2(1, 2))
  }

}