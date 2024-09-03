package main.kotlin.programmers.lv01

/**
 *
 * https://school.programmers.co.kr/learn/courses/30/lessons/12926
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