package com.github.codedrinker.leetcode.string;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by codedrinker on 2019/6/2.
 */
public class ValidAnagrams {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> map = new HashMap<>();

        for (char c : s.toCharArray()) {
            Integer integer = map.get(c);
            if (integer != null) {
                map.put(c, integer + 1);
            } else {
                map.put(c, 1);
            }
        }

        for (char c : t.toCharArray()) {
            Integer integer = map.get(c);
            if (integer != null) {
                integer = integer - 1;
                if (integer < 0)
                    return false;
                map.put(c, integer);
            } else {
                return false;
            }
        }

        return map.isEmpty();
    }
}
