import scala.io.StdIn.readInt

object Add extends App{
    print("Enter First Number :")
    var num1:Int = readInt()
    print("Enter Second Number :")
    var num2:Int = readInt()
    var ans = num1 + num2
    print("Addition of"+num1+" and "+num2+" is "+ans)
}