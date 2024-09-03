package main.kotlin.boj.week04_dfs_bfs

import java.io.BufferedReader
import java.io.InputStreamReader

/**
 *
 * no.1991
 * https://www.acmicpc.net/problem/1991
 */

var tree = Array<Pair<Int, Int>>(26){ Pair(0, 0) }

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val nodeCount = readLine().toInt()
    repeat(nodeCount) {
        val nodeInfo = readLine().split(' ').map { it[0] }

        var left = if (nodeInfo[1] == '.') -1 else nodeInfo[1] - 'A'
        var right = if (nodeInfo[2] == '.') -1 else nodeInfo[2] - 'A'


        tree[nodeInfo[0] - 'A'] = Pair(left, right)
    }
    preOrder(0)
    println()
    inOrder(0)
    println()
    postOrder(0)
}

fun preOrder(n: Int) {
    if (n == -1) return
    print('A' + n)
    preOrder(tree[n].first)
    preOrder(tree[n].second)
}

fun inOrder(n:Int){
    if(n==-1) return
    inOrder(tree[n].first)
    print('A'+n)
    inOrder(tree[n].second)
}

fun postOrder(n:Int){
    if(n==-1) return
    postOrder(tree[n].first)
    postOrder(tree[n].second)
    print('A'+n)
}
