package main.kotlin.programmers.lv01

/**
 *
 * https://school.programmers.co.kr/learn/courses/30/lessons/12922
 */

fun main() {
    solution(3)
    println("- - - - - - - - - - -")
    solution(4)
    println("- - - - - - - - - - -")
    solution(0)
}

private fun solution(n: Int): String {
    var answer = ""

    for (index in 1..n) {
        answer += if (index % 2 == 0) {
            "박"
        } else {
            "수"
        }
    }

    return answer
}