fun main(args:Array<String>){

   loop@ for(X in 1..10)
    {
        println("Outer loop:"+X)
        for(Y in 1..5)
        {
         if(Y==3){ // will only break inner loop to break oute loop will use loop keyword
            break@loop
         }
            println("Inner loop:"+Y)
        }
    }
}