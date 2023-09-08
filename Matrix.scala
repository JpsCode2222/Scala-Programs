import scala.io.StdIn.readInt
object Matrix extends App{
    println("Enter Elements in Matrix")
    // Create  Array
    var Arr = Array.ofDim[Int](2,2)
    // Input
    for(i<-0 until 2){
        for(j<-0 until 2){
            Arr(i)(j) = readInt()
        }
    }
    // Output
    println("Entered Matrix : ")
    for(i<-0 until 2){
        for(j<-0 until 2){
            print(Arr(i)(j)+"\t")
        }
        println()
    }
}