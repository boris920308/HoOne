/**
 * 프로그래머스 Lv.1
 * https://school.programmers.co.kr/learn/courses/30/lessons/118666
 */

fun main() {
    val mSurvey = arrayOf("RT", "TR", "FC", "CF", "MJ", "JM", "AN", "NA")
//    solution(mSurvey, intArrayOf(1,2,3,4,1,2,3,6))

    solution(arrayOf("AN", "CF", "MJ", "RT", "NA"), intArrayOf(5, 3, 2, 7, 5))
    solution(arrayOf("TR", "RT", "TR"), intArrayOf(7, 1, 3))
}

fun solution(survey: Array<String>, choices: IntArray): String {
    println()
    println("* * * * * * * * solution * * * * * * * * ")
    var answer: String = ""

    var resultArray = charArrayOf()

    survey.forEachIndexed { index, s ->
        println("---------------index = $index-------------")
        println(s.toCharArray()[0])
        println(s.toCharArray()[1])
        println("get choices = ${choices[index]}")

        when(choices[index]) {
            1 -> {
                resultArray = resultArray.plus(s.toCharArray()[0])
                resultArray = resultArray.plus(s.toCharArray()[0])
                resultArray = resultArray.plus(s.toCharArray()[0])
            }
            2 -> {
                resultArray = resultArray.plus(s.toCharArray()[0])
                resultArray = resultArray.plus(s.toCharArray()[0])
            }
            3 -> { resultArray = resultArray.plus(s.toCharArray()[0]) }
            4 -> {}
            5 -> {
                resultArray = resultArray.plus(s.toCharArray()[1])
            }
            6 -> {
                resultArray = resultArray.plus(s.toCharArray()[1])
                resultArray = resultArray.plus(s.toCharArray()[1])
            }
            7 -> {
                resultArray = resultArray.plus(s.toCharArray()[1])
                resultArray = resultArray.plus(s.toCharArray()[1])
                resultArray = resultArray.plus(s.toCharArray()[1])
            }
        }
    }

    println("resultArray = ${resultArray.toList()}")

    var countR = 0
    var countT = 0

    var countC = 0
    var countF = 0

    var countJ = 0
    var countM = 0

    var countA = 0
    var countN = 0

    var resultSolution = charArrayOf()

    resultArray.forEach {
        when (it) {
            'R' -> { countR++ }
            'T' -> { countT++ }
            'C' -> { countC++ }
            'F' -> { countF++ }
            'J' -> { countJ++ }
            'M' -> { countM++ }
            'A' -> { countA++ }
            'N' -> { countN++ }
        }
    }
    resultSolution = if (countR >= countT) {
        resultSolution.plus('R')
    } else {
        resultSolution.plus('T')
    }

    resultSolution = if (countC >= countF) {
        resultSolution.plus('C')
    } else {
        resultSolution.plus('F')
    }

    resultSolution = if (countJ >= countM) {
        resultSolution.plus('J')
    } else {
        resultSolution.plus('M')
    }

    resultSolution = if (countA >= countN) {
        resultSolution.plus('A')
    } else {
        resultSolution.plus('N')
    }

    println("resultSolution = ${resultSolution.toList()}")

    answer = String(resultSolution)
    println("answer = $answer")
    return answer
}