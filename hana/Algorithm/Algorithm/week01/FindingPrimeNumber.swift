//
//  FindingPrimeNumber.swift
//  Algorithm
//
//  Created by hana on 2023/04/16.
//
///문제: N개의 정수 중 소수 찾기
///입력: 첫째 줄에 정수 N (1 ≤ N ≤ 100), 둘째 줄에 N개의 정수 (1 ≤ N ≤ 1,000)
///출력: 소수의 개수 출력
///풀이: 입력받은 정수 배열 반복, n을 i로 나눴을 때, 나누어진 수를 count, 입력받은 정수 갯수 - 소수가 아닌 갯수
///시간복잡도: nm
///???:

import Foundation

func solution_1978(_ nums:[Int]) -> Int {
    var cnt = 0

    nums.forEach{
        let n = $0
        var i = 2
        
        if n == 1{
            cnt += 1
        }
        while i < n{
            if n % i == 0{
                cnt += 1
                break
            }
            else {
                i += 1
            }
        }
    }

    return nums.count - cnt
}


let input: Int = Int(readLine()!)!
let input2: [Int] = readLine()!.split(separator: " ").map{Int($0)!}
let start = CFAbsoluteTimeGetCurrent()

print(solution_1978(input2))

print("경과시간: \(CFAbsoluteTimeGetCurrent() - start)")


