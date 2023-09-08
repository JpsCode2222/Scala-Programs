import scala.io.StdIn._
class Order(id:Int, desc:String){
    def display={
        println("ID "+id+"\nDescription "+desc)
    }
}
// using extends keyword inherit properties of parent class to child class
class PurchaseOrder(id:Int,desc:String,vendor:String) extends Order(id,desc){
    override def display={
        println("ID "+id+"\nVendor "+vendor+"\nDescription "+desc)
    }
}

class SaleOrder(id:Int,desc:String,customer:String) extends Order(id,desc){
    override def display={
        println("ID "+id+"\nCustomer "+customer+"\nDescription "+desc)
    }
}

object Inheritance{
    def main(args:Array[String])={
        var o1 = new Order(1122,"Bike")
        o1.display
        var po1 = new PurchaseOrder(12,"Apple","Raj")
        po1.display
        var so1 = new SaleOrder(1,"Tata","ABC")
        so1.display
    }
}