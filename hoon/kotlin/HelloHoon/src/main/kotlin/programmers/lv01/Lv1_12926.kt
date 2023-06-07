package main.kotlin.programmers.lv01

/**
 *
 * https://school.programmers.co.kr/learn/courses/30/lessons/12926
 *
 * 시저 암호
 * 문제 설명
 * 어떤 문장의 각 알파벳을 일정한 거리만큼 밀어서 다른 알파벳으로 바꾸는 암호화 방식을 시저 암호라고 합니다.
 * 예를 들어 "AB"는 1만큼 밀면 "BC"가 되고, 3만큼 밀면 "DE"가 됩니다.
 * "z"는 1만큼 밀면 "a"가 됩니다.
 * 문자열 s와 거리 n을 입력받아 s를 n만큼 민 암호문을 만드는 함수, solution을 완성해 보세요.
 *
 * 제한 조건
 * 공백은 아무리 밀어도 공백입니다.
 * s는 알파벳 소문자, 대문자, 공백으로만 이루어져 있습니다.
 * s의 길이는 8000이하입니다.
 * n은 1 이상, 25이하인 자연수입니다.
 * 입출력 예
 * s	        n	    result
 * "AB"	        1	    "BC"
 * "z"	        1	    "a"
 * "a B z"	    4	    "e F d"
 */

fun main() {
//    println(solution("a b y Z", 2))
    solution("a b y Z", 2)
}

private fun solution(s: String, n: Int): String {
    var answer = ""
    // " " = 32
    // a = 97, z = 122
    // A = 65, Z = 90
    for (char in s) {
        println(" - - - - - start - - - - - ")
        println("char = $char, ascii = ${char.toInt()}")

        if (isLowerCase(char.toInt())) {
            println("isLowerCase")
            if (isLowerCase(char.toInt() + n)) {
                answer += (char.toInt() + n).toChar()
            } else {
                println("LowerCase err, char.toInt() + n = ${char.toInt() + n}, ${(char.toInt() + n).toChar()} ")
                println("char.toInt() + n = ${char.toInt() + n}")
                println("${(96 + (char.toInt() + n).toInt() - 122).toChar()}")
                answer += (96 + (char.toInt() + n).toInt() - 122).toChar()
            }
        }

        if (isUpperCase(char.toInt())) {
            println("isUpperCase")
            if (isUpperCase(char.toInt() + n)) {
                answer += (char.toInt() + n).toChar()
            } else {
                println("UpperCase err, char.toInt() + n = ${char.toInt() + n}, ${(char.toInt() + n).toChar()} ")
                println("char.toInt() + n = ${char.toInt() + n}")
                println("${(64 + (char.toInt() + n).toInt() - 90).toChar()}")
                answer += (64 + (char.toInt() + n).toInt() - 90).toChar()
            }
        }

        if (char.toInt() == 32) {
            println("is ")
            answer += " "
        }
        println("answer = $answer")
    }

    return answer
}

private fun isLowerCase(ascii: Int): Boolean {
    return ascii in 97 .. 122
}

private fun isUpperCase(ascii: Int): Boolean {
    return ascii in 65..90
}