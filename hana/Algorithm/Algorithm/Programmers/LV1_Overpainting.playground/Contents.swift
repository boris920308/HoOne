//n - 벽 길이&구역 번호, m - 롤러 길이, section - 다시 칠해야 하는 벽
//return 페인트 칠 최소 횟수
func solution(_ n:Int, _ m:Int, _ section:[Int]) -> Int {
    var cnt = 1
    var temp = section.first!   //롤러 시작 구역

    section.forEach{
        if $0 >= temp + m{
            temp = $0
            cnt += 1
        }
    }
    return cnt
}

//세번째 풀이 - 첫번째 페인트 칠 제외하고 최적 범위가 안나옴
//return Set(section.map{$0 + section.first! - 1}.map{$0 / m}).count

//두번째 풀이 - for&for 시간초과
//    (1...n).forEach{i in
//        if section.first == i{
//            cnt += 1
//            (0..<m).forEach{
//                if section.first == i + $0{
//                    section.removeFirst()
//                }
//            }
//        }
//    }

//첫번째 풀이 - while&removeAll 시간초과
//    var array = Array(1...n)
//    while !section.isEmpty{
//        if section.first == array.first {
//            cnt += 1
//            section.removeAll(where: {$0 >= array.first! && $0 < array.first! + m})
//        }
//        array.removeFirst()
//    }
