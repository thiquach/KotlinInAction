package main.kotlin

fun main () {
    val index = 9
    val result : Int = fib(index)

    println("Fibonacci number of $index is $result")
}

fun fib(n: Int): Int {
    if (n == 0) return 0
    if (n == 1) return 1
    return fib(n-1) + fib(n-2)
}