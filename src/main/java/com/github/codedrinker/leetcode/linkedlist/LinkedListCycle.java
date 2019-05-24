package com.github.codedrinker.leetcode.linkedlist;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by codedrinker on 2019/5/23.
 */
public class LinkedListCycle {

    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public boolean hasCycle(ListNode head) {
        Set<ListNode> contains = new HashSet<>();
        while (head != null) {
            if (contains.contains(head)) {
                return true;
            } else {
                contains.add(head);
            }
            head = head.next;
        }
        return false;
    }
}
