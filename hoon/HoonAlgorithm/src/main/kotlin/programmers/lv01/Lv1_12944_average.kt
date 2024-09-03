package main.kotlin.programmers.lv01

/**
 *
 * https://school.programmers.co.kr/learn/courses/30/lessons/12944
 */
fun main() {
    println(solution(intArrayOf(1, 2, 3, 4)))
    println(solution(intArrayOf(5, 5)))
}

private fun solution(arr: IntArray): Double {
    var answer: Double = 0.0

    answer = arr.average()

    return answer
}