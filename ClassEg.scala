class Account(acc_no:Int,name:String,var bal:Float){

    var min_bal = 0

    def withdraw(amt:Int)={
        if( bal < min_bal){
            println("Insufficient Balance!!!")
        }
        else{
            bal -= amt
        }
    }

    def deposite(amt:Int)={
        bal += amt
    }

    def balance()={
        println("Current Balance is : "+bal)
    }

}

object ClassEg{
    // if class define then main method is complsry
    def main(args:Array[String])={
        var A = new Account(123,"ABC",2000)
        A.withdraw(200)
        A.balance()
        A.deposite(200)
        A.balance()
    }
}
