package programmers.lv01

/**
 *
 * no.159994
 * 카드 뭉치
 * https://school.programmers.co.kr/learn/courses/30/lessons/159994
 */


fun main() {
    solution(arrayOf("i", "drink", "water"), arrayOf("want", "to"), arrayOf("i", "want", "to", "drink", "water"))
//    solution(arrayOf("i", "water", "drink"), arrayOf("want", "to"), arrayOf("i", "want", "to", "drink", "water"))
}


private fun solution(cards1: Array<String>, cards2: Array<String>, goal: Array<String>): String {
    var answer: String = "Yes"

    var cards1Holder = cards1
    var cards2Holder = cards2

    goal.forEach {
        println("=> => => => => => => => => => => => => =>  it = $it")
        if (cards1Holder.isNotEmpty() && cards1Holder[0] == it) {
            println("cards1[0] == it")
            cards1Holder = cards1Holder.sliceArray(1 until cards1Holder.size)
            println("loop end, cards1Holder = ${cards1Holder.toList()}")
            return@forEach
        }

        if (cards2Holder.isNotEmpty() &&cards2Holder[0] == it) {
            println("cards2[0] == it")
            cards2Holder = cards2Holder.sliceArray(1 until cards2Holder.size)
            println("loop end, cards2Holder = ${cards2Holder.toList()}")
            return@forEach
        }
        answer = "No"
    }
    println("result = $answer")
    return answer
}

private fun anotherSolution(cards1: Array<String>, cards2: Array<String>, goal: Array<String>): String {
    var idx1 = 0
    var idx2 = 0
    goal.forEach {
        if (idx1 < cards1.size && it == cards1[idx1]) idx1++
        else if (idx2 < cards2.size && it == cards2[idx2]) idx2++
        else return "No"
    }
    return "Yes"
}