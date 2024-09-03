package main.kotlin.boj.week04_dfs_bfs

/**
 *
 * no.1991
 * https://www.acmicpc.net/problem/1991
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