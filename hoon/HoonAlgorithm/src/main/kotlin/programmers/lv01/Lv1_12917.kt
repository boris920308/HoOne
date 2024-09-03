package main.kotlin.programmers.lv01

/**
 *
 * https://school.programmers.co.kr/learn/courses/30/lessons/12917
 */

fun main() {
    println(solution("Zbcdefg"))
//    solution("Zbcdefg")
}

private fun solution(s: String): String {
    return s.toCharArray().sortedDescending().joinToString("")
}