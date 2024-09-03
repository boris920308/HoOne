package main.kotlin.programmers.lv01

/**
 *
 * https://school.programmers.co.kr/learn/courses/30/lessons/86051?language=kotlin
 */

fun main() {
    solution(intArrayOf(1,2,3,4,6,7,8,0))
}

private fun solution(numbers: IntArray): Int {
    var answer: Int = 0

    for (i in 0..9) {
        if (!(numbers.contains(i))) {
            answer += i
        }
    }

    println("answer = $answer")

    return answer
}

private fun solution_1(numbers: IntArray): Int = (0..9).filterNot(numbers::contains).sum()

private fun solution_2(numbers: IntArray): Int  = 45 - numbers.sum()