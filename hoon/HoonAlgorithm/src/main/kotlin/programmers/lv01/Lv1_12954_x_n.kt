package main.kotlin.programmers.lv01


/**
 *
 * https://school.programmers.co.kr/learn/courses/30/lessons/12954
 */

fun main() {
    println("result = ${solution(2, 5).toList()}")
    println("result = ${secondSolution(4, 3).toList()}")
    println("result = ${solution(-4, 2).toList()}")
    println("result = ${secondSolution(0, 3).toList()}")
}

private fun solution(x: Int, n: Int): LongArray {
    val answer = LongArray(n)

    for (i in 0 until n) {
        answer[i] = x * (i.toLong() + 1);
    }

    return answer
}

private fun secondSolution(x: Int, n: Int): LongArray = LongArray(n) { i -> x.toLong() * (i+1) }
