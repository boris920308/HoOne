package programmers.lv01

/**
 * no.12901
 * 2016년
 * https://school.programmers.co.kr/learn/courses/30/lessons/12901
 *
 * 2016년 1월 1일은 금요일입니다.
 * 2016년 a월 b일은 무슨 요일일까요?
 * 두 수 a ,b를 입력받아 2016년 a월 b일이 무슨 요일인지 리턴하는 함수, solution을 완성하세요.
 * 요일의 이름은 일요일부터 토요일까지 각각 SUN,MON,TUE,WED,THU,FRI,SAT 입니다.
 * 예를 들어 a=5, b=24라면 5월 24일은 화요일이므로 문자열 "TUE"를 반환하세요.
 *
 * 제한 조건
 * 2016년은 윤년입니다.
 * 2016년 a월 b일은 실제로 있는 날입니다. (13월 26일이나 2월 45일같은 날짜는 주어지지 않습니다)
 *
 * 입출력 예
 * a	b	result
 * 5	24	"TUE"
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