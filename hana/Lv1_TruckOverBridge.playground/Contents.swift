import Foundation

//bridge_length = 최대 올라갈 수 있는 트럭 갯 수
//weight = 최대 견딜 수 있는 무게 (완전히 오른 트럭만)
//truck_weights = 트럭별 무게
//result = 모든 트럭이 다 건너는 최소 시간
func solution(_ bridge_length:Int, _ weight:Int, _ truck_weights:[Int]) -> Int {
    var result = 0
    var before_trucks: [Int] = truck_weights.map{$0}
    var over_trucks: [Int:Int] = [:]
    
    while(true){
        if before_trucks.count == 0 && over_trucks.count == 0{
            break
        }
        result += 1
        
        over_trucks = over_trucks.filter{$0.key + bridge_length > result}
        
        if over_trucks.values.reduce(before_trucks.first ?? 0, {$0 + $1}) <= weight{
            if before_trucks.count < 1{
                continue
            }
            over_trucks[result] = before_trucks.first!
            before_trucks.removeFirst()
        }
    }
    
    return result
}
