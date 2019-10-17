fun main(args:Array<String>) {

    // if
    var n1 = 20
    var n2 = 50
    var max = if (n1 > n2) n1 else n2
    println(max)

    // when
    var age: Int = 25
    var Isyoung = when (age) {
        25 -> true
        else -> false
    }
    println(Isyoung)
}