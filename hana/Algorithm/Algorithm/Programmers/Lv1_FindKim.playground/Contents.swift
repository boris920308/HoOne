func solution(_ seoul:[String]) -> String {
    let x: Int
    
    x = seoul.firstIndex(of: "Kim")!
    
    return "김서방은 \(x)에 있다"
}

solution(["bb", "aa", "Kim", "aa"])
