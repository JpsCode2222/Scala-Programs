import scala.io.StdIn.readInt
object Transpose extends App{
    print("Enter rows or column count : ")
    val r = readInt()
    var arr = Array.ofDim[Int](r,r)
    // Input
    for(i<-0 to r-1){
        for(j<-0 to r-1){
            arr(i)(j) = readInt()
        }
    }
    println("Entered Matrix is : ")
    // Output
    for(i<-0 to r-1){
        for(j<-0 to r-1){
            print(arr(i)(j)+"\t")
        }
        println("\n")
    }

    // New Array for Transpose of Matrix
    var newarr = Array.ofDim[Int](r,r)
    println("Transpose of Matrix is : ")
    for(i<-0 to r-1){
        for(j<-0 to r-1){
            newarr(i)(j) = arr(j)(i)
            print(newarr(i)(j)+"\t")
        }
        println("\n")
    }
}