package com.github.codedrinker.leetcode.linkedlist;

/**
 * Created by codedrinker on 2019/5/31.
 */
public class DeleteNodeInAlinkedList {


    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;

    }
}
