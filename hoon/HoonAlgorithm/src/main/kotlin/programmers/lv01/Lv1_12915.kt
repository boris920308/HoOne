package programmers.lv01

/**
 * no.12915
 * 문자열 내 마음대로 정렬하기
 * https://school.programmers.co.kr/learn/courses/30/lessons/12915
 */

fun main() {
    solution(arrayOf("sun", "bed", "car"), 1)
}

private fun solution(strings: Array<String>, n: Int): Array<String> {
    var answer = arrayOf<String>()

    answer = strings.sortedWith(
        compareBy ({ it[n] }, { it })
    ).toTypedArray()

    return answer
}

