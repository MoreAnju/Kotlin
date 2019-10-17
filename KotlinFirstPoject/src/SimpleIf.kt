fun main(args:Array<String>){
    println("Enter your grades=")
    var grade:Double= readLine()!!.toDouble()
    if(grade>=90){
        grade = grade + 2
        println("You are in A level.")

    }
    else{// else if
        println("You are not in A level.")
    }
    println("Your grade= $grade.")
}