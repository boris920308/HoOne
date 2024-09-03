
/**
 *
 * https://school.programmers.co.kr/learn/courses/30/lessons/86491?language=kotlin
 */

fun main() {
    solution(arrayOf(intArrayOf(60, 50), intArrayOf(30, 70), intArrayOf(60, 30), intArrayOf(80, 40)))
    solution(arrayOf(intArrayOf(10, 7), intArrayOf(12, 3), intArrayOf(8, 15), intArrayOf(14, 7), intArrayOf(5, 15)))
    solution(arrayOf(intArrayOf(14, 4), intArrayOf(19, 6), intArrayOf(6, 16), intArrayOf(18, 7), intArrayOf(7, 11)))
}

private fun solution(sizes: Array<IntArray>): Int {
    var value0 = 0
    var value1 = 0
    var sortedIntArray: Array<IntArray> = arrayOf()

    sizes.forEach {
        sortedIntArray = sortedIntArray.plus(it.sorted().toIntArray())
    }

    sortedIntArray.forEachIndexed { rowIndex, row ->
        row.forEachIndexed { columnIndex, value ->
            if (columnIndex == 0){
                // 작은값
                if (value0 < value) {
                    value0 = value
                }
            } else {
                // 큰값
                if (value1 < value) {
                    value1 = value
                }
            }

        }

    }

    return (value1 * value0)
}