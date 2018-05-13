package com.github.codedrinker;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by codedrinker on 13/05/2018.
 */
public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        int repeatedIndex = 0, length = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                repeatedIndex = Math.max(map.get(s.charAt(i)), repeatedIndex);
            }

            length = Math.max(length, i - repeatedIndex + 1);
            map.put(s.charAt(i), i + 1);
        }
        return length;
    }

    public static void main(String[] args) {
        LongestSubstringWithoutRepeatingCharacters lswrc = new LongestSubstringWithoutRepeatingCharacters();
        System.out.println(lswrc.lengthOfLongestSubstring("abcabcbb") == 3);
        System.out.println(lswrc.lengthOfLongestSubstring("bbbbb") == 1);
        System.out.println(lswrc.lengthOfLongestSubstring("pwwkew") == 3);

    }
}
