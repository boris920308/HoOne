package main.kotlin.programmers.lv01

/**
 *
 * https://school.programmers.co.kr/learn/courses/30/lessons/12912
 *
 */

fun main() {
    solution(3, 5)
    solution(3, 3)
    solution(5, 3)

}

private fun solution(a: Int, b: Int): Long {
    var answer: Long = 0

    if (a > b) {
        for (i in b..a) {
            answer += i
        }
    } else {
        for (i in a..b) {
            answer += i
        }
    }
    return answer
}

private fun secondSolution(a: Int, b: Int): Long {
    val start : Long = (if(a>b) b else a).toLong()
    val end : Long = (if(a>b) a else b).toLong()
    return (start..end).sum()
}