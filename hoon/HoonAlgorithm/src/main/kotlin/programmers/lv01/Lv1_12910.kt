package main.kotlin.programmers.lv01

/**
 *
 * https://school.programmers.co.kr/learn/courses/30/lessons/12910
 */

fun main() {
    solution(intArrayOf(5, 9, 7, 10), 5)
    solution(intArrayOf(2, 36, 1, 3), 1)
    solution(intArrayOf(3, 2, 6), 10)

}

private fun solution(arr: IntArray, divisor: Int): IntArray {
    var answer = mutableListOf<Int>()

    for (item in arr) {
        if (item % divisor == 0) {
            answer.add(item)
        }
    }

    if (answer.isEmpty()) answer.add(-1)
    return answer.sorted().toIntArray()
}