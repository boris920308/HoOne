//
//  FindingPrimeNumber2_Refactor.swift
//  Algorithm
//
//  Created by hana on 2023/04/17.
//
///문제: M이상 N이하의 정수 중 소수 찾기
///입력: 첫째 줄에 정수 M, N (1 ≤ M ≤ N ≤ 1,000,000 / 소수가 하나 이상 있는 범위)
///출력: 한 줄씩 오름차순
///풀이: n값 만큼 반복, 소수배열 반복, num이 소수배열로 나뉘면 넘어감. num이 소수의 제곱값보다 작으면 소수배열에 추가, 소수배열에서 m보다 큰 값만 리턴
///시간복잡도:  O(log(√N)
///???: 에라토스테네스의 체 O(Nlog(logN)) > 제곱근 O(log(√N)  > 기본 O(logN)

import Foundation

func solution_1929(_ m:Int, _ n: Int) -> [Int] {
    var isPrime = Array(repeating: true, count: 1000001)
    isPrime[1] = false

    for i in 2...1000 where isPrime[i] {
        var j = i * i
        while j <= 1000000 {
            isPrime[j] = false
            j += i
        }
    }

    var ret: [Int] = []
    for i in m...n {
        if isPrime[i] {
            ret.append(i)
        }
    }
    
    return ret
}


let inputs: [Int] = readLine()!.split(separator: " ").map{Int($0)!}
let start = CFAbsoluteTimeGetCurrent()

solution_1929(inputs[0], inputs[1]).forEach{
    print($0)
}

print("경과시간: \(CFAbsoluteTimeGetCurrent() - start)")

