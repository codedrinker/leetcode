package com.github.codedrinker.leetcode.tree;

import java.util.List;

/**
 * Created by codedrinker on 2019/7/15.
 */
public class MaximumDepthOfNaryTree {
    class Node {
        public int val;
        public List<Node> children;

        public Node() {
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }

    public int maxDepth(Node root) {
        if (root == null) {
            return 0;
        }
        int max = 0;
        if (root.children == null || root.children.size() == 0) {
            return 1;
        } else {
            for (Node child : root.children) {
                max = Math.max(max, maxDepth(child));
            }
            return 1 + max;
        }
    }
}
