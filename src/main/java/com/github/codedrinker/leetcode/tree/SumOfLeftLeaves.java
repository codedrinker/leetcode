package com.github.codedrinker.leetcode.tree;

/**
 * Created by codedrinker on 2019/6/27.
 */
public class SumOfLeftLeaves {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    int ans;

    public int sumOfLeftLeaves(TreeNode root) {
        if (root == null) return 0;
        depth(root);
        return ans;
    }


    public void depth(TreeNode root) {
        if (root == null) return;
        if (root.left != null && root.left.left == null && root.left.right == null) {
            ans += root.left.val;
        }
        depth(root.left);
        depth(root.right);
    }
}
