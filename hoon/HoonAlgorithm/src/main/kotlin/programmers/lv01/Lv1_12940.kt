package main.kotlin.programmers.lv01

/**
 *
 * https://school.programmers.co.kr/learn/courses/30/lessons/12940
 */

fun main() {
    solution(3, 12)
    println(" - - - - - - - - - - ")
    solution(2, 5)
}

private fun solution(n: Int, m: Int): IntArray {
    var answer = intArrayOf(0, 0)

    answer[0] = findGCD(n, m)
    answer[1] = findLCM(n, m)

    println(answer.toList())

    return answer
}

private fun findGCD(a: Int, b: Int): Int {
    return if (b == 0) {
        a
    } else {
        findGCD(b, a % b)
    }
}

private fun findLCM(a: Int, b: Int): Int {
    val gcd = findGCD(a, b)
    return a * b / gcd
}

