
fun sum(n1:Double, n2:Double):Double{
  var sum=n1+n2
    return sum

}

fun display(n:Int):Unit{//unit shows this function will  not return anything
    println("The number is $n")
}

fun displayNoInputNum():Unit{
    println("Display Function")
}

fun main (args:Array<String>){
var r=sum(34.0,4.0)
println(r)
     r=sum(3.0,2.2)
    println(r)
display(29)
displayNoInputNum()

}