fun main(args:Array<String>){
    var ArrayDemo=ArrayList<String>()
    ArrayDemo.add("Aaa")
    ArrayDemo.add("Bbb")
    ArrayDemo.add("Ccc")
    ArrayDemo.add("Ddd")
//access element
    for(item in ArrayDemo){
        println(item)
    }
 // access by index
    println("---------------------------")
    for(index in 0..ArrayDemo.size-1){
        println(ArrayDemo.get(index))
    }
    if(ArrayDemo.contains("Aaa")){
        println("Yes Present")
    }
    else
    {
        println("Not Found")
    }
}