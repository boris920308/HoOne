
//  StairClimbing.swift
//  Algorithm
//
//  Created by hana on 2023/05/10.
//
///문제: N개의 계단오르기 게임에서 최대점수 구하기
/// 1. 계단은 한 번에 한 계단씩 또는 두 계단씩 오를 수 있다. 즉, 한 계단을 밟으면서 이어서 다음 계단이나, 다음 다음 계단으로 오를 수 있다.
/// 2. 연속된 세 개의 계단을 모두 밟아서는 안 된다. 단, 시작점은 계단에 포함되지 않는다.
/// 3. 마지막 도착 계단은 반드시 밟아야 한다.
///입력: 첫째 줄에 정수 N (1 ≤ N ≤ 300), 둘째 줄부터 N개의 줄에 자연수 M ( 1 ≤ M ≤ 10,000)
///출력: 계단 오르기 게임에서 얻을 수 있는 총 점수의 최댓값
///풀이:
///시간복잡도:

import Foundation

func solution_2579(_ scores: [Int]) -> Int{
    //i번째 계단까지의 최대값
    var dp: [Int] = []
    
    dp.append(scores[0])
    
    if scores.count > 1{
        dp.append(max(scores[0] + scores[1], scores[1]))
    }
    
    if scores.count > 2{
        dp.append(max(scores[0] + scores[2], scores[1] + scores[2]))
        
        for i in 3..<scores.count{
            //...oxo or ...oxoo
            dp.append(max(dp[i-2] + scores[i], dp[i-3] + scores[i-1] + scores[i]))
        }
    }
    
    return dp[scores.count - 1]
}

let inputN = Int(readLine()!)!
var inputsM: [Int] = []
for _ in 0..<inputN{
    inputsM.append(Int(readLine()!)!)
}

print(solution_2579(inputsM))

//[100,100,1,1,100,100,1,1000,1000,1000]     = 2302
//[10,20,15,25,10,20]   = 75
//[10,5,20] = 30
//[10,20,100]   = 120
//[4,3,1,2,2,1]   = 10
