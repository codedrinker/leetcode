package com.github.codedrinker.leetcode.hashmap;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by codedrinker on 2019/6/18.
 */
public class FirstUniqueCharacterInAString {
    public int firstUniqChar(String s) {
        if (s == null || s == "") return -1;
        Map<Character, Integer> exists = new HashMap<>();
        char[] chars = s.toCharArray();
        for (char c : chars) {
            Integer integer = exists.get(c);
            if (integer != null) {
                exists.put(c, integer + 1);
            } else {
                exists.put(c, 1);
            }
        }

        for (int i = 0; i < chars.length; i++) {
            if (exists.get(chars[i]) == 1) {
                return i;
            }
        }
        return -1;
    }
}
