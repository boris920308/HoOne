//
//  FibonacciNumber.swift
//  Algorithm
//
//  Created by hana on 2023/04/24.
//
///문제: 피보나치 수는 0, 1로 시작. 공식) Fn = Fn-1 + Fn-2 (n >= 2)
///입력: 정수 n
///출력: n번째 피보나치 수
///풀이:
///시간복잡도:
///???:

import Foundation

func solution_10870(_ n: Int) -> Int{
    return calculation(n)
}
func calculation(_ n: Int) -> Int{
    if n < 2{
        return n
    }
    return calculation(n - 1) + calculation(n - 2)
}

let input: Int = Int(readLine()!)!
let start = CFAbsoluteTimeGetCurrent()

print(solution_10870(input))

print("경과시간: \(CFAbsoluteTimeGetCurrent() - start)")
