package com.github.codedrinker.leetcode.array;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by codedrinker on 2019/6/2.
 */
public class MissingNumber {
    public int missingNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        for (int i = 0; i < nums.length + 1; i++) {
            if (!set.contains(i))
                return i;
        }
        return -1;
    }
}
