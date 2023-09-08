import scala.collection.immutable
object MapEg extends App{
    var Months = Map((1,"Jan"),(2,"Feb"))
    var Days = Map("1"->"Sun","2"->"Mon")
    println(Months)
    println(Days)

    Months.foreach{
        case(key,value)=> println(value)
    }

    Days.foreach{
        case(key,value)=> println(value)

        
    }

}