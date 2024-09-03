package main.kotlin.programmers.lv01

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/12933?language=kotlin
 */

fun main() {
    solution(118372)
}

private fun solution(n: Long): Long = (n.toString().map { it.toString().toInt() })
        .toList()
        .sortedDescending()
        .joinToString("")
        .toLong()

private fun secondSolution(n: Long): Long {
    var answer: Long = 0
    val digits = (n.toString().map { it.toString().toInt() }).toList().sortedDescending()
    answer = digits.joinToString("").toLong()
    return answer
}