package boj.week02.recursive_function

import java.util.*


/**
 *
 * no.10870
 * https://www.acmicpc.net/problem/10870
 */


fun main() {
    val inputValue = Scanner(System.`in`)
    println("${fibonacci(inputValue.nextInt())}")
}

fun fibonacci(n: Int): Int {
    if (n <= 1) {
        return n
    }
    return fibonacci(n - 1) + fibonacci(n - 2)
}
