import scala.io.StdIn.readInt

object Average extends App{
    var start:Int = 0
    var end:Int = 0
    var avg:Float = 0

    println("Enter First Number : ")
    var n1 = readInt()

    println("Enter Second Number : ")
    var n2 = readInt()

    if(n1 > n2){
        start = n1
        end = n2
    }
    else{
        start = n2
        end = n1
    }
    var total : Float = 0
    while (start <= end){
        total = total + start
        start = start + 1
        println("Start = "+start+" Total = "+total)
    }
    // Formula for Average 
    // var avg = 2 / (n1+n2);
    print((n1-n2).abs)
    avg = (total/((n1-n2).abs+1))
    println("Average of "+n1+" and "+n2+" is "+avg)
}