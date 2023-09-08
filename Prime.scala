import scala.io.StdIn.readInt
import scala.util.control._
object Prime extends App{
    var total = 0
    var i:Int = 0
    var j=0
    var flag = true

    for(i<-100 until 200){
        val loop = new Breaks
        flag = true
        loop.breakable{
            for(j<-2 to i-1){
                if(i%j == 0){
                    flag=false
                    loop.break
                }
            }
            if(flag == true){
                println(i+" is a prime number")
                total = total + i
            }
        }
    }
    println("Total of prime numbers between 100 to 200 is "+total)
}