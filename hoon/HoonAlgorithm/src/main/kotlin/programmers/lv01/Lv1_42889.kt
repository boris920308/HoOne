package programmers.lv01

/**
 *
 * no.42889
 * 실패율
 * https://school.programmers.co.kr/learn/courses/30/lessons/42889
 */


fun main() {
//    * N	stages	                    result
//    * 5	[2, 1, 2, 6, 2, 4, 3, 3]	[3,4,2,1,5]
//    * 4	[4,4,4,4,4]             	[4,1,2,3]
//    * 5   [1, 1, 1, 2, 3, 4]          [4, 1, 3, 2, 5]


//    solution(5, intArrayOf(2, 1, 2, 6, 2, 4, 3, 3))
//    solution(4, intArrayOf(4, 4, 4, 4, 4))
    solution(5, intArrayOf(1, 1, 1, 2, 3, 4))
}

private fun solution(N: Int, stages: IntArray): IntArray {
    val position = arrayListOf<Int>()
    var max = stages.size

    for (i in 1 .. N) {
        var now = 0
        for (j in 0 until stages.size) {
            if (i == stages[j]) {
                now++
            }
        }
        position.add(now)
    }
    println("position = $position")

    val tempList = arrayListOf<Double>()
    for(i in 0 until position.size) {
        tempList.add(position[i].toDouble() / max.toDouble())
        max -= position[i]
    }
    println(tempList)
    val resultList = tempList.map { if (it.isNaN()) 0.0 else it }.toMutableList()
    println("resultList = ${resultList}")

    val indexedMap = resultList.mapIndexed { index, value -> index to value }.toMap()
    println("indexedMap = ${indexedMap}")

    val sortedMap = indexedMap
        .toList() // Map을 List<Pair>로 변환
        .sortedByDescending { it.second } // 값(value)을 기준으로 정렬
        .toMap() // 다시 Map으로 변환
    println("result = ${sortedMap.keys.map { it + 1 }}")

    return (sortedMap.keys.map { it + 1 }).toIntArray()
}