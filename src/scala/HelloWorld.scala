package scala

/**
  * @author HaoxuanLi  Github:bestksl
  * @version created date：2019-11-10 01:02
  */
object HelloWorld {

  def kslmethod(name: String): String = {
    val a = "bbb"
    var b = "aaa"
    a + b + name
  }

  def main(args: Array[String]): Unit = {
    println(kslmethod("aaa"))
    print("ksl hello")
  }
}
