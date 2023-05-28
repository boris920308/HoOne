func solution(_ n:Int) -> Int {
    var isPrime = [Bool](repeating: true, count: n + 1)
    isPrime[0] = false
    isPrime[1] = false
    
    if n > 3{
        (2...n/2).forEach{ i in
            if !isPrime[i]{
                return
            }
            (2...n/i).forEach{ j in
                isPrime[j * i] = false
            }
        }
    }
    
    return isPrime.filter{$0 == true}.count
}
