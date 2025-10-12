package basics

fun main() {
    Variables() //functions is the same as Java.
}

fun Variables() {

    //var for mutable variables
    var mutableVariable = 4
    mutableVariable = 5

    //val for immutable variables
    val immutableVariable = 4

    println(mutableVariable)
    println(immutableVariable)
    println("mutableVariable = $mutableVariable, immutableVariable = $immutableVariable")

    val total = add(mutableVariable, immutableVariable)

    println("total = $total")
}

fun add(a: Int, b: Int): Int {
    return a + b
}