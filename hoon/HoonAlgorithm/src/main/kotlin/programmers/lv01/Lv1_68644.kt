package programmers.lv01

/**
 * no.68644
 *  두 개 뽑아서 더하기
 * https://school.programmers.co.kr/learn/courses/30/lessons/68644
 */

fun main() {
    solution(intArrayOf(2, 1, 3, 4, 1))
}

private fun solution(numbers: IntArray): IntArray {
    val resultList = mutableListOf<Int>()

    for (i in numbers.indices) {
        for (j in i + 1 until  numbers.size) {
            val sum = numbers[i] + numbers[j]
            if (!resultList.contains(sum)) {
                resultList.add(sum)
            }
        }
    }

    return resultList.sorted().toIntArray()
}