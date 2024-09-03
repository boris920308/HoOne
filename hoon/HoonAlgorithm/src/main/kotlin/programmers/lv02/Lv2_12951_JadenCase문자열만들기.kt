package programmers.lv02

/**
 * no.12951
 * JadenCase 문자열 만들기
 * https://school.programmers.co.kr/learn/courses/30/lessons/12951
 */

fun main() {
    println(solution("3people unFollowed me"))
    println(solution("for the last week"))
}

private fun solution(s: String): String {
    var answer = ""

    val sArray = s.toCharArray()
    sArray.forEachIndexed { index, c ->
        if (index == 0) {
            sArray[index] = sArray[index].uppercaseChar()
        }

        if (c.isLetter() && index != 0) {
            if (sArray[index -1].toString() != " ") {
                sArray[index] = sArray[index].lowercaseChar()
            } else {
                sArray[index] = sArray[index].uppercaseChar()
            }
        }

    }

    answer = String(sArray)
    return answer


}