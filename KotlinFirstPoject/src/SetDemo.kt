fun main(args:Array<String>){
    var setElmt= setOf(10,20,30,40,40,40)
    //setElmt.add()----> not allowed

   println("set---Dublicates are not allowed")

    for(ele in setElmt){
        println(ele)
    }
    println("mutable set")// it allow to add elements
    var setElmt2= mutableSetOf(10,20,30,40,40)// dublicates are not allowed
    for(elet in setElmt2){
        println(elet)
    }
    println("After adding elements")
    setElmt2.add(50)
    for(elet in setElmt2){
        println(elet)
    }
}