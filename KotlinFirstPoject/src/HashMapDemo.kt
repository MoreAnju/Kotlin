fun main(args:Array<String>){
 var HashMapDemo=HashMap<Int,String>()
    HashMapDemo.put(1,"Aaaa")
    HashMapDemo.put(2,"Bbb")
    HashMapDemo.put(3,"Ccc")
    println(HashMapDemo.get(3))

    for(Item in HashMapDemo.keys){
        println(HashMapDemo.get(Item))
    }
}