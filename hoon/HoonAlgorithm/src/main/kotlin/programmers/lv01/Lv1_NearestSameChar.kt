/**
 *
 * 프로그래머스 lv.1
 */

fun main() {
    println("실행결과 = ${solution("banana").toList()}")
    println("실행결과 = ${solution("foobar").toList()}")
}

private fun solution(s: String): IntArray {
    var answer: IntArray = intArrayOf()
    var sArray = s.toCharArray()
    var savedChar = charArrayOf()

    sArray.forEach {
        if (savedChar.contains(it)) {
            answer = answer.plus(savedChar.size - savedChar.lastIndexOf(it))
        } else {
            answer = answer.plus(-1)
        }
        savedChar = savedChar.plus(it)
    }
    return answer
}