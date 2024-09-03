package programmers.lv02

/**
 * no.242842
 * 카펫
 * https://school.programmers.co.kr/learn/courses/30/lessons/42842?language=kotlin
 */

fun main() {
//    println(solution(10, 2)) // [4, 3]
//    solution(8, 1)
    solution(24, 24)
}

private fun solution(brown: Int, yellow: Int): IntArray{

    val sumBY = brown + yellow

    for (width in 3..brown) {
        var height = 0
        if (sumBY % width == 0) {
            height = sumBY / width
            if (width >= height && height >= 3) {
                if (yellow == (width - 2) * (height - 2)) {
                    return intArrayOf(width, height)
                }
            }
        }
    }

    return intArrayOf()
}
