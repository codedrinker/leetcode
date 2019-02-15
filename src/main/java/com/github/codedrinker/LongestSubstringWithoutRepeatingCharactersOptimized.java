package com.github.codedrinker;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by codedrinker on 2019/2/15.
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
