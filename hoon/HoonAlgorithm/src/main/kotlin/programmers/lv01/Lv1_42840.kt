package programmers.lv01

/**
 *
 * no.42840
 * 모의고사
 * https://school.programmers.co.kr/learn/courses/30/lessons/42840
 */

fun main() {
    solution(intArrayOf(1, 2, 3, 4, 5))
//    solution(intArrayOf(1, 3, 2, 4, 2))
}

private fun solution(answers: IntArray): IntArray {
    var answer = mutableListOf<Int>()

    val people1 = intArrayOf(1, 2, 3, 4, 5)
    val people2 = intArrayOf(2, 1, 2, 3, 2, 4, 2, 5)
    val people3 = intArrayOf(3, 3, 1, 1, 2, 2, 4, 4, 5, 5)
    val score = intArrayOf(0, 0, 0)

    for (i in answers.indices) {
        if (answers[i] == people1[i % people1.size]) {
            score[0]++
        }
        if (answers[i] == people2[i % people2.size]) {
            score[1]++
        }
        if (answers[i] == people3[i % people3.size]) {
            score[2]++
        }
    }

    val maxScore = score.maxOf { it }
    for (i in score.indices) {
        if (score[i] == maxScore) {
            answer.add(i + 1)
        }
    }

    println("answer = ${answer}")

    return answer.toIntArray()
}