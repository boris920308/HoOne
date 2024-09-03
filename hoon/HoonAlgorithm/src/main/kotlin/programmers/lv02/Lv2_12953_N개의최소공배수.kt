package programmers.lv02

/**
 *
 * no12953
 * N개의 최소공배수
 * https://school.programmers.co.kr/learn/courses/30/lessons/12953
 */

fun main() {
    solution(intArrayOf(2,6,8,14))
}

private fun solution(arr: IntArray): Int {
    var num = 2
    while (true) {
        var isSolution = true
        arr.forEach {
            if (num % it != 0) {
                isSolution = false
            }
        }

        if (isSolution) {
            return num
        }
        num++
    }
}