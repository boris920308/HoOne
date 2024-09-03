package main.kotlin.programmers.lv01

/**
 *
 * https://school.programmers.co.kr/learn/courses/30/lessons/12918
 */

fun main() {
    println(solution("a234"))
    println(solution("1234"))
}
private fun solution(s: String): Boolean {
    return (s.length == 4 || s.length == 6) && isNumericString(s)
}

private fun isNumericString(s: String): Boolean {
    val regex = Regex("""^\d+$""")
    return regex.matches(s)
}

private fun solution_1(s: String) = (s.length == 4 || s.length == 6) && s.toIntOrNull() != null