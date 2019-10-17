import java.util.*

fun main(args:Array<String>){
    print("Enter DOB:")
    var DOB:Int= readLine()!!.toInt()
    var year:Int = Calendar.getInstance().get(Calendar.YEAR)
    var age= year-DOB
    println("Your age is $age years" )//works same
println("Your age is " + age +"years" )

}