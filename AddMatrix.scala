import scala.io.StdIn.readInt
object AddMatrix extends App{
    // To Create Multidimentional Array use these syntax
    var Arr1 = Array.ofDim[Int](2,2)
    var Arr2 = Array.ofDim[Int](2,2)
    var Arr3 = Array.ofDim[Int](2,2)
    println("Enter 1st Matrix Elements :")
    for(i<-0 to 1){
        for(j<-0 to 1){
            Arr1(i)(j) = readInt()
        }
    }

    println("1st Matrix : ")
    for(i<-0 to 1){
        for(j<-0 to 1){
            print(Arr1(i)(j)+"\t")
        }
        println()
    }

    println("Enter 2nd Matrix Elements :")
    for(i<-0 to 1){
        for(j<-0 to 1){
            Arr2(i)(j) = readInt()
        }
    }

    println("2nd Matrix : ")
    for(i<-0 to 1){
        for(j<-0 to 1){
            print(Arr2(i)(j)+"\t")
        }
        println()
    }

    println("Addition of 1st Matrix and 2nd Matrix is :")
    for(i<-0 to 1){
        for(j<-0 to 1){
            Arr3(i)(j) = Arr1(i)(j) + Arr2(i)(j)
            print(Arr3(i)(j)+"\t")
        }
        println()
    }
}