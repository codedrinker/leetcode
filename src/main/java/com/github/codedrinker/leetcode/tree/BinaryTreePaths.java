package com.github.codedrinker.leetcode.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by codedrinker on 2019/6/2.
 */
public class BinaryTreePaths {


    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public List<String> binaryTreePaths(TreeNode root) {
        List<String> ans = new ArrayList();
        if (root != null) {
            findPaths(root, ans, "");
        }
        return ans;
    }

    public void findPaths(TreeNode treeNode, List<String> ans, String path) {
        if (treeNode.right == null && treeNode.left == null) {
            ans.add(path + treeNode.val);
        }

        if (treeNode.left != null) {
            findPaths(treeNode.left, ans, path + treeNode.val + "->");
        }

        if (treeNode.right != null) {
            findPaths(treeNode.right, ans, path + treeNode.val + "->");
        }
    }
}
