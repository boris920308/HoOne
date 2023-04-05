import Foundation

func solution(_ survey:[String], _ choices:[Int]) -> String {
    var personality = ["RT", "CF", "JM", "AN"]
    var indicators: [Int] = Array(repeating: 0, count: 4)
    
    for i in 0..<survey.count{
        let pair = Array(survey[i])
        var reverse = true
        if pair == pair.sorted(){
            reverse = false
        }
        
        indicators[personality.firstIndex(of: String(pair.sorted()))!] += reverse ?  4 - choices[i] : choices[i] - 4
    }

    for i in 0..<indicators.count{
        if indicators[i] <= 0 {
            personality[i].removeLast()
        }
        else{
            personality[i].removeFirst()
        }
    }

    return String(personality.flatMap{$0})
}


solution(["TR", "RT", "TR"] ,   [7, 1, 3])
