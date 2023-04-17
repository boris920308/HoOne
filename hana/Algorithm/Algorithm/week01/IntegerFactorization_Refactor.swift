//
//  IntegerFactorization_Refactor.swift
//  Algorithm
//
//  Created by hana on 2023/04/16.
//
///문제: 정수 N을 소인수분해
///입력: 첫째 줄에 정수 N (1 ≤ N ≤ 10,000,000)
///출력: 한 줄씩 오름차순
///풀이: 재귀, for문 -> 나누어지는 수 i add, 소인수분해할 자연수 n을 나누어지는 수 i로 나누기 한 값을 n에 치환함. 나누어지지 않으면 + 1하고 반복, 마지막에 남은 n도 add
///시간복잡도:
///???: 재귀함수는 시간 영향 X, for문을 while문으로 바꿨을 때 시간이 반이 줄어드는데 왜 줄어드는지 모르겠음

import Foundation

func solution_11653(_ num:Int) -> [Int] {
    var resultArray: [Int] = []
    var n = num
    var i = 2

    while i < n{
        if n % i == 0{
            resultArray.append(i)
            n = n/i
        }
        else {
            i += 1
        }
    }

    if n > 1{
        resultArray.append(n)
    }
    return resultArray
}


let input = Int(readLine()!)!
let start = CFAbsoluteTimeGetCurrent()

solution_11653(input).forEach{
    print($0)
}

print("경과시간: \(CFAbsoluteTimeGetCurrent() - start)")
