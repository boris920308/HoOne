//
//  PrintTree.swift
//  Algorithm
//
//  Created by hana on 2023/05/17.
//
///문제: 이진트리를 입력받아 전위 순회, 중위 순회, 후위 순회하는 프로그램
/// 1.전위 순회 (루트) (왼쪽 자식) (오른쪽 자식)
/// 2.중위 순회 (왼쪽 자식) (루트) (오른쪽 자식)
/// 3.후위 순회 (왼쪽 자식) (오른쪽 자식) (루트)
///입력: 첫째 줄에 이진 트리의 노드의 개수 N(1 ≤ N ≤ 26)
/// 둘째 줄부터 N개의 줄에 걸쳐 각 노드와 그의 왼쪽 자식 노드, 오른쪽 자식 노드
/// 노드의 이름은 A부터 차례대로 알파벳 대문자로 매겨지며, 항상 A가 루트 노드가 된다. 자식 노드가 없는 경우에는 .으로 표현
///출력: 첫째 줄에 전위 순회, 둘째 줄에 중위 순회, 셋째 줄에 후위 순회한 결과를 출력
///풀이:
///시간복잡도:

import Foundation

func solution_1991(_ arr: [String]) -> [String]{
    var node = Node(key: "A")
    var currentNode = node
    arr.sorted().forEach{
        currentNode = node.search($0.components(separatedBy: " ")[0])!
        currentNode.addLeft($0.components(separatedBy: " ")[1])
        currentNode.addRight($0.components(separatedBy: " ")[2])
    }
    
    node.printOrder(node: node.search("A"))
    
    return node.orders
}

let inputN = Int(readLine()!)!
var inputsN: [String] = []
for _ in 0..<inputN{
    inputsN.append(readLine()!)
}

solution_1991(inputsN).forEach{
    print($0)
}

class Node {
    var key: String
    var left: Node?
    var right: Node?
    
    var orders = [String](repeating: "", count: 3)
    
    init(key: String) {
        self.key = key
    }
    
    func addLeft(_ key: String){
        if key == "."{
            return
        }
        self.left = Node(key: key)
    }
    func addRight(_ key: String){
        if key == "."{
            return
        }
        self.right = Node(key: key)
    }
    func search(_ key: String) -> Node?{
        var node: Node?
        forEachDepthFirst(visit: {
            if $0.key == key{
                node = $0
            }
        })
        return node
    }
    
    private func forEachDepthFirst(visit:(Node) -> Void) {
        visit(self)
        
        left?.forEachDepthFirst(visit: visit)
        right?.forEachDepthFirst(visit: visit)
    }
    
    func printOrder(node: Node?){
        if node == nil {return}
        
        //전위
        orders[0] += node!.key
        printOrder(node: node?.left)
        //중위
        orders[1] += node!.key
        printOrder(node: node?.right)
        //후위
        orders[2] += node!.key
    }
}
