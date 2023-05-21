//
//  DFSAndBFS.swift
//  Algorithm
//
//  Created by hana on 2023/05/22.
//
///문제: 그래프를 DFS로 탐색한 결과와 BFS로 탐색한 결과를 출력
/// 1. 방문할 수 있는 정점이 여러 개인 경우에는 정점 번호가 작은 것을 먼저 방문
/// 2. 더 이상 방문할 수 있는 점이 없는 경우 종료
/// 3. 여러 개의 간선이 있을 수 있음 (양방향)
///입력: 첫째 줄에 정점의 개수 N(1 ≤ N ≤ 1,000), 간선의 개수 M(1 ≤ M ≤ 10,000), 탐색을 시작할 정점의 번호 V
/// 둘째 줄부터 M개의 줄에는 간선이 연결하는 두 정점의 번호
///출력: 첫째 줄에 DFS를 수행한 결과를, 그 다음 줄에는 BFS를 수행한 결과를 출력
///풀이:
///시간복잡도:

import Foundation

func solution_1260(_ n: Int, _ v: Int, _ pairOfDots: [[Int]]) -> [[Int]]{
    var graph = [[Int]](repeating: [], count: n + 1)
    var result = [[Int]](repeating: [], count: 2)
    
    for i in 0..<pairOfDots.count{
        let start = pairOfDots[i][0]
        let end = pairOfDots[i][1]
        graph[start].append(end)
        graph[end].append(start)
    }
    
    runDFS(graph, v, &result[0])
    runBFS(graph, v, &result[1])

    return result
}

func runDFS(_ graph: [[Int]], _ v: Int, _ visited: inout [Int]){
    var stack = [v]
    
    while !stack.isEmpty {
        //stack에서 마지막 값을 삭제, 리턴
        let node = stack.popLast()!
        
        if !visited.contains(node) {
            visited.append(node)
            stack.append(contentsOf: graph[node].sorted(by: >)) //내림차순
        }
    }
}

func runBFS(_ graph: [[Int]], _ v: Int, _ visited: inout [Int]){
    var queue = [v]
    
    while !queue.isEmpty {
        //queue에서 첫번째 값을 삭제, 리턴
        let node = queue.removeFirst()
        
        if !visited.contains(node) {
            visited.append(node)
            queue.append(contentsOf: graph[node].sorted()) //오름차순
        }
    }
}

let inputs = readLine()!.components(separatedBy: " ")
let n = Int(inputs[0])!
let m = Int(inputs[1])!
let v = Int(inputs[2])!

var pairOfDots = [[Int]](repeating: [], count: m)
for i in 0..<m{
    let inputs = readLine()!.components(separatedBy: " ")
    pairOfDots[i].append(Int(inputs[0])!)
    pairOfDots[i].append(Int(inputs[1])!)
}

solution_1260(n, v, pairOfDots).forEach{
    print($0.map{"\($0)"}.joined(separator: " "))
}

// 1000, 1000, [[999, 1000]]
// 4, 1, [[1,2],[1,3],[1,4],[2,4],[3,4]]
// 5, 3, [[5,4],[5,2],[1,2],[3,4],[3,1]]
// 5, 1, [[1,3],[1,5],[3,5],[3,4],[3,2],[2,4]]
// 5, 1, [[1,2],[3,1],[4,1],[1,5],[2,5],[5,3],[3,4],[4,2]]
// 7, 3, [[3,4],[3,1],[4,5],[4,7],[1,2],[1,6]]
