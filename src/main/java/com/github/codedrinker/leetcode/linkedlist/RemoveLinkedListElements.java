package com.github.codedrinker.leetcode.linkedlist;

/**
 * https://leetcode.com/problems/remove-linked-list-elements/
 * 1->2->6->3->4->5->6
 */
public class RemoveLinkedListElements {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    class Solution {
        public ListNode removeElements(ListNode head, int val) {
            ListNode ans = new ListNode(0);
            ans.next = head;
            ListNode cur = ans;
            while (cur.next != null) {
                if (cur.next.val == val) {
                    cur.next = cur.next.next;
                } else {
                    cur = cur.next;
                }
            }
            return ans.next;
        }
    }
}
