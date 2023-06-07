package main.kotlin.programmers.lv01

/**
 *
 * https://school.programmers.co.kr/learn/courses/30/lessons/131705
 *
 * 삼총사
 * 문제 설명
 * 한국중학교에 다니는 학생들은 각자 정수 번호를 갖고 있습니다.
 * 이 학교 학생 3명의 정수 번호를 더했을 때 0이 되면 3명의 학생은 삼총사라고 합니다.
 * 예를 들어, 5명의 학생이 있고, 각각의 정수 번호가 순서대로 -2, 3, 0, 2, -5일 때, 첫 번째, 세 번째, 네 번째 학생의 정수 번호를 더하면 0이므로 세 학생은 삼총사입니다.
 * 또한, 두 번째, 네 번째, 다섯 번째 학생의 정수 번호를 더해도 0이므로 세 학생도 삼총사입니다.
 * 따라서 이 경우 한국중학교에서는 두 가지 방법으로 삼총사를 만들 수 있습니다.
 *
 * 한국중학교 학생들의 번호를 나타내는 정수 배열 number가 매개변수로 주어질 때, 학생들 중 삼총사를 만들 수 있는 방법의 수를 return 하도록 solution 함수를 완성하세요.
 *
 * 제한사항
 * 3 ≤ number의 길이 ≤ 13
 * -1,000 ≤ number의 각 원소 ≤ 1,000
 * 서로 다른 학생의 정수 번호가 같을 수 있습니다.
 * 입출력 예
 * number	                   result
 * [-2, 3, 0, 2, -5]	        2
 * [-3, -2, -1, 0, 1, 2, 3]	    5
 * [-1, 1, -1, 1]	            0
 *
 * 입출력 예 설명
 * 입출력 예 #1
 *
 * 문제 예시와 같습니다.
 * 입출력 예 #2
 *
 * 학생들의 정수 번호 쌍 (-3, 0, 3), (-2, 0, 2), (-1, 0, 1), (-2, -1, 3), (-3, 1, 2) 이 삼총사가 될 수 있으므로, 5를 return 합니다.
 * 입출력 예 #3
 *
 * 삼총사가 될 수 있는 방법이 없습니다.
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

