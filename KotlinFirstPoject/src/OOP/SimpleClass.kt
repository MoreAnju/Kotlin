package OOP
import java.lang.annotation.ElementType
/*
class car(){
init {
    println("hello")
}
}
*/
//class car(type: String, model:Int, Price: Double, Owner:String)--> this will not allow us to use get or set function on it so use var
class car( var type: String, var model:Int, var Price: Double, var Owner:String){
    init {
        println("type: $type, model: $model, Price: $Price, Owner: $Owner")
    }


    fun getCarPrice():Double{
        return this.Price + 1000;

    }
}

fun main(args:Array<String>){
 val aaa=car("Bmw",111, 1000.0, "Anju More")
    val bbb=car("KA",222,2000.2,"Anju More")
    println("price of the car is:"+ aaa.getCarPrice())

}











