package main.kotlin

fun main () {
    val number = 9
    val result : Int = fib(number)

    println("Factorial of $number is $result")
}

fun factorial(n: Int): Int {
    if (n == 0) return 1
    return n * factorial(n-1)
}