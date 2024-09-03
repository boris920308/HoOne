package programmers.lv01

/**
 *
 * no.138477
 * 명예의 전당(1)
 *https://school.programmers.co.kr/learn/courses/30/lessons/138477
 */

fun main() {
//    solution(3, intArrayOf(10, 100, 20, 150, 1, 100, 200))

    solution(5, intArrayOf(10, 100, 20))

//    solution(3, intArrayOf(100, 30, 40, 150, 300, 200, 200))
}


private fun solution(k: Int, score: IntArray): IntArray {
    var answer = mutableListOf<Int>()
    var scoreHolder = mutableListOf<Int>()

    println("start, scoreHolder = ${scoreHolder}")

    score.forEach { currentScore ->
        println(" -> -> ->  -> -> ->  -> -> -> currentScore = $currentScore")

        if (scoreHolder.isEmpty() || scoreHolder.size < k) {
            scoreHolder.add(currentScore)
            scoreHolder = scoreHolder.sorted().toMutableList()
            answer.add(scoreHolder.minOf{ it })
            return@forEach
        }

        println("berfore if ~ , scoreHolder = ${scoreHolder}")

        if (currentScore > scoreHolder.minOf{ it }) {
            println("currentScore > scoreHolder.min()")
            if (scoreHolder.size < k) {
                scoreHolder.add(currentScore)
            } else {
                scoreHolder[0] = currentScore
            }
        }
        scoreHolder = scoreHolder.sorted().toMutableList()
        answer.add(scoreHolder.minOf{ it })
        println(" * * * * *  scoreHolder = ${scoreHolder}")
    }

    println("answer = ${answer.toList()}")
    return answer.toIntArray()
}