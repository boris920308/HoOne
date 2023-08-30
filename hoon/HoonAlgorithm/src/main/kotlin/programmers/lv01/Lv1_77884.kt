package main.kotlin.programmers.lv01

import kotlin.math.sqrt

/**
 *
 * https://school.programmers.co.kr/learn/courses/30/lessons/77884
 *
 * 약수의 개수와 덧셈
 * 문제 설명
 * 두 정수 left와 right가 매개변수로 주어집니다.
 * left부터 right까지의 모든 수들 중에서, 약수의 개수가 짝수인 수는 더하고, 약수의 개수가 홀수인 수는 뺀 수를 return 하도록 solution 함수를 완성해주세요.
 *
 * 제한사항
 * 1 ≤ left ≤ right ≤ 1,000
 * 입출력 예
 * left	right	result
 * 13	17	43
 * 24	27	52
 * 입출력 예 설명
 * 입출력 예 #1
 *
 * 다음 표는 13부터 17까지의 수들의 약수를 모두 나타낸 것입니다.
 * 수	약수	            약수의 개수
 * 13	1, 13	        2
 * 14	1, 2, 7, 14	    4
 * 15	1, 3, 5, 15	    4
 * 16	1, 2, 4, 8, 16	5
 * 17	1, 17	        2
 * 따라서, 13 + 14 + 15 - 16 + 17 = 43을 return 해야 합니다.
 * 입출력 예 #2
 *
 * 다음 표는 24부터 27까지의 수들의 약수를 모두 나타낸 것입니다.
 * 수	약수	                        약수의 개수
 * 24	1, 2, 3, 4, 6, 8, 12, 24	8
 * 25	1, 5, 25	                3
 * 26	1, 2, 13, 26	            4
 * 27	1, 3, 9, 27	                4
 * 따라서, 24 - 25 + 26 + 27 = 52를 return 해야 합니다.
 *
 */

fun main() {
    solution(13, 17)
}

private fun solution(left: Int, right: Int): Int {
    var answer: Int = 0

    for (i in left..right) {
        if (countDivisors(i) % 2 == 0) {
            answer += i
        } else {
            answer -= i
        }
    }

    println(answer)

    return answer
}

private fun countDivisors(n: Int): Int {
    var count = 0
    val sqrtN = sqrt(n.toDouble()).toInt()

    for (i in 1..sqrtN) {
        if (n % i == 0) {
            count += 2 // i와 n/i는 모두 약수이므로 2를 추가
        }
    }

    // 만약 n이 제곱수인 경우 중복으로 카운트된 약수를 제거
    if (sqrtN * sqrtN == n) {
        count--
    }

    return count
}