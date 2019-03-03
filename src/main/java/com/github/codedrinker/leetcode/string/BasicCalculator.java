package com.github.codedrinker.leetcode.string;

import java.util.Stack;

/**
 * {https://leetcode.com/problems/basic-calculator-ii/}
 * Created by codedrinker on 2019/2/28.
 * 使用入栈出栈的方式解决计算问题
 * 第一次循环时间复杂度N，循环时间复杂度N，所有解法的时间复杂度为 O(2n)
 */
public class BasicCalculator {

    public int calculate(String s) {
        if (null == s) {
            return 0;
        }
        s = s.trim();
        Stack<Integer> stack = new Stack();
        int sum = 0;
        Character preOper = '+';
        for (int i = 0; i < s.length(); i++) {
            Character c = s.charAt(i);
            if (c.equals(' ')) {
                continue;
            }
            if (Character.isDigit(c)) {
                sum = sum * 10 + Character.digit(c, 10);
            }
            if (!Character.isDigit(c) || i == s.length() - 1) {
                switch (preOper) {
                    case '+':
                        stack.push(sum);
                        break;
                    case '-':
                        stack.push(-sum);
                        break;
                    case '*':
                        stack.push(stack.pop() * sum);
                        break;
                    case '/':
                        stack.push(stack.pop() / sum);
                        break;
                }
                preOper = c;
                sum = 0;
            }
        }
        int result = 0;
        for (Integer integer : stack) {
            result += integer;
        }
        return result;
    }

    public static void main(String[] args) {
        int calculator = new BasicCalculator().calculate(" 3/2 ");
        System.out.println(calculator);
    }
}
