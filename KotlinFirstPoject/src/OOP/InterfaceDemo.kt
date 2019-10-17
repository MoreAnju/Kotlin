package OOP
interface aa{
    fun sum1(n1:Int, n2:Int);
    fun sub1(n1:Int, n2:Int);
}
class first():aa{

    override fun sum1(n1:Int, n2:Int)
    {
        println("Sum:"+ n1+n2)
    }
    override fun sub1(n1:Int, n2:Int)
    {
        println("Sum:"+ n1+n2)
    }
}

fun main(args:Array<String>){
    val a1=first()
    a1.sub1(23,4)
    a1.sum1(23,12)
}
