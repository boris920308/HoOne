import Foundation

//실패율 = 스테이지에 도달했으나 아직 클리어하지 못한 플레이어의 수 / 스테이지에 도달한 플레이어 수
func solution(_ N:Int, _ stages:[Int]) -> [Int] {
    let s = stages.sorted()
    var f = [[Double]](repeating: [0, 0], count: N+2)
    f[0][1] = Double(s.count)

    s.forEach{i in
        f[i][0] += 1
    }
    
    (1...N).forEach{
        f[$0][1] = f[$0-1][1] - f[$0-1][0]
    }
    
    let r = f.map{$0[0] / $0[1]}
    
    return (1...N).sorted(by: {r[$0] > r[$1]})
}

//세번째 풀이 - stages 배열에 없는 stage가 계산되지 않음
//
//let s = stages.sorted()
//var f = [[Double]](repeating: [Double](repeating: 0.0, count: 2), count: N+2)
//
//(0..<stages[0]).forEach{
//    f[$0][1] = Double(s.count)
//}
//
//s.forEach{i in
//    f[i][0] += 1.0
//    f[i][1] = f[i-1][1] - f[i-1][0]   //mis
//}
//let r = f.map{$0[0] / $0[1]}.sorted()
//
//return (1...N).sorted(by: {r[$0] > r[$1]})


//두번째 풀이 - 시간초과
//
//let s = stages.sorted(by: >)
//var f = [Double](repeating: 0, count: N+1)
//
//s.forEach{i in
//    let clear = s.filter{$0 >= i}.count
//    f[i-1] += 1 / Double(clear)
//
//}
//
//return (1...N).sorted(by: {f[$0-1] > f[$1-1]})

//첫번째 풀이 - 시간초과
//
//    stages.sorted().forEach{i in
//        stays[i-1] += 1
//        (0..<i-1).forEach{
//            clears[$0] += 1
//        }
//    }
//
//    let failureRates = zip(clears, stays)
//        .map{Double($0.1)/Double($0.0 == 0 ? 1 : $0.0)}
//
//    return (1...N).sorted(by: {failureRates[$0-1] > failureRates[$1-1]})
