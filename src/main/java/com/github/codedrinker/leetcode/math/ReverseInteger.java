package com.github.codedrinker.leetcode.math;

/**
 * Created by codedrinker on 2019/5/19.
 *
 * @link {https://leetcode.com/problems/reverse-integer/}
 */
public class ReverseInteger {
    public int reverse(int x) {
        int result = 0;
        while (x != 0) {
            if (Math.abs(result) > Integer.MAX_VALUE / 10) {
                return 0;
            }
            result = result * 10 + x % 10;
            x = x / 10;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(new ReverseInteger().reverse(12));
        System.out.println(new ReverseInteger().reverse(123));
        System.out.println(new ReverseInteger().reverse(-312));
    }
}
