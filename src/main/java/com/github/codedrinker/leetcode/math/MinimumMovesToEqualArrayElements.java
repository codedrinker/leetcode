package com.github.codedrinker.leetcode.math;

/**
 * Created by codedrinker on 2019/6/25.
 */
public class MinimumMovesToEqualArrayElements {
    public int minMoves(int[] nums) {
        int min = Integer.MAX_VALUE, sum = 0;
        for (int num : nums) {
            min = Math.min(min, num);
            sum += num;
        }
        return sum - nums.length * min;
    }

}
