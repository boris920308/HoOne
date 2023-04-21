//
//  MinimumHeap.swift
//  Algorithm
//
//  Created by hana on 2023/04/19.
//
///문제: 최소 힙을 이용하여 다음과 같은 연산을 지원. 1. 배열에 자연수 x를 넣음 2. 배열에서 가장 작은값을 출력하고 그 값을 배열에서 제거
///입력: 첫째 줄에 연산의 개수 N(1 ≤ N ≤ 100,000),  다음 N개의 줄에는 연산에 대한 정보를 나타내는 정수 x (x가 자연수- 추가연산, x가 0 - 최소 값  출력 후 제거)
///출력: 입력에서 0이 주어진 횟수만큼 답을 출력. 빈 배열은 0 출력
///풀이:
///시간복잡도:
///???:

import Foundation

///Comparable: 관계 연산자 , <=, >=, 를 사용하여 비교할 수 있는 유형
struct Heap<T: Comparable>{
    private var heap: [T] = []
    
    init(){}
    init(_ element: T){
        heap.append(element) //0번 인덱스 채움
        heap.append(element) //실제 사용할 root Node
    }
    
    var isEmpty: Bool{
        return heap.count <= 1
    }
    
    //mutating: 특정 메소드 내에서 구조체/열거형의 프로퍼티를 수정해야할 때
    mutating func insert(_ element: T){
        if heap.isEmpty{
            heap.append(element)
            heap.append(element)
            return
        }
        heap.append(element)
        
        var insertIndex = heap.count - 1
        
        //추가된 값보다 부모가 더 크면 스왑
        while isSwapUp(insertIndex){
            let parentIndex = insertIndex / 2
            
            //작은 숫자를 위로
            heap.swapAt(insertIndex, parentIndex)
            insertIndex = parentIndex
        }
    }
    
    mutating func pop() -> T?{
        if heap.count <= 1{
            return nil
        }
        
        //최소값인 루트 값 반환
        let returnValue = heap[1]
        //젤 하위노드를 루트노드로 이동
        heap.swapAt(1, heap.count - 1)
        heap.removeLast()
        
        var popIndex = 1
        
        while isSwapDown(popIndex).0{
            let leftIndex = popIndex * 2
            let rightIndex = popIndex * 2 + 1
            
            //true = 왼쪽 자식노드와 swap, false = 오른쪽 자식노드와 swap
            switch isSwapDown(popIndex).1{
            case true: heap.swapAt(popIndex, leftIndex)
                popIndex = leftIndex
            case false: heap.swapAt(popIndex, rightIndex)
                popIndex = rightIndex
            default: break
            }
        }
        
        return returnValue
        
    }
    
    ///현재노드가 부모노드 보다 작은지 비교. 작으면 true
    private func isSwapUp(_ index: Int) -> Bool{
        //부모노드가 없음
        if index <= 1{
            return false
        }
        
        let parentIndex = index / 2
        
        return heap[index] < heap[parentIndex]
    }
    
    ///현재노드가 자식노드 보다 큰지 비교. 크면 true,
    private func isSwapDown(_ index: Int) -> (Bool, Bool?){
        let leftIndex = index * 2
        let rightIndex = index * 2 + 1
        
        //자식노드가 없는 경우
        if leftIndex >= heap.count{
            return (false, nil)
        }
        
        //왼쪽 자식노드만 있는 경우
        if rightIndex >= heap.count{
            if heap[index] > heap[leftIndex]{
                return (true, true)
            }
            else{
                return (false, nil)
            }
        }
        
        //자식노드가 모두 있는 경우
        if heap[leftIndex] < heap[rightIndex]{
            //index > left > right
            if heap[index] > heap[leftIndex]{
                return (true, true)
            }
            //left > right >= index
            else{
                return (false, nil)
            }
        }
        else{
            //index > right >= left
            if heap[index] > heap[rightIndex]{
                return (true, false)
            }
            //right >= left >= index
            else{
                return (false, nil)
            }
        }
    }
}


func solution_1927(_ x_array: [Int]){
    var array = Heap<Int>()

    x_array.forEach{x in
        switch x{
        case 0 :
            print(array.pop() ?? 0)
        default:
            array.insert(x)
        }
    }
}

var x_array: [Int] = []
let input: Int = Int(readLine()!)!
for _ in 1...input{
    x_array.append(Int(readLine()!)!)
}

solution_1927(x_array)
