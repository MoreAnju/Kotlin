package OOP

class User<T>(type:T){

    init{
        println(type)
    }

}
fun <T> display(type: T){
    println(type)
}
fun main(args:Array<String>){
  val aa=User<String>("Anju")
    val bb=User<Int>(123)
    var cc=User<Double>(234.5)

    display<String>("Anju")
    display<Int>(123)
}