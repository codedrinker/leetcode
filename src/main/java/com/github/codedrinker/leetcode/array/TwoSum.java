package com.github.codedrinker.leetcode.array;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by codedrinker on 2019/5/19.
 * Array HashMap
 */
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int result[] = new int[2];
        Map<Integer, Integer> map = new HashMap();

        for (int i = 0; i < nums.length; i++) {
            Integer integer = map.get(target - nums[i]);
            if (integer != null) {
                result[0] = integer;
                result[1] = i;
                break;
            }
            map.put(nums[i], i);
        }

        return result;
    }
}
