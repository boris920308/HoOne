import Foundation

func solution(_ n:Int, _ lost:[Int], _ reserve:[Int]) -> Int {
    var var_lost = Array(Set(lost).subtracting(Set(reserve))).sorted()
    var var_reserve = Array(Set(reserve).subtracting(Set(lost))).sorted()
    var absenceCnt = var_lost.count
    
    while !var_lost.isEmpty && !var_reserve.isEmpty{
        if var_lost.last == var_reserve.last! + 1 || var_lost.last == var_reserve.last! - 1{
            absenceCnt -= 1
            var_lost.popLast()
            var_reserve.popLast()
            continue
        }
        max(var_lost.last!, var_reserve.last!) == var_lost.last ? var_lost.popLast() : var_reserve.popLast()
    }
    
    return n - absenceCnt
}

//func solution(_ n:Int, _ lost:[Int], _ reserve:[Int]) -> Int {
//    var var_lost = lost.filter{!reserve.contains($0)}.sorted{$0 < $1}
//    var var_reserve = reserve.filter{!lost.contains($0)}.sorted{$0 < $1}
//    var rm_cnt = 0
//
//    var_lost.map{i in
//        if var_reserve.contains(i - 1){
//            rm_cnt += 1
//            var_reserve.removeAll{r in r == i - 1}
//        }else if var_reserve.contains(i + 1){
//            rm_cnt += 1
//            var_reserve.removeAll{r in r == i + 1}
//        }
//    }
//
//    return n - (var_lost.count - rm_cnt)
//}

//전체 학생의 수, 도난당한 학번, 여벌이 있는 학번 -> 최대 학생수
solution(8, [5,6,7,8], [4,7])
