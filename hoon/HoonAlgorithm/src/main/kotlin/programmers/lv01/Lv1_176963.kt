package programmers.lv01

/**
 *
 * no.176963
 * 추억 점수
 * https://school.programmers.co.kr/learn/courses/30/lessons/176963
 */

//* ["may", "kein", "kain", "radi"]	[5, 10, 1, 3]	[["may", "kein", "kain", "radi"],["may", "kein", "brin", "deny"], ["kon", "kain", "may", "coni"]]	[19, 15, 6]

fun main() {
    solution(
        arrayOf("may", "kein", "kain", "radi"),
        intArrayOf(5, 10, 1, 3),
        arrayOf(
            arrayOf("may", "kein", "kain", "radi"),
            arrayOf("may", "kein", "brin", "deny"),
            arrayOf("kon", "kain", "may", "coni")
        )
    )
}


private fun solution(name: Array<String>, yearning: IntArray, photo: Array<Array<String>>): IntArray {
    var answer = mutableListOf<Int>()
    val nameToYearning = name.zip(yearning.toTypedArray()).toMap()

    for (person in photo) {
        var score = 0
        person.forEach {
            score += nameToYearning[it] ?: 0
        }
        answer.add(score)
    }

    return answer.toIntArray()
}

private fun anotherSolution(names: Array<String>, yearnings: IntArray, photoes: Array<Array<String>>): IntArray {
    val map = names.zip(yearnings.toTypedArray()).toMap()
    return photoes.map { photo -> photo.sumOf { map[it] ?: 0 } }.toIntArray()
}