import scala.collection.immutable._
object ListOpr extends App{
    
    val list = 1 :: 2 :: 3 :: Nil
    println(list)

    val list2 = List(1,2,3)
    println(list2)

    val A = List.fill(3)("Scala")
    println(A)

    val x = List.range(1,10)
    println(x)

    val B = List.tabulate(10)(n=>n*n)
    println(B)

    // Merge List
    val unsort = List(5,1,2,3,4)
    val l1 = List(1,2,3,4)
    val l2 = List("A","B","C","D")

    var l = l1 ++ l2
    println(l)

    var s = l1 ::: l2
    println(s)

    var c = List.concat(l1,l2)
    println(c)

    val z = unsort.sorted
    println(z)

}