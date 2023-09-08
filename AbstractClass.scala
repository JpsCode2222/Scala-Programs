abstract class Shape{
    // Util method empty methods
    def volume:Unit
    def display:Unit
}

class Cube(side:Int) extends Shape{
    var vol:Int = 0
    // Method Overriding
    def volume={
        vol = side*side*side
    }
    def display={
        println("Volume of Cube : "+vol)
    }
}

object AbstractClass{
    def main(args:Array[String])={
        var c1 = new Cube(3)
        c1.volume
        c1.display
    }
}