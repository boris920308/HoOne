//JandenCase - 단어의 첫 문자가 대문자, 외에는 소문자
func solution(_ s:String) -> String {
    let words = s.split(separator: " ", omittingEmptySubsequences: false)
    return words.map { word in
        word == "" ? ""
            : "\(word.first!.uppercased())\(word.suffix(word.count - 1).lowercased())"
    }.joined(separator: " ")
}

print(solution("3people  unFollowed me"))
