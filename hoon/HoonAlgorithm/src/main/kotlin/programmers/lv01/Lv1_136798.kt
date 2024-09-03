package programmers.lv01

import kotlin.math.sqrt

/**
 *
 * no.136798
 * 기사단원의 무기
 * https://school.programmers.co.kr/learn/courses/30/lessons/136798
 */

fun main() {
//    solution(5, 3, 2) // result = 10
    solution(10, 3, 2) // result = 21

}

private fun solution(number: Int, limit: Int, power: Int): Int {
    var answer: Int = 0

    for(i in 1..number) {
        if (countDivisors(i) <= limit) {
            answer += countDivisors(i)
        } else {
            answer += power
        }
    }

    println("answer = $answer")
    return answer
}

private fun countDivisors(n: Int): Int {
    val divisors = arrayListOf<Int>()
    val sqrtN = sqrt(n.toDouble()).toInt()

    for (i in 1..sqrtN) {
        if (n % i == 0) {
            divisors.add(i)
            if (n / i != i) {
                divisors.add(n / i)
            }
        }
    }

    return divisors.size
}