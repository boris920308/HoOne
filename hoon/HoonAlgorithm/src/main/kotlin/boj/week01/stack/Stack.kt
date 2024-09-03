package boj.week01.stack

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

/**
 *
 * no.10828
 * https://www.acmicpc.net/problem/10828
 */


// 시간초과
//fun main() {
//
//    val scanner = Scanner(System.`in`)
//    val inputSize = scanner.nextInt()
//    scanner.nextLine() // 버퍼 지우기
//
//    val inputs = mutableListOf<String>()
//    repeat(inputSize) {
//        val input = scanner.nextLine()
//        inputs.add(input)
//    }
//
//    val stack = ArrayDeque<Int>()
//    inputs.forEach {
//        if (it.contains("push")) {
//            stack.addLast(it.substringAfter(" ").toInt())
//        } else if(it.contains("pop")) {
//            if (stack.isNotEmpty()) {
//                println("${stack.last}")
//                stack.removeLast()
//            } else {
//                println("-1")
//            }
//        } else if (it.contains("size")) {
//            println("${stack.size}")
//        } else if (it.contains("empty")) {
//            if (stack.isEmpty()) {
//                println("1")
//            } else {
//                println("0")
//            }
//        } else if (it.contains("top")) {
//            if (stack.isNotEmpty()) {
//                println("${stack.last}")
//            } else {
//                println("-1")
//            }
//        }
//    }
//}



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
            "pop" -> result.appendLine(if (stack.isEmpty()) "-1" else "${stack.removeLast()}")
            "size" -> result.appendLine("${stack.size}")
            "empty" -> result.appendLine(if (stack.isEmpty()) "1" else "0")
            "top" -> result.appendLine(if (stack.isEmpty()) "-1" else "${stack.last}")
        }
    }
    println(result)
}