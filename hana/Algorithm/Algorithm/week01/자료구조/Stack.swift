//
//  Stack.swift
//  Algorithm
//
//  Created by hana on 2023/04/19.
//
///문제:정수를 저장하는 스택 구현 - push x, pop(empty: -1), size, empty(1, 0), top(empty: -1)
///입력: 첫째 줄에 명령의 수 N (1 ≤ N ≤ 10,000), 둘째 줄부터 N개의 줄에는 명령어
///출력: 출력 명령당 한 줄씩 출력
///풀이:
///시간복잡도:
///???:

import Foundation

func solution_10828(_ commands:[String]) -> [Int] {
    var array: [Int] = []
    var printArray: [Int] = []
    
    commands.forEach{
        switch String($0.split(separator: " ")[0]){
        case "push":
            array.append(Int($0.split(separator: " ")[1])!)
        case "pop":
            printArray.append(array.popLast() ?? -1)
        case "size":
            printArray.append(array.count)
        case "empty":
            printArray.append(array.isEmpty ? 1 : 0)
        case "top":
            printArray.append(array.last ?? -1)
        default: break
        }
    }
    
    return printArray
}

let input: Int = Int(readLine()!)!
var commands: [String] = []
for _ in 1...input{
    commands.append(readLine()!)
}

solution_10828(commands).forEach{
    print($0)
}
