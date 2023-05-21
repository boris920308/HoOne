//
//  SumOneTwoThree.swift
//  Algorithm
//
//  Created by hana on 2023/05/12.
//
///문제: 정수 n이 주어졌을 때, n을 1, 2, 3의 합으로 나타내는 방법의 수 구하기
///입력: 첫째 줄에 테스트 케이스 개수 T, 둘째 줄부터 T개의 줄에 자연수 N (1 ≤ M ≤  10)
///출력: T개의 방법의 수 출력
///풀이: 합이 아니라 1,2,3 숫자 하나만 있는거도 포함해야함
///시간복잡도:

import Foundation

func solution_9095(_ arr: [Int]) -> [Int]{
    return arr.map{
        var dp: [Int] = []
        
        dp.append(1)
        
        if $0 > 1{
            dp.append(2)
        }
        
        if $0 > 2{
            dp.append(4)
            
            for i in 3..<$0{
                dp.append(dp[i-1] + dp[i-2] + dp[i-3])
            }
        }
        
        return dp[$0 - 1]
    }
}

let inputT = Int(readLine()!)!
var inputsN: [Int] = []
for _ in 0..<inputT{
    inputsN.append(Int(readLine()!)!)
}

solution_9095(inputsN).forEach{
    print($0)
}
