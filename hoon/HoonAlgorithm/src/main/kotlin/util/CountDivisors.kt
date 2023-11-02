package util

import kotlin.math.sqrt


fun main() {
    println(countDivisors(100))
}


fun countDivisors(num: Int): Int{
    val divisors = arrayListOf<Int>()

    // 제곱근
    val sqrt = sqrt(num.toDouble()).toInt()
    println("num = $num , sqrt = $sqrt")

    for (i in 1 .. sqrt) {
        println("for loop, i = $i")

        if (num % i == 0) {
            divisors.add(i)
            if (num / i != i) {
                divisors.add(num / i)
            }
        }
    }

    println("divisors = ${divisors.sorted()}")

    return divisors.size
}
