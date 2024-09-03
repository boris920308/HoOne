package programmers.lv01

/**
 * no.12901
 * 2016년
 * https://school.programmers.co.kr/learn/courses/30/lessons/12901
 */

fun main() {
    solution(5, 24)
}

private fun solution(a: Int, b: Int): String {
    var answer = ""

    val daysInMonth = listOf(0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31)
    val daysOfWeek = listOf("SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT", )

    var days = 0
    for (month in 1 until a) {
        days += daysInMonth[month]
    }
    days += b - 1

    answer = daysOfWeek[(days + 5) % 7]

    return answer
}