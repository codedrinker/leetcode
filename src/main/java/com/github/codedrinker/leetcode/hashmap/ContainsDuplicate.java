package com.github.codedrinker.leetcode.hashmap;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by codedrinker on 2019/5/27.
 */
public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> exists = new HashSet<>();
        for (int num : nums) {
            if (exists.contains(num)) {
                return true;
            } else {
                exists.add(num);
            }
        }
        return false;
    }
}
