package main.kotlin.programmers.lv01

/**
 *
 * https://school.programmers.co.kr/learn/courses/30/lessons/12935
 */

fun main() {
    solution(intArrayOf(4,3,2,1))
    solution(intArrayOf(10))
    solution(intArrayOf())
}

private fun solution(arr: IntArray): IntArray {
    if (arr.isEmpty()) return intArrayOf(-1)

    var answer = intArrayOf()
    var minValue = arr.first();

    arr.forEach {
        if (it < minValue) {
            minValue = it
        }
    }
    answer = arr.filter { it != minValue }.toIntArray()
    if (answer.isEmpty()) return intArrayOf(-1)
    return answer
}

//private fun solution_1(arr: IntArray): IntArray {
//    if (arr.size == 1) return intArrayOf(-1)
//    return arr.sorted().toIntArray().copyOfRange(1, arr.size);
//}

private fun solution_2(arr: IntArray): IntArray = if(arr.size == 1) intArrayOf(-1)
                                                else arr.filter { it != arr.min() }.toIntArray()