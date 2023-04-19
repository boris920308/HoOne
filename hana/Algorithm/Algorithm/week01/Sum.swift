//
//  Sum.swift
//  Algorithm
//
//  Created by hana on 2023/04/17.
//
///문제: 1부터 N까지의 합
///입력: 첫째 줄에 정수 N (1 ≤ N ≤ 10,000)
///출력: 1부터 N까지의 합
///풀이:
///시간복잡도:
///???:

import Foundation

func solution_8393(_ n: Int) -> Int {
    var sum = 0
    for i in 1...n{
        sum += i
    }
    return sum
}

let input: Int = Int(readLine()!)!
let start = CFAbsoluteTimeGetCurrent()

print(solution_8393(input))
print("경과시간: \(CFAbsoluteTimeGetCurrent() - start)")
