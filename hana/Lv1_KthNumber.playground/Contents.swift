func solution(_ array:[Int], _ commands:[[Int]]) -> [Int] {
    var result : [Int] = []
    commands.forEach {command in
        let i = command[0] - 1
        let j = command[1] - 1
        let k = command[2] - 1

        let cropArray = array[i...j]
        let sortArray = cropArray.sorted()
        result.append(sortArray[k])
    }

    return result
}

solution([1, 5, 2, 6, 3, 7, 4], [[2, 5, 3]])

