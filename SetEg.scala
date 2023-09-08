import scala.collection.immutable._
object SetEg extends App{
    // Set
    val s = Set("0","1","2","A")
    val s2 = Set("A","B","C")
    // intersect show unique elements
    println(s.intersect(s2))
    // Print
    println(s)
    println(s2)
}