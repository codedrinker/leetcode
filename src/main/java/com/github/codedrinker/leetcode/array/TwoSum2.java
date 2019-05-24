package com.github.codedrinker.leetcode.array;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by codedrinker on 2019/5/24.
 */
public class TwoSum2 {
    public int[] twoSum(int[] numbers, int target) {
        Map<Integer, Integer> map = new HashMap();
        for (int i = 0; i < numbers.length; i++) {
            Integer integer = map.get(target - numbers[i]);
            if (integer != null) {
                return new int[]{integer + 1, i + 1};
            }
            map.put(numbers[i], i);
        }
        return null;
    }
}
