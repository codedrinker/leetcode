package com.github.codedrinker.leetcode.hashmap;

/**
 * Created by codedrinker on 2019/5/27.
 */
public class ContainsDuplicate2 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                if (j - i > k)
                    break;
                if (j != i && nums[j] == nums[i]) return true;
            }
        }
        return false;
    }
}
