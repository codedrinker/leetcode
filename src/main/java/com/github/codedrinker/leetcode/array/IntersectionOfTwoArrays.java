package com.github.codedrinker.leetcode.array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by codedrinker on 2019/6/16.
 */
public class IntersectionOfTwoArrays {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> sets = new HashSet();
        List<Integer> contains = new ArrayList<>();
        for (int num1 : nums1) {
            sets.add(num1);
        }

        for (int num2 : nums2) {
            if (sets.contains(num2)) {
                contains.add(num2);
                sets.remove(num2);
            }
        }

        int[] ints = new int[contains.size()];
        for (int i = 0; i < contains.size(); i++) {
            ints[i] = contains.get(i);
        }
        return ints;
    }
}
