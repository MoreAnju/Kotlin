fun main(args:Array<String>){

    var ArrayInt=Array<Int>(5){1}//size 5 and initial value 1 for ll
    ArrayInt[3]=33
    println("Array[3]"+ArrayInt[3])

    for(Element in ArrayInt){//to print all element from array
        println(Element)
    }

    for(index in 1..4)// access by index
    {
        println(ArrayInt[index])
    }

    //---- Array String
    var ArrayString=Array<String>(5){" "}
    for(index in 0..4){
        println("Enter value for String[$index]")
        ArrayString[index]= readLine()!! //null safety- so it should not null
    }
for( x in 0..4)
{
    println(ArrayString[x])
}


}