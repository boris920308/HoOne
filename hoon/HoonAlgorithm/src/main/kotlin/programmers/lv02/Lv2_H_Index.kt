package programmers.lv02

/**
 * 프로그래머스 Lv.2 H-Index
 * https://school.programmers.co.kr/learn/courses/30/lessons/42747
 */

fun main() {
    solution(intArrayOf(3, 0, 6, 1, 5))
//    solution(intArrayOf(3, 7, 7, 7, 7))
//    solution(intArrayOf(12, 67, 27, 37, 17))
//    solution(intArrayOf(0, 0, 0, 0, 0))
}

private fun solution(citations: IntArray): Int {
    println(" * * * * * * * * * * solution * * * * * * * * * * ")
    println(" citations = ${citations.toList()}")
    var answer = 0
    var mCitations = citations
    var nowValue = 0;

    mCitations = mCitations.sorted().toIntArray()
    println(" sorted citations = ${mCitations.toList()}")
    mCitations.forEach {
        println("mCitations = ${mCitations.toList()}")
        nowValue = mCitations[0]
        if (nowValue <= mCitations.size) {
            answer = mCitations.size
        } else if (mCitations.size > 1) {
            if (mCitations[0] <= mCitations[1]) {
                answer = mCitations.size
            }
            println("else if return answer = $answer")
            return answer;
        }

        if (mCitations.size == 1 && mCitations[0] == 0) {
            answer = 0
        }

        mCitations = mCitations.copyOfRange(1, mCitations.size)
    }

    println("answer = $answer")
    return answer
}