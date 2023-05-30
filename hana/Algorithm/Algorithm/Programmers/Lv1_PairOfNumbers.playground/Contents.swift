import Foundation

func solution(_ X:String, _ Y:String) -> String {
    var result: String = ""
    var X = X
    var Y = Y
    var Xnumbers = [Int](repeating: 0, count: 10)
    var Ynumbers = [Int](repeating: 0, count: 10)
    
    while !X.isEmpty {
        Xnumbers[Int(String(X.popLast()!))!] += 1
    }
    while !Y.isEmpty {
        Ynumbers[Int(String(Y.popLast()!))!] += 1
    }

    for (i, v) in (0..<10).map({min(Xnumbers[9-$0], Ynumbers[9-$0])}).enumerated(){
        result += (0..<v).map{_ in "\(9-i)"}.joined()
    }
    
    return result.isEmpty ? "-1" : result.first == "0" ? "0" : result
}

print(solution("100", "123450"))


//세번째 풀이 - String sorted 시간초과
//    while true {
//        if X.isEmpty || Y.isEmpty{
//            break
//        }
//
//        if X.last! == Y.last!{
//            result.append(X.popLast()!)
//            Y.popLast()
//            continue
//        }
//        max(X.last!, Y.last!) == X.last ? X.popLast() : Y.popLast()
//    }

//두번째 풀이 - String sorted 시간초과
//    (stride(from: 9, through: 0, by: -1)).map{Character(String($0))}.forEach{i in
//        while X.last(where: {$0 == i}) != nil{
//            if Y.last(where: {$0 == i}) != nil{
//                result.append(X.popLast()!)
//                Y.popLast()
//                continue
//            }
//            X.popLast()
//        }
//        while Y.last(where: {$0 == i}) != nil{
//            Y.popLast()
//        }
//    }


//첫번째 풀이 - String sorted 시간초과
//    stride(from: X.count - 1, through: 0, by: -1).forEach{x in
//        stride(from: Y.count - 1, through: 0, by: -1).forEach{y in
//            if x == X.count || y == Y.count{
//                return
//            }
//            if X[x] == Y[y]{
//                result.append(String(X[x]))
//                X.remove(at: x)
//                Y.remove(at: y)
//            }
//        }
//    }
