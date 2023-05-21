//
//  BuyingCard.swift
//  Algorithm
//
//  Created by hana on 2023/05/12.
//
///문제: i개의 카드가 들어있는 카드팩 Pi의 가격이 있다. (1 ≤ i ≤ n) n개의 카드를 구매하기 위해 지불할 수 있는 금액의 최대값 구하기
///입력: 첫째 줄에 구매하려는 개수 N(1 ≤ N ≤  1,000), 둘째줄에는 N개의 자연수 Pi (1 ≤ Pi ≤  10,000)
///출력: N개의 카드를 구매하기 위한 최대값
///풀이:
///시간복잡도:

import Foundation

func solution_11052(_ arr: [Int]) -> Int{
    var dp: [Int] = []

    dp.append(arr[0])
    
    for i in 1..<arr.count{
        var maxArr: [Int] = [arr[i]]
        for j in 0...i/2{
            maxArr.append(dp[i-j-1] + dp[j])
        }
        dp.append(maxArr.sorted().last!)
    }
    return dp.last!
}

let inputN = Int(readLine()!)!
var inputsP: [Int] = []
inputsP = readLine()!.components(separatedBy: " ").map{Int($0)!}

print(solution_11052(inputsP))
