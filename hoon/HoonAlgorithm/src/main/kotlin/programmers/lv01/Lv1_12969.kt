package main.kotlin.programmers.lv01

/**
 *  https://school.programmers.co.kr/learn/courses/30/lessons/12969
 *
 */

fun main(args: Array<String>) {
    val (a, b) = readLine()!!.split(' ').map(String::toInt)

    for (i in 0 until b) {
        for (j in 0 until a) {
            print("*")
        }
        println()
    }
}

fun main_2(args: Array<String>) {
    val (a, b) = readLine()!!.split(' ').map(String::toInt)
    var star : String = ""
    for(i in 1..a){
        star += "*"
    }

    for(i in 1..b){
        println(star)
    }

}