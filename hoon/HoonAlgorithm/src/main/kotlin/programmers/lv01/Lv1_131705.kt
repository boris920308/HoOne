package main.kotlin.programmers.lv01

/**
 *
 * https://school.programmers.co.kr/learn/courses/30/lessons/131705
 */

fun main() {
//    solution(intArrayOf(-2, 3, 0, 2, -5))

    solution(intArrayOf(-3, -2, -1, 0, 1, 2, 3))
}

private fun solution(number: IntArray): Int {
    var answer: Int = 0
    var index = 0


    while (index < number.size) {
        val firstValue = number[index]
        val removedArr = number.copyOfRange(index + 1, number.size)
        var innerIndex = 0

        while (innerIndex < removedArr.size) {
            val secondValue = removedArr[innerIndex]
            val removedArr_2 = removedArr.copyOfRange(innerIndex + 1, removedArr.size)

            removedArr_2.forEach {
                if ((firstValue + secondValue + it) == 0) {
                    println("find trio!, firstValue = $firstValue, secondValue = $secondValue, thirdValue = $it")
                    answer++
                }
            }
            innerIndex++
        }
        println(" - - - - - - - - - - - - - - - - - - ")
        index++
    }

    println("answer = $answer")
    return answer
}

