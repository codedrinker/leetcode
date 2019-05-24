package com.github.codedrinker.leetcode.linkedlist;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by codedrinker on 2019/5/24.
 */
public class IntersectionOfTwoLinkedLists {

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }


    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }

        Set<ListNode> contains = new HashSet<>();
        while (headA != null) {
            contains.add(headA);
            headA = headA.next;
        }


        while (headB != null) {
            if (contains.contains(headB)) {
                return headB;
            }
            headB = headB.next;
        }
        return null;
    }
}
