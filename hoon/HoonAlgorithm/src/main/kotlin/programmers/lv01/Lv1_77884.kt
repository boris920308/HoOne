package main.kotlin.programmers.lv01

import kotlin.math.sqrt

/**
 *
 * https://school.programmers.co.kr/learn/courses/30/lessons/77884
 */

fun main() {
    solution(13, 17)
}

private fun solution(left: Int, right: Int): Int {
    var answer: Int = 0

    for (i in left..right) {
        if (countDivisors(i) % 2 == 0) {
            answer += i
        } else {
            answer -= i
        }
    }

    println(answer)

    return answer
}

private fun countDivisors(n: Int): Int {
    var count = 0
    val sqrtN = sqrt(n.toDouble()).toInt()

    for (i in 1..sqrtN) {
        if (n % i == 0) {
            count += 2 // i와 n/i는 모두 약수이므로 2를 추가
        }
    }

    // 만약 n이 제곱수인 경우 중복으로 카운트된 약수를 제거
    if (sqrtN * sqrtN == n) {
        count--
    }

    return count
}