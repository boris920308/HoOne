package boj.week01.stack

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

/**
 *
 * no.8393
 * https://www.acmicpc.net/problem/8393
 *
 * 시간 제한	메모리 제한	제출	정답	맞힌 사람	정답 비율
 * 0.5 초 (추가 시간 없음)	256 MB	207899	73475	53572	37.301%
 * 문제
 * 정수를 저장하는 스택을 구현한 다음, 입력으로 주어지는 명령을 처리하는 프로그램을 작성하시오.
 *
 * 명령은 총 다섯 가지이다.
 *
 * push X: 정수 X를 스택에 넣는 연산이다.
 * pop: 스택에서 가장 위에 있는 정수를 빼고, 그 수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
 * size: 스택에 들어있는 정수의 개수를 출력한다.
 * empty: 스택이 비어있으면 1, 아니면 0을 출력한다.
 * top: 스택의 가장 위에 있는 정수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
 * 입력
 * 첫째 줄에 주어지는 명령의 수 N (1 ≤ N ≤ 10,000)이 주어진다. 둘째 줄부터 N개의 줄에는 명령이 하나씩 주어진다. 주어지는 정수는 1보다 크거나 같고, 100,000보다 작거나 같다. 문제에 나와있지 않은 명령이 주어지는 경우는 없다.
 *
 * 출력
 * 출력해야하는 명령이 주어질 때마다, 한 줄에 하나씩 출력한다.
 *
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