package programmers.lv01

import kotlin.math.max

/**
 * no.135808
 * 과일 장수
 * https://school.programmers.co.kr/learn/courses/30/lessons/135808
 */

fun main() {
    solution(3, 4, intArrayOf(1, 2, 3, 1, 2, 3, 1)) //8
//    println(solution(4, 3, intArrayOf(4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2)))
}

private fun solution(k: Int, m: Int, score: IntArray): Int {
    return 0
}

private fun timeOverSolution(k: Int, m: Int, score: IntArray): Int {
    var answer = 0
    var sortedScore = score.sortedDescending()
    var appleBox = mutableListOf<IntArray>()

    while (sortedScore.size >= m) {
        val tempAppleBox = sortedScore.filterIndexed { index, _ -> index < m }
        appleBox.add(tempAppleBox.toIntArray())
        sortedScore = sortedScore.filterIndexed { index, _ -> index >= m }
    }

    appleBox.forEach {
        answer += (it.minOf { it } * it.size)
    }

    return answer
}