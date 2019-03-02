package com.github.codedrinker.leetcode.string;

/**
 * Created by codedrinker on 2019/3/2.
 * {https://leetcode.com/problems/valid-parenthesis-string/}
 * TODO:double check
 */
public class ValidParenthesisString {

    public boolean checkValidString(String s) {
        int lo = 0, hi = 0;
        for (char c: s.toCharArray()) {
            lo += c == '(' ? 1 : -1;
            hi += c != ')' ? 1 : -1;
            if (hi < 0) break;
            lo = Math.max(lo, 0);
        }
        return lo == 0;
    }

    public static void main(String[] args) {
        System.out.println(new ValidParenthesisString().checkValidString("(())((())()()(*)(*()(())())())()()((()())((()))(*"));
    }
}
