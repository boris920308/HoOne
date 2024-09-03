package main.kotlin.boj.week03_dp

import java.util.*
import kotlin.math.max

/**
 *
 * no.2579
 * https://www.acmicpc.net/problem/2579
 */

fun main() {
    val size = System.`in`.bufferedReader().readLine().toInt()
    val stairs = IntArray(size + 1)
    val dp = IntArray(size + 1)

//    for(i in 1 .. size) {
//        stairs[i] = System.`in`.bufferedReader().readLine().toInt()
//    }

    for (n in 1..size) stairs[n] = System.`in`.bufferedReader().readLine().toInt()

    when (size) {
        1 -> println(stairs[1])
        2 -> println(stairs[1] + stairs[2])
        3 -> println(stairs[3] + max(stairs[1], stairs[2]))
        else -> {
            dp[1] = stairs[1]
            dp[2] = stairs[1] + stairs[2]
            dp[3] = stairs[3] + max(stairs[1], stairs[2])
            for (i in 4..size) {
                dp[i] = stairs[i] + max(dp[i - 2], stairs[i - 1] + dp[i -3])
            }
            println(dp[size])
        }
    }
}


fun main(args: Array<String>) {
    val N = readLine()!!.toInt()
    val S = IntArray(N + 1)
    val dp = IntArray(N + 1)

    for (n in 1..N) S[n] = readLine()!!.toInt()

    when (N) {
        1 -> println(S[1])
        2 -> println(S[1] + S[2])
        3 -> println(S[3] + max(S[1], S[2]))
        else -> {
            dp[1] = S[1]
            dp[2] = S[2] + S[1]
            dp[3] = S[3] + max(S[1], S[2])

            for (n in 4..N)
                dp[n] = S[n] + max(dp[n - 2], S[n - 1] + dp[n - 3])

            println(dp[N])
        }
    }
}

//fun main(args: Array<String>) = with(System.`in`.bufferedReader()) {
//    val N = readLine().toInt()
//    val S = IntArray(N + 1)
//    val dp = IntArray(N + 1)
//
//    for (n in 1..N) S[n] = readLine().toInt()
//
//    when (N) {
//        1 -> println(S[1])
//        2 -> println(S[1] + S[2])
//        3 -> println(S[3] + max(S[1], S[2]))
//        else -> {
//            dp[1] = S[1]
//            dp[2] = S[2] + S[1]
//            dp[3] = S[3] + max(S[1], S[2])
//
//            for (n in 4..N)
//                dp[n] = S[n] + max(dp[n - 2], S[n - 1] + dp[n - 3])
//
//            println(dp[N])
//        }
//    }
//}