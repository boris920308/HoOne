/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/12919
 */
fun main(args: Array<String>) {
    val stringArray = arrayOf<String>("kim", "jane", "jeong", "park", "lee", "choi", "Son", "Ryu")
    solution(stringArray)

    println("${solution(stringArray)}")
}

private fun solution(seoul: Array<String>): String {
    return "김서방은 ${seoul.indexOf("kim")}에 있다"
}