package main.kotlin.programmers.lv01

/**
 *
 * https://school.programmers.co.kr/learn/courses/30/lessons/147355
 */

fun main() {
    solution("0", "1")
    solution("3141592", "271")
    anotherSolution("500220839878", "7")
    anotherSolution("10203", "15")
}

private fun solution(t: String, p: String): Int {
    var answer: Int = 0
    var tArray = (t.toString().map { it.toString().toInt() })
    var resultArray = mutableListOf<Long>()
    var pLength = p.length

    tArray.forEachIndexed { index, value ->
        var resultString = ""
        if (index + pLength <= tArray.size) {
            for (i in 0 until pLength) {
                resultString += tArray[index + i]
            }
            resultArray.add(resultString.toLong())
            if (resultString.toLong() <= p.toLong()) answer++
        }
    }

    return answer
}

private fun anotherSolution(t: String, p: String): Int {
    return (0..t.length - p.length)
            .map{ t.substring(it until it + p.length) }
            .count { it <= p }
}