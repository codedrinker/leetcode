package com.github.codedrinker.leetcode.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by codedrinker on 2019/7/16.
 */
public class NaryTreePreorderTraversal {
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

    List<Integer> list = new ArrayList();

    public List<Integer> preorder(Node root) {

        if (root != null) {
            list.add(root.val);
            if (root.children != null && root.children.size() != 0) {
                for (Node child : root.children) {
                    preorder(child);
                }
            }
        }
        return list;
    }
}
