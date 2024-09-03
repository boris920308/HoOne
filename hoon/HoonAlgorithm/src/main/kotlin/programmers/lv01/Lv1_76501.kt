package main.kotlin.programmers.lv01

/**
 *
 * https://school.programmers.co.kr/learn/courses/30/lessons/76501
 *
 */

fun main() {
    solution(intArrayOf(4, 7, 12), booleanArrayOf(true, false, true))
    solution(intArrayOf(1, 2, 3), booleanArrayOf(false, false, true))
}

private fun solution(absolutes: IntArray, signs: BooleanArray): Int {

    signs.forEachIndexed { index, b ->
        if(!b) {
            absolutes[index] = absolutes[index] * -1
        }
    }

    return absolutes.sum()
}