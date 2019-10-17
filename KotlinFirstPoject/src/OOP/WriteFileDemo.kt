package OOP

import java.io.FileWriter


fun WriteDemo(str:String) {
    try {
        var fo = FileWriter("File.txt")
        fo.write(str)
        fo.close()
    } catch (ex:Exception){
        println("Error is handled")
    }
}
fun main(args:Array<String>){
println("Writing in the file")
    WriteDemo("Anju More")


}