package basics

fun main() {
    decisions()
    loops()
}

fun decisions() {

    var inputOne = 12
    var inputTwo = 5

    if(inputOne > inputTwo) {
        println("inputOne is greater than inputTwo")
    } else {
        println("inputTwo is greater than inputOne")
    }

    val highers = if(inputOne > inputTwo) inputOne else inputTwo
    println("The higher number is $highers")
}

fun loops() {

    println("Simple incremental loop")
    for(i in 1..10) {
        println("This is the $i th iteration")
    }

    println("Simple decremental loop")
    for(i in 10 downTo 1) {
        println("This is the $i th iteration")
    }

    println("Simple loop with step")
    for(i in 1..10 step 2) {
        println("This is the $i th iteration")
    }

    val list = listOf(1, 2, 3, 4, 5);

    for(i in list) {
        println("This is the $i th iteration")
    }

    for((index, value) in list.withIndex()) {
        println("The element at $index is $value")
    }

    val str = "Hello World"
    for(c in str) {
        println(c)
    }


}