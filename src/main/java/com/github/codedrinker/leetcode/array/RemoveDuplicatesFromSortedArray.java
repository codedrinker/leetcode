package com.github.codedrinker.leetcode.array;

/**
 * Created by codedrinker on 2019/5/20.
 */
public class RemoveDuplicatesFromSortedArray {

    public int removeDuplicates(int[] nums) {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[j] != nums[i]) {
                j++;
                nums[j] = nums[i];
            } else {
                nums[j] = nums[i];
            }
        }
        return j + 1;
    }
}
