package OOP

import java.util.*

open class Operation(){

    fun add(n1:Int, n2:Int):Int{
        return n1+n2
    }


    fun sub(n1:Int, n2:Int):Int{
        return n1-n2
    }

}
class MultiOperation():Operation(){

    fun multi(n1:Int, n2:Int):Int{
        return n1*n2
    }

    fun div(n1:Int, n2:Int):Int{
        return n1/n2
    }

}

fun main(args:Array<String>){

    val first= Operation()
   println(first.add(2,3))

   println( first.sub(4,1))

    val second=MultiOperation()
    println( second.add(23,1))
   println(second.sub(34,2))
  println( second.div(45,5))
println( second.multi(2,4))
}