//
//  FindingPath.swift
//  Algorithm
//
//  Created by hana on 2023/05/24.
//
///문제: 가중치 없는 방향 그래프 G가 주어졌을 때, 모든 정점 (i, j)에 대해서, i에서 j로 가는 경로가 있는지 없는지 구하기
///입력: 첫째 줄에 정점의 개수 N (1 ≤ N ≤ 100), 둘째 줄부터 N개 줄에는 그래프의 인접 행렬
/// i번째 줄의 j번째 숫자가 1인 경우는 i에서 j로 가는 간선이 존재한다는 뜻
/// i번째 줄의 j번째 숫자가 0인 경우는 i에서 j로 가는 간선없다는 뜻
/// i번째 줄의 i번째 숫자는 항상 0
///출력: 총 N개의 줄에 걸쳐서 문제의 정답을 인접행렬 형식으로 출력
///풀이: 플로이드 와샬 알고리즘 - 거쳐가는 정점을 하나씩 검사,  모든 쌍 간의 최단 거리를 구할 수 있음
///시간복잡도:

import Foundation

func solution_11403(_ n: Int, _ adjacency_matrix: inout [[Int]]) -> [[Int]]{
    for k in 0..<n{
        for i in 0..<n{
            for j in 0..<n{
                if adjacency_matrix[i][k] == 1 && adjacency_matrix[k][j]  == 1{
                    adjacency_matrix[i][j] = 1
                }
            }
        }
    }
    return adjacency_matrix
}

let inputN = Int(readLine()!)!

var adjacency_matrix: [[Int]] = []
for _ in 0..<inputN{
    adjacency_matrix.append(readLine()!.components(separatedBy: " ").map{Int($0)!})
}

solution_11403(inputN, &adjacency_matrix).forEach{
    print($0.map{"\($0)"}.joined(separator: " "))
}

//adjacency_matrix = [[0, 1, 0], [0, 0, 1], [1, 0, 0]]
