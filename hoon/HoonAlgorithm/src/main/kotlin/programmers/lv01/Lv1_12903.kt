package main.kotlin.programmers.lv01

/**
 *
 * https://school.programmers.co.kr/learn/courses/30/lessons/12903
 */

fun main() {
    solution("abcde")
    println(" - - - - - - - - - - - - - - ")
    solution("qwer")
}

private fun solution(s: String): String {
    val sArr = s.toCharArray()

    return if (sArr.size % 2 == 0) {
        sArr[sArr.size / 2 - 1].toString() + sArr[sArr.size / 2].toString()
    } else {
        sArr[sArr.size / 2].toString()
    }
}