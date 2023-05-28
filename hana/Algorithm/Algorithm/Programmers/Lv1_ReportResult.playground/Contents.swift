import Foundation

///id_list: 유저 id
///report: 이용자 id + 신고한 id
///k: 정지 기준
///return: 유저별 신고처리 결과 메일을 받은 횟수
func solution(_ id_list:[String], _ report:[String], _ k:Int) -> [Int] {
    //Set
    var set_report = Set<String>(report)
    
    //id dic - [stringId:int]
    var dic_id_list = [String:Int]()
    for i in 0..<id_list.count{
        dic_id_list.updateValue(i, forKey: id_list[i])
    }
    
    //report set - "str str" -> "int int"
    set_report = Set(set_report.map{
        return $0.replacingOccurrences(of: String($0.split(separator: " ")[0]), with: String(dic_id_list[String($0.split(separator: " ")[0])]!))
                 .replacingOccurrences(of: String($0.split(separator: " ")[1]), with: String(dic_id_list[String($0.split(separator: " ")[1])]!))
    })
    print("set_report - \(set_report)")

    //신고한(정지된) id dic - [intId:cnt] <<<error
    var dic_bad_id_list = [Int:Int]()
    var i = 0
    set_report.map{
        dic_bad_id_list.updateValue((dic_bad_id_list[Int(String($0.split(separator: " ")[1])) ?? 0] ?? 0) + 1, forKey: Int(String($0.split(separator: " ")[1])) ?? 0)
    }
    print("dic_bad_id_list - \(dic_bad_id_list)")

    //dic [유저:[신고한 id]]
    var dic_ = [Int:Set<Int>]()
    set_report.map{
        guard let normal = Int($0.split(separator: " ")[0]) else {return}
        guard let bad = Int($0.split(separator: " ")[1]) else {return}
        dic_.updateValue([], forKey: normal)

        if dic_bad_id_list[bad]! >= k {
            print("\(normal) -> \(bad)")
            //딕셔너리[key] = value >> value.update(with:) = 벨류를 새로 씀 >> 현 딕셔너리.update(bad).update(bad)
            var dic_value:Set<Int> = dic_[normal] ?? [0]
            dic_[normal]!.update(with: (dic_value.update(with: bad) ?? 0))
        }
    }
    print("dic_ - \(dic_)")
    print("dic_id_list - \(dic_id_list)")
    
    return dic_id_list.map{dic_[$1]?.count ?? 0}
}

solution(["muzi", "frodo", "apeach", "neo"],["muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"], 2)



////Set
//let set_id_list = Set<String>(id_list)
////중복 제거
//let distinctReport = Set(report)
//
////대상 유저가 신고한 id목록 & 중복제거
//let bad_id_list = Set<String>(distinctReport
//    .filter({set_id_list.contains( String($0.split(separator: " ")[0]))})
//    .map{String($0.split(separator: " ")[1])})
//
////신고한 id : [이용자id]
//var dic_bad_id_list = [String:Set<String>]()
//bad_id_list.map{id in
//    dic_bad_id_list.updateValue([], forKey: id)
//    distinctReport
//        .filter{id == String($0.split(separator: " ")[1])}
//        .map{dic_bad_id_list[id]?.update(with: String($0.split(separator: " ")[0]))}
//}
//
////이용자id : [신고한 id -> 정지된 id]
//var dic_id_list = [String:Set<String>]()
//set_id_list.forEach{id in
//    dic_id_list.updateValue([], forKey: id)
//    distinctReport
//        .filter{id == String($0.split(separator: " ")[0])}
//        .map{
//            if dic_bad_id_list[String($0.split(separator: " ")[1])]!.count >= k{
//                dic_id_list[id]?.update(with: String($0.split(separator: " ")[1]))
//            }
//    }
//}
//
//return id_list.map{dic_id_list[$0]!.count}

















//    //이용자id : [신고한 id]
//    var dic_id_list = [String:[String]]()
//    id_list.forEach{id in
//        distinctReport
//            .filter{id == String($0.split(separator: " ")[0])}
//            .forEach{dic_id_list[id]?.append(String($0.split(separator: " ")[1]))}
//    }

//    //유저별로 메일을 받은 횟수
//    var result = [Int](repeating: 0, count: id_list.count)
//
//    //중복 제거
//    let distinctReport = Set(report)
//
//    //대상 유저가 신고한 id목록 & 중복제거
//    let bad_id_list = Set(distinctReport
//        .filter{id_list.contains( String($0.split(separator: " ")[0]))}
//        .map{String($0.split(separator: " ")[1])})
//
//    //신고한 id : [이용자id]
//    var dic_bad_id_list = [String:[String]]()
//    bad_id_list.forEach{id in
//        distinctReport
//            .filter{id == String($0.split(separator: " ")[1])}
//            .forEach{dic_bad_id_list[id]?.append(String($0.split(separator: " ")[0]))}
//    }
//
//    dic_bad_id_list.forEach{key, value in
//        if value.count >= k {
//            value.forEach{ id in
//                result[id_list.firstIndex(of: id)!] += 1
//            }
//        }
//    }
    



//    //유저별로 메일을 받은 횟수
//    var result: [Int] = []
//
//    //중복 제거
//    let distinctReport = Set(report)
//
//    //대상 유저가 신고한 id목록 & 중복제거
//    let bad_id_list = Set(distinctReport
//        .filter({id_list.contains( String($0.split(separator: " ")[0]))})
//        .map{String($0.split(separator: " ")[1])})
//
//    var mailList = bad_id_list.compactMap{id in
//        if distinctReport.filter({id == String($0.split(separator: " ")[1])}).count >= k{
//            return distinctReport.filter({id == String($0.split(separator: " ")[1])}).map{String($0.split(separator: " ")[0])}
//        }
//        return []
//    }
//
//    id_list.forEach{id in
//        result.append(mailList.filter{$0.contains(id)}.count)
//    }
