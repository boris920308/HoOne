package boj.week01

import java.util.*

/**
 *
 * no.8393
 * https://www.acmicpc.net/problem/8393
 *
 * 문제
 * n이 주어졌을 때, 1부터 n까지 합을 구하는 프로그램을 작성하시오.
 *
 * 입력
 * 첫째 줄에 n (1 ≤ n ≤ 10,000)이 주어진다.
 *
 * 출력
 * 1부터 n까지 합을 출력한다.
 *
 * 예제 입력 1
 * 3
 * 예제 출력 1
 * 6
 *
 */

fun main(args: Array<String>) {
    val n = Scanner(System.`in`).nextLine()
    var answer = 0
    for (index in 1..n.toInt()) {
        answer += index
    }
    println("$answer")
}