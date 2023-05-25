package main.kotlin.programmers.lv01

/**
 *
 * https://school.programmers.co.kr/learn/courses/30/lessons/12948
 *
 * 문제 설명
 * 프로그래머스 모바일은 개인정보 보호를 위해 고지서를 보낼 때 고객들의 전화번호의 일부를 가립니다.
 * 전화번호가 문자열 phone_number로 주어졌을 때, 전화번호의 뒷 4자리를 제외한 나머지 숫자를 전부 *으로 가린 문자열을 리턴하는 함수, solution을 완성해주세요.
 *
 * 제한 조건
 * phone_number는 길이 4 이상, 20이하인 문자열입니다.
 * 입출력 예
 * phone_number	return
 * "01033334444"	"*******4444"
 * "027778888"	"*****8888"
 */

fun main() {
    solution("01033334444")
    solution("027778888")
}

private fun solution(phone_number: String): String {
    var answer = ""
    val numLength = phone_number.length
    for(i in 1..numLength - 4) {
        answer += "*"
    }
    val result = answer + phone_number.subSequence(numLength - 4, numLength)
    return result
}

private fun secondSolution(phone_number: String): String {
    return "${"".padStart(phone_number.length - 4, '*')}${phone_number.takeLast(4)}"
}