package programmers.lv01

/**
 *
 * no.134240
 * 푸드 파이트 대회
 * https://school.programmers.co.kr/learn/courses/30/lessons/134240
 */

fun main() {
    solution(intArrayOf(1, 3, 4, 6))
}

private fun solution(food: IntArray): String {
    var answer: String = "0"

    for (foodIndex in food.size downTo 1) {
        var count = food[foodIndex -1]
        var nowPosition = foodIndex - 1

        if (count % 2 != 0) {
            count--
        }

        for (i in count downTo 1) {
            if (i % 2 == 0) {
                answer = nowPosition.toString() + answer
            } else {
                answer += nowPosition.toString()
            }
        }
    }

    return answer
}

private fun anotherSolution (food: IntArray): String {
    val sb = StringBuilder()
    for (i in 1..food.lastIndex) {
        repeat(food[i] / 2) { sb.append(i) }
    }
    val reversed = sb.reversed()
    sb.append(0)
    sb.append(reversed)
    return sb.toString()
}