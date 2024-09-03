package programmers.lv02


/**
 * no.12939
 * 최댓값과 최솟값
 * https://school.programmers.co.kr/learn/courses/30/lessons/12939
 */

fun main() {
    println(solution("1 2 3 4"))
    println(solution("-1 -2 -3 -4"))
}

private fun solution(s: String): String {
    var answer = ""
    val splitString = s.split(" ")
    answer = splitString.minOf { it.toInt() }.toString() + " " + splitString.maxOf { it.toInt() }.toString()
    return answer
}
