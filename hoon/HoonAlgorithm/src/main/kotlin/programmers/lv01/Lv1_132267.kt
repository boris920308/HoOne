package programmers.lv01

/**
 *
 * no.132267
 * 콜라문제
 * https://school.programmers.co.kr/learn/courses/30/lessons/132267
 */

fun main() {
    println("result = ${anotherSolution(2, 1, 20)}")
    println("result = ${anotherSolution(3, 1, 20)}")
}

private fun solution(a: Int, b: Int, n: Int): Int {
    var answer: Int = 0
    var emptyBottle = n

    while (emptyBottle >= a) {
        val newCola = emptyBottle / a * b
        answer += newCola

        emptyBottle = newCola + (emptyBottle % a)
    }
    return answer
}

private fun anotherSolution(a: Int, b: Int, n: Int): Int {
    return (if (n > b) n - b else 0) / (a - b) * b
}