package com.github.codedrinker.leetcode.queue;

import java.util.Stack;

/**
 * Created by codedrinker on 2019/5/29.
 */
public class ImplementQueueUsingStacks {
    public static class MyQueue {
        private Stack<Integer> s1 = new Stack();
        private Stack<Integer> s2 = new Stack();

        /**
         * Initialize your data structure here.
         */
        public MyQueue() {

        }

        /**
         * Push element x to the back of queue.
         */
        public void push(int x) {
            if (s1.isEmpty()) {
                s1.push(x);
            } else {
                while (!s1.isEmpty()) {
                    s2.push(s1.pop());
                }
                s1.push(x);
                while (!s2.isEmpty()) {
                    s1.push(s2.pop());
                }
            }
        }

        /**
         * Removes the element from in front of queue and returns that element.
         */
        public int pop() {
            return s1.pop();
        }

        /**
         * Get the front element.
         */
        public int peek() {
            return s1.peek();
        }

        /**
         * Returns whether the queue is empty.
         */
        public boolean empty() {
            return s1.empty();
        }
    }

    public static void main(String[] args) {
        MyQueue obj = new MyQueue();
        obj.push(1);
        int param_2 = obj.pop();
        int param_3 = obj.peek();
        boolean param_4 = obj.empty();
    }
}