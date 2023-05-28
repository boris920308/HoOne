import Foundation

func solution(_ citations:[Int]) -> Int {
    var h_index = 0
    let sorted = citations.sorted()
    
    for h in 0...sorted.count{
        if h <= sorted.filter({$0 >= h}).count &&
            h >= sorted.filter({$0 < h}).count {
            h_index = h
        }
    }
    
    return h_index
}

solution([7,7,7,7,3])

//논문이 인용된 수 중에서 h를 구하는게 아니라, 그냥 자연수 h를 구하는거였삼
