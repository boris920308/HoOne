package boj.week01.heap

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

/**
 *
 * no.1972
 * https://www.acmicpc.net/problem/1927
 */

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val inputSize = br.readLine().toInt()

    val inputs = mutableListOf<String>()
    repeat(inputSize) {
        inputs.add(br.readLine())
    }

    val pq = PriorityQueue<Int>()
    val result = StringBuilder()
    inputs.forEach {
        when (it.toInt()) {
            0 -> {
                if (pq.isEmpty()) {
                    result.appendLine("0")
                } else {
                    result.appendLine("${pq.peek()}")
                    pq.poll()
                }
            }
            else -> {
                pq.add(it.toInt())
            }
        }
    }
    println(result)
}