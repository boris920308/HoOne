//
//  IntegerTriangle.swift
//  Algorithm
//
//  Created by hana on 2023/05/13.
//

import Foundation

func solution_1932(_ arr: [[Int]]) -> Int{
    var dp: [[Int]] = [[Int]](repeating: [], count: arr.count)
    dp[0].append(arr[0][0])
    
    for i in 1..<arr.count{
        dp[i].append(dp[i-1][0] + arr[i][0])
        for j in 1..<arr[i-1].count{
            dp[i].append(max(dp[i-1][j-1] + arr[i][j], dp[i-1][j] + arr[i][j]))
        }
        dp[i].append(dp[i-1][i-1] + arr[i][i])
    }
    return (dp.last?.sorted().last)!
}

let inputN = Int(readLine()!)!
var inputsP: [[Int]] = []
for _ in 0..<inputN {
    inputsP.append(readLine()!.components(separatedBy: " ").map{Int($0)!})
}

print(solution_1932(inputsP))

//[[7],[3,8],[8,1,0],[2,7,4,20]
