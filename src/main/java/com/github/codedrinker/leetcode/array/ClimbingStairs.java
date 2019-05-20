package com.github.codedrinker.leetcode.array;

/**
 * Created by codedrinker on 2019/5/20.
 */
public class ClimbingStairs {
    public int climbStairs(int n) {
        return climbStairs(0, n);
    }

    public int climbStairs(int step, int n) {
        if (step > n) {
            return 0;
        }
        if (step == n) {
            return 1;
        }
        return climbStairs(step + 1, n) + climbStairs(step + 2, n);
    }
}
