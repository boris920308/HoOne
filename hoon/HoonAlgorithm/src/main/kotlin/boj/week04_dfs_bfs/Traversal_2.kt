package main.kotlin.boj.week04_dfs_bfs

/**
 *
 * no.1991
 * https://www.acmicpc.net/problem/1991
 *
 * 이진 트리를 입력받아 전위 순회(preorder traversal), 중위 순회(inorder traversal), 후위 순회(postorder traversal)한 결과를 출력하는 프로그램을 작성하시오.
 *
 *
 *           A
 *         /  \
 *        B    C
 *       /    / \
 *      D    E   F
 *                \
 *                 G
 *
 * 예를 들어 위와 같은 이진 트리가 입력되면,
 * 전위 순회한 결과 : ABDCEFG // (루트) (왼쪽 자식) (오른쪽 자식)
 * 중위 순회한 결과 : DBAECFG // (왼쪽 자식) (루트) (오른쪽 자식)
 * 후위 순회한 결과 : DBEGFCA // (왼쪽 자식) (오른쪽 자식) (루트)
 * 가 된다.
 *
 * 입력
 * 첫째 줄에는 이진 트리의 노드의 개수 N(1 ≤ N ≤ 26)이 주어진다. 둘째 줄부터 N개의 줄에 걸쳐 각 노드와 그의 왼쪽 자식 노드, 오른쪽 자식 노드가 주어진다. 노드의 이름은 A부터 차례대로 알파벳 대문자로 매겨지며, 항상 A가 루트 노드가 된다. 자식 노드가 없는 경우에는 .으로 표현한다.
 *
 * 출력
 * 첫째 줄에 전위 순회, 둘째 줄에 중위 순회, 셋째 줄에 후위 순회한 결과를 출력한다. 각 줄에 N개의 알파벳을 공백 없이 출력하면 된다.
 *
 * 예제 입력 1
 * 7
 * A B C
 * B D .
 * C E F
 * E . .
 * F . G
 * D . .
 * G . .
 *
 *
 * 예제 출력 1
 * ABDCEFG
 * DBAECFG
 * DBEGFCA
 */

import java.io.BufferedReader
import java.io.InputStreamReader

class Node<String>(val value: String, var left: Node<String>? = null, var right: Node<String>? = null)

class BinaryTree {
    var root: Node<String>? = null

    fun addNode(value: String, leftValue: String, rightValue: String) {
        if (root == null) {
            if (value != ".") root = Node(value)
            if (leftValue != ".") root!!.left = Node(leftValue)
            if (rightValue != ".") root!!.right = Node(rightValue)
        } else {
            findNode(root!!, value, leftValue, rightValue)
        }
    }

    private fun findNode(root: Node<String>, value: String, leftValue: String, rightValue: String) {
        if (root.value == value) {
            if (leftValue != ".") root.left = Node(leftValue)
            if (rightValue != ".") root.right = Node(rightValue)
        } else {
            if (root.left != null) findNode(root.left!!, value, leftValue, rightValue)
            if (root.right != null) findNode(root.right!!, value, leftValue, rightValue)
        }
    }

    fun preOrderTraversal(node: Node<String>?) {
        if (node != null) {
            print(node.value)
            preOrderTraversal(node.left)
            preOrderTraversal(node.right)
        }
    }

    fun inOrderTraversal(node: Node<String>?) {
        if (node != null) {
            inOrderTraversal(node.left)
            print(node.value)
            inOrderTraversal(node.right)
        }
    }

    fun postOrderTraversal(node: Node<String>?) {
        if (node != null) {
            postOrderTraversal(node.left)
            postOrderTraversal(node.right)
            print(node.value)
        }
    }
}

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val binaryTree = BinaryTree()
    val nodeCount = readLine().toInt()
    repeat(nodeCount) {
        val (value, leftValue, rightValue) = readLine()!!.split(" ")
        binaryTree.addNode(value[0].toString(), leftValue[0].toString(), rightValue[0].toString())
    }

    binaryTree.preOrderTraversal(binaryTree.root)
    println()
    binaryTree.inOrderTraversal(binaryTree.root)
    println()
    binaryTree.postOrderTraversal(binaryTree.root)
}