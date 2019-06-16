package com.github.codedrinker.leetcode.math;

/**
 * Created by codedrinker on 2019/6/13.
 */
public class PowerOfThree {
    public boolean isPowerOfThree(int n) {
        if(n < 1) {
            return false;
        }

        while (n % 3 == 0) {
            n /= 3;
        }
        return n == 1;
    }
}
