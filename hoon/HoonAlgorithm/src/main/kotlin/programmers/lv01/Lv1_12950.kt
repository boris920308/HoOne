package main.kotlin.programmers.lv01

/**
 *
 * https://school.programmers.co.kr/learn/courses/30/lessons/12950
 */

fun main() {
    solution(arrayOf(intArrayOf(1,2), intArrayOf(2,3)), arrayOf(intArrayOf(3,4), intArrayOf(5,6)))
}

private fun solution(arr1: Array<IntArray>, arr2: Array<IntArray>): Array<IntArray> {
    val rowSize = arr1.size
    val colSize = arr1[0].size
    val answer = Array(rowSize) { IntArray(colSize) }

    for (i in 0 until rowSize) {
        for (j in 0 until colSize) {
            answer[i][j] = arr1[i][j] + arr2[i][j]
        }
    }
    
    return answer
}