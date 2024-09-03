package programmers.lv02

/**
 *
 * no.12945
 * 피보나치수
 * https://school.programmers.co.kr/learn/courses/30/lessons/12945
 */

fun main() {
    println(solution(3))
}

private fun solution(n: Int): Int {

    println("- - - start solution - - -")

    if (n <= 1) {
        return n
    }
    var a = 0
    var b = 1

    for (i in 2..n) {
        val temp = (a + b) % 1234567
        a = b
        b = temp
    }

    return b

}