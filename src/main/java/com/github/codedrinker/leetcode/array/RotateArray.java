package com.github.codedrinker.leetcode.array;

/**
 * Created by codedrinker on 2019/5/25.
 */
public class RotateArray {
    public void rotate(int[] nums, int k) {
        int[] temp = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            temp[i] = nums[i];
        }

        for (int i = 0; i < temp.length; i++) {
            nums[(i + k) % temp.length] = temp[i];
        }
    }
}
