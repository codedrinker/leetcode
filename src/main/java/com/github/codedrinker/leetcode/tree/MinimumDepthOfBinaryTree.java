package com.github.codedrinker.leetcode.tree;

/**
 * Created by codedrinker on 2019/5/22.
 */
public class MinimumDepthOfBinaryTree {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftDepth = minDepth(root.left);
        int rightDepth = minDepth(root.right);
        return leftDepth == 0 || rightDepth == 0 ?
                leftDepth + rightDepth + 1 :
                1 + Math.min(leftDepth, rightDepth);
    }
}
