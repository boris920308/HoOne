package main.kotlin.programmers.lv01


/**
 *
 * https://school.programmers.co.kr/learn/courses/30/lessons/12954
 *
 * 문제 설명
 * 함수 solution은 정수 x와 자연수 n을 입력 받아, x부터 시작해 x씩 증가하는 숫자를 n개 지니는 리스트를 리턴해야 합니다.
 * 다음 제한 조건을 보고, 조건을 만족하는 함수, solution을 완성해주세요.
 *
 * 제한 조건
 * x는 -10000000 이상, 10000000 이하인 정수입니다.
 * n은 1000 이하인 자연수입니다.
 * 입출력 예
 * x	n	answer
 * 2	5	[2,4,6,8,10]
 * 4	3	[4,8,12]
 * -4	2	[-4, -8]
 */

fun main() {
    println("result = ${solution(2, 5).toList()}")
    println("result = ${secondSolution(4, 3).toList()}")
    println("result = ${solution(-4, 2).toList()}")
    println("result = ${secondSolution(0, 3).toList()}")
}

private fun solution(x: Int, n: Int): LongArray {
    val answer = LongArray(n)

    for (i in 0 until n) {
        answer[i] = x * (i.toLong() + 1);
    }

    return answer
}

private fun secondSolution(x: Int, n: Int): LongArray = LongArray(n) { i -> x.toLong() * (i+1) }
