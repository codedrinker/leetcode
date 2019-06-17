package com.github.codedrinker.leetcode.hashmap;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by codedrinker on 2019/6/17.
 */
public class LongestPalindrome {
    public int longestPalindrome(String s) {
        if (s == null || s == "") return 0;
        int ans = 0;

        Set<Character> exists = new HashSet<>();
        char[] chars = s.toCharArray();
        for (char c : chars) {
            if (exists.contains(c)) {
                ans += 2;
                exists.remove(c);
            } else {
                exists.add(c);
            }
        }

        if (ans < chars.length)
            return ans + 1;
        else return ans;
    }
}
