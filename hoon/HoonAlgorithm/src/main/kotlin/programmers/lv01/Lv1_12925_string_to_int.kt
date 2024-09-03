package main.kotlin.programmers.lv01


/**
 *
 * https://school.programmers.co.kr/learn/courses/30/lessons/12925
 */

fun main() {
    println("result = ${solution("1234")}")
    println("result = ${solution("-1234")}")

}

private fun solution(s: String): Int = s.toInt()

