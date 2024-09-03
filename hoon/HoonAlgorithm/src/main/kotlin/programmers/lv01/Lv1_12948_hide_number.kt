package main.kotlin.programmers.lv01

/**
 *
 * https://school.programmers.co.kr/learn/courses/30/lessons/12948
 */

fun main() {
    solution("01033334444")
    solution("027778888")
}

private fun solution(phone_number: String): String {
    var answer = ""
    val numLength = phone_number.length
    for(i in 1..numLength - 4) {
        answer += "*"
    }
    val result = answer + phone_number.subSequence(numLength - 4, numLength)
    return result
}

private fun secondSolution(phone_number: String): String {
    return "${"".padStart(phone_number.length - 4, '*')}${phone_number.takeLast(4)}"
}