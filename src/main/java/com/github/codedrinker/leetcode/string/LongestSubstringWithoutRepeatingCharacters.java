package com.github.codedrinker.leetcode.string;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by codedrinker on 13/05/2018.
 */
public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        int i = 0, j = 0, length = 0;
        Set<Character> characters = new HashSet<>();
        while (i < s.length() && j < s.length()) {
            if (!characters.contains(s.charAt(j))) {
                characters.add(s.charAt(j));
                length = Math.max(j - i + 1, length);
                j++;
            } else {
                characters.remove(s.charAt(i));
                i++;
            }
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
