package com.github.codedrinker.leetcode.hashmap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/roman-to-integer/
 */
public class RomanToInteger {
    public int romanToInt(String s) {
        Map<String, Integer> map = new HashMap<>();
        map.put("I", 1);
        map.put("V", 5);
        map.put("X", 10);
        map.put("L", 50);
        map.put("C", 100);
        map.put("D", 500);
        map.put("M", 1000);
        map.put("IV", 3);
        map.put("IX", 8);
        map.put("XL", 30);
        map.put("XC", 80);
        map.put("CD", 300);
        map.put("CM", 800);

        String[] split = s.split("");
        int ans = 0;
        for (int i = 0; i < split.length; i++) {
            if (i > 0 && map.get(split[i - 1] + split[i]) != null) {
                ans += map.get(split[i - 1] + split[i]);
            } else {
                ans += map.get(split[i]);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        String[] split = "ab".split("");
        System.out.println(Arrays.toString(split));
    }
}
