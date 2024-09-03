package programmers.lv01

/**
 *
 * no.12977
 * 소수만들기
 * https://school.programmers.co.kr/learn/courses/30/lessons/12977
 */

fun main() {
    solution(intArrayOf(1, 2, 3, 4))
}

private fun solution(nums: IntArray): Int {
    var answer = 0
    val numsSize = nums.size

    for(i in 0 until numsSize - 2) {
        for (j in i + 1 until numsSize - 1) {
            for (k in j + 1 until numsSize) {
                val sum = nums[i] + nums[j] + nums[k]
                if (isPrime(sum)) {
                    answer++
                }
            }
        }
    }

    return answer
}

private fun isPrime(num: Int): Boolean{
    if (num < 2) {
        return false
    }

    for (i in 2 until num) {
        if (num % i == 0) {
            return false
        }
    }

    return true
}