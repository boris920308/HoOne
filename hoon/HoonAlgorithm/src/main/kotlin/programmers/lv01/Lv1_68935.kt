package main.kotlin.programmers.lv01

/**
 *
 * https://school.programmers.co.kr/learn/courses/30/lessons/68935
 */

fun main() {
    solution(45)
}
private fun solution(n: Int): Int {
    return Integer.parseInt(n.toString(3).reversed(), 3)
}

private fun solution_1(n: Int): Int {
    return n.toString(3).reversed().toInt(10)
}