package main.kotlin.programmers.lv01


/**
 *
 * https://school.programmers.co.kr/learn/courses/30/lessons/82612
 */

fun main() {
    println(solution(3, 20, 4))
}

private fun solution(price: Int, money: Int, count: Int): Long {
    var answer: Long = 0

    for (i in 1..count) {
        answer += i * price
    }

    return if (answer - money >= 0) {
        answer - money
    } else {
        0
    }

}