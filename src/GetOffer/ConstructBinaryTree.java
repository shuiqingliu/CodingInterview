package com.company;

/**
 * Created by qingliu on 2/28/18.
 */

// 面试题7：重建二叉树
// 题目：输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。假设输
// 入的前序遍历和中序遍历的结果中都不含重复的数字。例如输入前序遍历序列{1,
// 2, 4, 7, 3, 5, 6, 8}和中序遍历序列{4, 7, 2, 1, 5, 3, 8, 6}，则重建出
// 图2.6所示的二叉树并输出它的头结点。
    
public class ConstructBinaryTree {
    private static class BinaryTreeNode{
        int value;
        BinaryTreeNode leftChild;
        BinaryTreeNode rightChild;
    }

    public static BinaryTreeNode ConstructTree(int[] preOrder, int[] inOrder, int length){
        int rootValue = preOrder[0];  //前序遍历的第一个为根节点
        BinaryTreeNode rootNode = new BinaryTreeNode();  //构造根节点
        rootNode.value = rootValue;


    }
}
