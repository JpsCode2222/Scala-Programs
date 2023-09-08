import scala.io.*

object max extends App{
    print("Enter First Number: ")
    val num1 = readInt();

    print("Enter Second Number: ")
    val num2 = readInt()

    if(num1 > num2){
        print("Num1 is Greater",num1)
    }
    else{
        print("Num2 is Greater",num2)
    }
}