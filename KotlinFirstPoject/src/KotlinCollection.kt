fun main(args:Array<String>){

    var map= hashMapOf(1 to "aaa", 2 to "bbb")
map.put(3,"ccc")
    println(map.get(3))// access by index

    var arr= arrayOf(1,3,6,3,5)
    println(arr[3])// access by index
println("immutable list")
    var li= listOf(23,45,64)
   // li[2]=10 ---> Once you define you cane not change its value
    println(li[2])
println("Mutable list")
    var li2= mutableListOf(23,45,64)
println("before adding")
    println(li2[2])
    println("After adding")
    li2[2]=12
    println(li2[2])

    println("itms in the list")
    for(item in li2){
        println(item )

    }
}