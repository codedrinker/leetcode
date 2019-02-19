package com.github.codedrinker.leetcode.string;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by codedrinker on 2019/2/15.
 */

/**
 * LongestSubstringWithoutRepeatingCharacters 的升级版本
 * 由 LongestSubstringWithoutRepeatingCharacters  可知，在i移动过程中直到刚才的重复是不会有最大指的，
 * 所以直接 skip 到 j 的位置就可以了，使用 map 记录应该skip到哪里
 */
public class LongestSubstringWithoutRepeatingCharactersOptimized {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length(), ans = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0, j = 0; j < n; j++) {
            if (map.containsKey(s.charAt(j))) {
                i = Math.max(map.get(s.charAt(j)) + 1, i);
            }
            ans = Math.max(ans, j - i + 1);
            map.put(s.charAt(j), j);
        }
        return ans;
    }

    public static void main(String[] args) {
        LongestSubstringWithoutRepeatingCharactersOptimized lswrc = new LongestSubstringWithoutRepeatingCharactersOptimized();
        System.out.println(lswrc.lengthOfLongestSubstring("abcabcbb") == 3);
        System.out.println(lswrc.lengthOfLongestSubstring("bbbbb") == 1);
        System.out.println(lswrc.lengthOfLongestSubstring("pwwkew") == 3);

    }
}
