package main.kotlin.programmers.lv01

import kotlin.math.ceil
import kotlin.math.sqrt

/**
 *
 * https://school.programmers.co.kr/learn/courses/30/lessons/12928
 */


private fun findDivisors(number: Int): List<Int> {
    val divisors = mutableListOf<Int>()
    if (number == 1) {
        divisors.add(1)
    }
    val sqrt = ceil(sqrt(number.toDouble())).toInt()
    println("get number = $number , sqrt = $sqrt")

    for (i in 1 until sqrt) {
        if (number % i == 0) {
            divisors.add(i)
            divisors.add(number / i)
        }
    }
    if(sqrt * sqrt == number) {
        divisors.add(sqrt)
    }

    return divisors
}


private fun solution(n: Int): Int {
    if (n == 1) return 1

    var answer = 0
    val sqrt = ceil(sqrt(n.toDouble())).toInt()

    for (i in 1 until sqrt) {
        if (n % i == 0) {
            answer += i
            answer += (n / i)
        }
    }

    if(sqrt * sqrt == n) {
        answer += sqrt
    }

    return answer
}

fun main() {
    println("findDivisors(0) = ${findDivisors(0).sorted()}")
    println("input = 0, result = ${solution(0)}")
    println(" * * * * * ")
    println("findDivisors(1) = ${findDivisors(1).sorted()}")
    println("input = 1, result = ${solution(1)}")
    println(" * * * * * ")
    println("findDivisors(2) = ${findDivisors(2).sorted()}")
    println("input = 2, result = ${solution(2)}")
    println(" * * * * * ")
    println("findDivisors(16) = ${findDivisors(16).sorted()}")
    println("input = 16, result = ${solution(16)}")
    println(" * * * * * ")
}