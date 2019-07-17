package com.github.codedrinker.leetcode.hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by codedrinker on 2019/7/17.
 */
public class MinimumIndexSumOfTwoLists {
    public String[] findRestaurant(String[] list1, String[] list2) {
        Map<String, Integer> strs = new HashMap<>();
        List<String> ans = new ArrayList<>();
        for (int i = 0; i < list1.length; i++) {
            strs.put(list1[i], i);
        }
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < list2.length; i++) {
            Integer integer = strs.get(list2[i]);
            if (integer != null) {
                min = Math.min(integer + i, min);
            }
        }

        for (int i = 0; i < list2.length; i++) {
            Integer integer = strs.get(list2[i]);
            if (integer != null && integer + i == min) {
                ans.add(list2[i]);
            }
        }
        String[] strings = new String[ans.size()];
        return ans.toArray(strings);
    }
}
