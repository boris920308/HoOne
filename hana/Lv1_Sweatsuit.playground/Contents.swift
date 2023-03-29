import Foundation

func solution(_ n:Int, _ lost:[Int], _ reserve:[Int]) -> Int {
    var var_lost = lost.filter{!reserve.contains($0)}.sorted{$0 < $1}
    var var_reserve = reserve.filter{!lost.contains($0)}.sorted{$0 < $1}
    var rm_cnt = 0
    
    var_lost.map{i in
        if var_reserve.contains(i - 1){
            rm_cnt += 1
            var_reserve.removeAll{r in r == i - 1}
        }else if var_reserve.contains(i + 1){
            rm_cnt += 1
            var_reserve.removeAll{r in r == i + 1}
        }
    }

    return n - (var_lost.count - rm_cnt)
}

//전체 학생의 수, 도난당한 학번, 여벌이 있는 학번 -> 최대 학생수
solution(8, [5,6,7,8], [4,7])
