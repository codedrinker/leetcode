package com.github.codedrinker;

/**
 * Created by codedrinker on 11/05/2018.
 */
public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode tempNode = new ListNode(0);
        ListNode a = l1, b = l2, curr = tempNode;
        int carry = 0;
        while (a != null || b != null) {
            int x = a != null ? a.val : 0;
            int y = b != null ? b.val : 0;
            int sum = carry + x + y;
            carry = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            if (a != null) a = a.next;
            if (b != null) b = b.next;
        }

        if (carry > 0) {
            curr.next = new ListNode(carry);
        }

        return tempNode.next;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        l1.add(new ListNode(4));
        l1.add(new ListNode(3));
        ListNode l2 = new ListNode(5);
        l2.add(new ListNode(6));
        l2.add(new ListNode(4));
        ListNode listNode = new AddTwoNumbers().addTwoNumbers(l1, l2);
        System.out.println(listNode.val);
        while (listNode.next != null) {
            System.out.println(listNode.next.val);
            listNode = listNode.next;
        }
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }

    public void add(ListNode next) {
        ListNode last = getLast(this);
        last.next = next;
    }

    private ListNode getLast(ListNode next) {
        while (next.next != null) {
            return getLast(next.next);
        }
        return next;
    }
}
