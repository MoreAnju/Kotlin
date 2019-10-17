fun main(args:Array<String>){
// different conditions in when..
    var x=23
    when(x){
        1,2 ->// 1 or 2
            println("value of x is 1 or 2")// no need to add curly brackets --> only one statement

        10,20 ->// 10 or 20
        { // when you have more than 1 statement to execute add curly brackets
            println("value of x is 10 or 20")
            println("value of x is 10 or 20")
        }

        in 20.. 30 -> //range
        {
            println("value of x is range 20 to 30")
        }
        !in 20.. 30 -> {
            println("value of x is 3")
        }
        else -> {  // after else too ->
            println("value of x is out of range")
        }


    }
}