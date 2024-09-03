package main.kotlin.programmers.lv01

/**
 *
 * https://school.programmers.co.kr/learn/courses/30/lessons/12947
 */

fun main() {
    println("result = ${solution(1)}")
    println("result = ${solution(10)}")
    println("result = ${solution(12)}")
    println("result = ${solution(11)}")
    println("result = ${solution(13)}")
}

private fun solution(x: Int): Boolean {
    val sumX = (x.toString().map { it.toString().toInt() }).sum()

    return x % sumX == 0
}