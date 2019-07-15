package com.github.codedrinker.leetcode.array;

import java.util.Arrays;

/**
 * Created by codedrinker on 2019/7/14.
 */
public class ArrayPartitionI {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int ans = 0;
        for (int i = 0; i < nums.length; i += 2) {
            ans += nums[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        new ArrayPartitionI().arrayPairSum(new int[]{4, 2, 3});
    }

}
