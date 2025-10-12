package basics

fun main() {
    Functions()
}

/*
1: Standard functions
2: Extension functions
3: infix functions
4: tail recursive functions
5: higher order functions
6: anonymous functions
7: lambda functions
8: local functions
9: operator functions
10: member functions


*/
fun Functions() {
    functionOne("Standard function")

    functionTwo()

    functionThree()

    functionFour()

    functionFive()

    functionSix()

    functionSeven()

    functionEight()

    functionNine()

    functionTen()
}

//These are the common functions you’d define using the fun keyword.
fun functionOne(text: String) {
    println("This is a $text")
}

//Extension functions are a way to add functions to existing classes in Kotlin.
fun functionTwo() {
    val str = "Extension function"
    val result = str.extensionFunction()
    println("Result of extension function: $result")
}

private fun String.extensionFunction(): String {
    return this.reversed()
}

/*
Infix functions allow you to call functions with a special syntax, using infix notation.
They must have a single parameter and are defined using the infix keyword.
Infix functions are often used for operations that feel natural in an infix form.
The infix modifier is required.

**/
fun functionThree() {
    val result = 5 add 3
    println("infix function result: $result")
}

infix fun Int.add(num: Int): Int {
    return this + num
}

/*
Kotlin supports tail recursion,
which allows recursive functions to be transformed to iterative loops,
preventing stack overflow errors.
**/
fun functionFour() {
    val sum = sum(10)
    println("Result of tail recursion: $sum")
}

tailrec fun sum(n: Int, acc: Int = 0): Int {
    return if (n == 0) acc
    else sum(n - 1, acc + n)
}

//Higher order functions are functions that take functions as parameters,
// or return functions.
fun functionFive() {
    val sum = operateOnNumbers(20, 30, { x, y -> x + y })
    println("Result of a higher-order function: $sum")
}

fun operateOnNumbers(a: Int, b: Int, operation: (Int, Int) -> Int): Int {
    return operation(a, b)
}

//Anonymous functions are functions that are not declared, but passed immediately as an expression.
//Anonymous functions are useful for one-time use cases.
//The body of the anonymous function is defined just after the opening and closing curly braces.
//The return type of the anonymous function is inferred.
fun functionSix() {
    val multiplier = fun(x: Int, y: Int): Int { return x * y}
    val result = multiplier(5, 10)
    println("result of anonymous function: $result")
}

//Lambda functions are short, simple and easy to use anonymous functions.
//They are defined using the {} curly braces and have a body defined after the opening curly brace.
//The return type is optional if it can be inferred.
fun functionSeven() {
    val sum: (Int, Int) -> Int = { x, y -> x + y }
    val result = sum(5, 10)
    println("result of lambda function: $result")
}

//Local functions are functions defined inside another function.
fun functionEight() {
    outerFunction()
}

fun outerFunction() {
    println("I'm the outer function!")

    fun innerFunction() {
        println("I'm the inner function!")
    }
    innerFunction()
}

//Operator functions allow you to define custom behavior for operators when applied to your classes.
//You can overload operators by defining functions with specific names and the operator modifier.
//For example, you can define how the + operator works for a custom class by defining a function named plus.
fun functionNine() {
    val point1 = Point(3, 4)
    val point2 = Point(1, 2)
    val resultPoint = point1 + point2
    println("Result of an Operator function: $resultPoint")  // Outputs: Point(x=4, y=6)
}

data class Point(val x: Int, val y: Int) {
    operator fun plus(other: Point): Point {
        return Point(x + other.x, y + other.y)
    }
}

class Calculator {
    fun add(a: Int, b: Int): Int {
        return a + b
    }
}

//Member functions are functions that are defined inside a class.
//They are prefixed with the dot operator.
fun functionTen() {
    val calculator = Calculator()
    val result = calculator.add(5, 10)
    println("Result of a Member function: $result")
}