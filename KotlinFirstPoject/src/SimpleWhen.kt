fun main(args:Array<String>){

    var x=10
    when(x){
        1  ->
            println("value of x is 1")// no need to add curly brackets --> only one statement

        2 -> { // when you have more than 1 statement to execute add curly brackets
            println("value of x is 2")
        println("value of x is 2")
        }

        3 -> {
            println("value of x is 3")
        }
        else -> {  // after else too ->
            println("value of x is out of range")
        }


    }
}