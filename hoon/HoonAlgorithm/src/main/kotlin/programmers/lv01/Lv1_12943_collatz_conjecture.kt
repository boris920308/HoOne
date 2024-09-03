package main.kotlin.programmers.lv01

/**
 *
 * https://school.programmers.co.kr/learn/courses/30/lessons/12943
 */

fun main() {
    println("result = ${solution(1)}")
    println("result = ${solution(6)}")
    println("result = ${solution(16)}")
    println("result = ${solution(626331)}")
}

private fun solution(num: Int): Int {
    var answer = 0
    var result = num.toLong()

    while (result.toInt() != 1) {
        if ((result % 2).toInt() == 0) {
            result = result / 2
        } else {
            result = (result * 3) + 1
        }
        answer++
        if (answer == 500) {
            answer = -1
            break
        };
    }
    return answer
}