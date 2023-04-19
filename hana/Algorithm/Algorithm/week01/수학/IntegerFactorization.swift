//
//  IntegerFactorization.swift
//  Algorithm
//
//  Created by hana on 2023/04/16.
//
///문제: 정수 N을 소인수분해 ( N == 1 출력 X)
///입력: 첫째 줄에 정수 N (1 ≤ N ≤ 10,000,000)
///출력: 한 줄씩 오름차순
///풀이:  나누어지는 수 i add, 소인수분해할 자연수 n을 나누어지는 수 i로 나누기 한 값을 재귀함수에 태움, return된 마지막 value add
///시간복잡도:

import Foundation

func solution_11653(_ num:Int) -> [Int] {
    let n = factorization(num, 2)

    if n != input,
       n != nil{
        resultArray.append(n!)
    }
    
    return resultArray
}

func factorization(_ n: Int, _ i: Int) -> Int?{
//    var i = 2
//    while i < n{
    for i in i..<n {
        if n % i == 0{
            resultArray.append(i)
            return factorization(n/i, i)
        }
//        else {
//            i += 1
//        }
    }
    
    if n > 1{
        return n
    }
    return nil
}


let input = Int(readLine()!)!
let start = CFAbsoluteTimeGetCurrent()

var resultArray: [Int] = []

solution_11653(input).forEach{
    print($0)
}

print("경과시간: \(CFAbsoluteTimeGetCurrent() - start)")
