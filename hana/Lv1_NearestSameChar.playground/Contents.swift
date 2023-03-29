import Foundation

func solution(_ s:String) -> [Int] {
    var result: [Int] = []
    let sArray: [String] = s.map{String($0)}
    
    for i in 0...sArray.count - 1{
        if i == 0{
            result.append(-1)
            continue
        }
        
        let index = sArray[0...i - 1].lastIndex(of: sArray[i])
        
        if index != nil{
            result.append(i - index!)
        }
        else{
            result.append(-1)
        }
    }
    return result
}
solution("banana")
