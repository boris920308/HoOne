import java.util.*

/**
 *
 *  프로그래머스 lv.1 <정렬>
 *
 * https://school.programmers.co.kr/learn/courses/30/lessons/42748
 */

fun main (){
//	[1, 5, 2, 6, 3, 7, 4], [[2, 5, 3], [4, 4, 1], [1, 7, 3]]

    val intArray = intArrayOf(1, 5, 2, 6, 3, 7, 4)
    val command0 = intArrayOf(2, 5, 3)
    val command1 = intArrayOf(4, 4, 1)
    val command2 = intArrayOf(1, 7, 3)
    val commands = arrayOf(command0, command1, command2)
    println("* * * * * * * * * *  = ${Arrays.toString(solution(intArray, commands))}");
}

private fun solution(array: IntArray, commands: Array<IntArray>): IntArray {
    var answer = intArrayOf()
    commands.forEach {
        println("loop ~ ${Arrays.toString(it)}")
        val firstIndex = it[0] - 1
        val lastIndex = it[1] - 1
        val searchIndex = it[2] - 1
        val tempIntArray = array.sliceArray(firstIndex..lastIndex)
        tempIntArray.sorted()
        val result = tempIntArray.sorted()[searchIndex]
        answer = answer.plus(result)
    }

    return answer
}