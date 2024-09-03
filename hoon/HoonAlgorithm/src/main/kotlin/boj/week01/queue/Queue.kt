package boj.week01.queue

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

/**
 *
 * no.10845
 * https://www.acmicpc.net/problem/10845
 */


fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val inputSize = br.readLine().toInt()

    val inputs = mutableListOf<String>()
    repeat(inputSize) {
        inputs.add(br.readLine())
    }

    val stack = LinkedList<Int>()
    val result = StringBuilder()
    inputs.forEach {
        when (it.substringBefore(" ")) {
            "push" -> stack.addLast(it.substringAfter(" ").toInt())
            "pop" -> result.appendLine(if (stack.isEmpty()) "-1" else "${stack.removeFirst()}")
            "size" -> result.appendLine("${stack.size}")
            "empty" -> result.appendLine(if (stack.isEmpty()) "1" else "0")
            "front" -> result.appendLine(if (stack.isEmpty()) "-1" else "${stack.first}")
            "back" -> result.appendLine(if (stack.isEmpty()) "-1" else "${stack.last}")
        }
    }
    println(result)
}