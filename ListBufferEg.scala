import scala.collection.immutable._
import scala.collection.mutable.ListBuffer
object ListBufferEg extends App{
    val l1 = List.range(1,50)
    var l2 = ListBuffer[Int]()
    // List the ele that are divisible by 3
    l1.foreach((ele:Int)=>if(ele % 3 == 0){l2 +=ele})
    println(l2)


    // tabulate
    var l3 = List.tabulate(10)(n=>3*n*n+4*n*n+6)
    println(l3)


}
