package main.kotlin.programmers.lv01

/**
 *
 * https://school.programmers.co.kr/learn/courses/30/lessons/12930
 */

fun main() {
    println(solution("try hello world"))
    println(solution("try   hello world   "))
}

private fun solution(s: String): String {
    var answer = ""

    s.split(' ').map{
        for (i in it.indices) {
            answer += if (i % 2 == 0) {
                it[i].uppercase()
            } else {
                it[i].lowercase()
            }
        }

        answer += " "
    }

    return answer.substring(0, answer.length - 1)
}