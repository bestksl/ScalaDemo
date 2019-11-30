package scala


import scala.collection.mutable.ArrayBuffer
;

/**
  * @author HaoxuanLi  Github:bestksl
  * @version created date：2019-11-25 23:01
  */
object test {
  def main(args: Array[String]): Unit = {
    var a = "AAAAAAAAAABBBBBBBBCCCCCDDDDDDD"

    val ab = ArrayBuffer[Char]()

    a.foldLeft(ab)(add)


    def add(string: ArrayBuffer[Char], char: Char): ArrayBuffer[Char] = {
      ab.append(char)
      ab
    }

    println(ab)


    var m = Map[Char, Int]()

    def count(map: Map[Char, Int], c: Char): Map[Char, Int] = {
      map + (c -> (map.getOrElse(c, 0) + 1))
    }


    println(a.foldLeft(m)(count))
  }
}