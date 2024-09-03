package main.kotlin.programmers.lv01

import kotlin.math.pow
import kotlin.math.sqrt


/**
 *
 * https://school.programmers.co.kr/learn/courses/30/lessons/12934
 */


fun main() {
    println("result = ${solution(12)}")
    println("result = ${solution(13)}")
    println("result = ${solution(121)}")
    println("result = ${solution(3)}")
}


private fun solution(n: Long): Long{
    var answer:Long = 0
    val sqrt = sqrt(n.toDouble()).toLong()
    println("n = $n , sqrt = $sqrt")

    answer = if (sqrt * sqrt == n) {
        (sqrt + 1).toDouble().pow(2.0).toLong()
    } else {
        -1
    }
    return answer

}