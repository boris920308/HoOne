package main.kotlin.programmers.lv01

/**
 *
 * https://school.programmers.co.kr/learn/courses/30/lessons/70128
 */

fun main() {
    solution(intArrayOf(1,2,3,4), intArrayOf(-3,-1,0,2))
}

private fun solution(a: IntArray, b: IntArray): Int {
    var answer: Int = 0
    for (i in a.indices) {
        answer += a[i] * b[i]
    }
    return answer
}