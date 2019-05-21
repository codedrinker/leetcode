package com.github.codedrinker.leetcode.tree;

/**
 * Created by codedrinker on 2019/5/21.
 */
public class SameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p != null && q == null) {
            return false;
        }
        if (p == null && q != null) {
            return false;
        }

        if (p == null && q == null) {
            return true;
        }

        if (p.val == q.val) {
            return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
        } else {
            return false;
        }
    }


    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
