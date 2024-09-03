/**
 *  프로그래머스 Lv.1 체육복 < 탐욕법 >
 *  https://school.programmers.co.kr/learn/courses/30/lessons/42862
 */


fun main() {
    solution(5, intArrayOf(2,4), intArrayOf(1,3,5)) // return 5
    solution(5, intArrayOf(2,4), intArrayOf(3)) // return 4
    solution(3, intArrayOf(3), intArrayOf(1)) // return 2
    solution(2, intArrayOf(1), intArrayOf(1)) //
    solution(20, intArrayOf(17, 16, 13, 2, 4, 6, 7, ), intArrayOf(15, 16, 1, 2, 3, 4, 5, 6, 7, 8)) //
}
private fun solution(n: Int, lost: IntArray, reserve: IntArray): Int {
    println(" * * * * * * * * run solution * * * * * * * * ")
    var answer = 0

    val commonElements = reserve.intersect(lost.toList()).toIntArray() // a와 b 배열에서 공통 요소를 찾아내기
    var resultReserve = reserve.filterNot { commonElements.contains(it) }.sorted() // a 배열에서 공통 요소를 제외한 배열을 반환
    val resultLost = lost.filterNot { commonElements.contains(it) }.sorted()

    println("resultReserve = ${resultReserve.toList()}")

    for (index in 1 .. n) {
        println("--- loop start index = ${index}, answer = $answer --- ")
        if (resultLost.contains(index)) {
            println("sortedLost.contains $index")
            if (resultReserve.contains(index - 1)) {
                resultReserve = resultReserve.filter { it != index - 1 }
                answer++
                println("-1 빌림 ! resultReserve = ${resultReserve.toList()}")
                continue
            }
            if (resultReserve.contains(index + 1)) {
                resultReserve = resultReserve.filter { it != index + 1 }.sorted()
                answer++
                println("+1 빌림 ! resultReserve = ${resultReserve.toList()}")
                continue
            }

        } else {
            answer++
        }
        println("loop end answer = $answer ")

    }

    println("answer = ${answer}")

    return answer
}