package boj.week01

import java.util.*

/**
 *
 * no.8393
 * https://www.acmicpc.net/problem/8393
 */

fun main(args: Array<String>) {
    val n = Scanner(System.`in`).nextLine()
    var answer = 0
    for (index in 1..n.toInt()) {
        answer += index
    }
    println("$answer")
}