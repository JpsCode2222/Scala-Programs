import scala.collection.immutable._
object SetMinMax extends App{
    val s1 = Set(10,20,30)
    var (min,max) = (0,99)
    for(ele <- s1){
        if(ele < max){
            max = ele
        }
        if(ele > min){
            min = ele
        }
    }
    println("Max No : "+max)
    println("Min No : "+min)
}