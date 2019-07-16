package com.github.codedrinker.leetcode.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by codedrinker on 2019/7/16.
 */
public class NaryTreePostorderTraversal {
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

    List<Integer> list = new ArrayList<>();

    public List<Integer> postorder(Node root) {
        if (root != null) {
            if (root.children != null && root.children.size() != 0) {
                for (Node  child: root.children) {
                    postorder(child);
                }
            }
            list.add(root.val);
        }
        return list;
    }
}
