package com.github.codedrinker.leetcode.math;

/**
 * Created by codedrinker on 2019/5/19.
 */
public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        int r = x;
        int t = 0;
        while (r != 0) {
            if (Math.abs(t) > Integer.MAX_VALUE / 10) {
                return false;
            }
            t = t * 10 + r % 10;
            r = r / 10;
        }
        return x == t;
    }

    public static void main(String[] args) {
        System.out.println(new PalindromeNumber().isPalindrome(1000000001));
        System.out.println(Integer.MAX_VALUE / 10);
        System.out.println(1000000001);
    }
}
