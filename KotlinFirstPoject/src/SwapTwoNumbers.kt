fun main(args:Array<String>)
{
    var x:Int=10
    var y:Int=20
    var temp:Int?

    println("x:"+x+"y:"+y)

    temp=x
    x=y
    y=temp

    println("x:"+x+"y:"+y)
}