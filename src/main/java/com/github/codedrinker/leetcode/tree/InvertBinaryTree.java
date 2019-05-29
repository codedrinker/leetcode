package com.github.codedrinker.leetcode.tree;

/**
 * Created by codedrinker on 2019/5/29.
 */
public class InvertBinaryTree {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public TreeNode invertTree(TreeNode root) {
        if (root != null) {
            TreeNode temp = root.right;
            root.right = invertTree(root.left);
            root.left = invertTree(temp);
        }
        return root;
    }
}
