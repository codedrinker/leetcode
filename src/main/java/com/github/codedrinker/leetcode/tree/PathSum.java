package com.github.codedrinker.leetcode.tree;

/**
 * Created by codedrinker on 2019/5/22.
 */
public class PathSum {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) return false;

        if (root.right == null && root.left == null) {
            return sum - root.val == 0;
        }

        return hasPathSum(root.right, sum - root.val) || hasPathSum(root.left, sum - root.val);
    }
}
