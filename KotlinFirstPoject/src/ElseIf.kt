fun main(args:Array<String>){
    println("Enter your grades=")
    var grade:Double= readLine()!!.toDouble()
    if(grade>=90){
        grade = grade + 2
        println("You are in A level.")

    }
    else if(grade>=80 && grade <=90)
    {// else if
        println("You are in B level.")
    }
    else if(grade>=70 && grade <=80)
    {// else if
        println("You are in c level.")
    }
    else
    {
        println("You pass the class")
    }
    println("Your grade= $grade.")
}