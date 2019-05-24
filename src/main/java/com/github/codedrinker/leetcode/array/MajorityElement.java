package com.github.codedrinker.leetcode.array;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by codedrinker on 2019/5/24.
 */
public class MajorityElement {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap();
        for (int num : nums) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }
        Set<Integer> integers = map.keySet();
        for (Integer integer : integers) {
            if (map.get(integer) > nums.length / 2) {
                return integer;
            }
        }
        return -1;
    }
}
