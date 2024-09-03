package programmers.lv01

/**
 *
 * no.161989
 * 덧칠하기
 * https://school.programmers.co.kr/learn/courses/30/lessons/161989
 */

fun main() {
// * n	m	section	        result
// * 8	4	[2, 3, 6]	    2
// * 5	4	[1, 3]	        1
// * 4	1	[1, 2, 3, 4]	4
// * 5	2	[1, 4, 5]   	2

    solution(8, 4, intArrayOf(2, 3, 6))
    solution(5, 4, intArrayOf(1, 3))
    solution(4, 1, intArrayOf(1, 2, 3, 4))
    solution(5, 2, intArrayOf(1, 4, 5))
}

private fun solution(n: Int, m: Int, section: IntArray): Int {
    var answer: Int = 0
    val wall = arrayListOf<Boolean>()

    for (i in section.minOf { it } .. section.maxOf { it }) {
        if (section.contains(i)) {
            wall.add(false)
        } else {
            wall.add(true)
        }
    }

    for (i in 0 until wall.size) {
        if (!(wall[i])) {
            for (j in 0 until m) {
                if (i + j < wall.size){
                    wall[i + j] = true
                }
            }
            answer++
        }
    }

    return answer
}

private fun anotherSolution(n: Int, m: Int, section: IntArray): Int {
    var answer = 0
    var nextSection = 0
    section.forEach {
        if (it >= nextSection) {
            answer++
            nextSection = it + m
        }
    }
    return answer
}
