//number - 기사단원 수
//공격력 - number의 약수 갯수 && limit 이하
//power - 제한수치를 초과한 기사가 사용할 무기의 공격력
//return 전체 기사단원의 무기를 만들 철의 무게 = 공격력 당 1
func solution(_ number:Int, _ limit:Int, _ power:Int) -> Int {
    return (1...number).map{ i in
        var cnt = 0
        var m = 1
        
        for j in (1...i) {
            if (j * j > i) {
                m = j - 1
                break
            }
        }
        for k in (1...m) {
            if (i % k == 0) {cnt += 2}
            if (k * k == i) {cnt -= 1}
        }
        
        if cnt > limit {
            cnt = power
        }
        return cnt
    }.reduce(0, +)
}

print(solution(5,3,2))
