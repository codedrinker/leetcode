package com.github.codedrinker.leetcode.string;

/**
 * Created by codedrinker on 2019/6/29.
 */
public class ReverseString2 {
    public String reverseStr(String s, int k) {
        char[] chars = s.toCharArray();
        for (int start = 0; start < chars.length; start += 2 * k) {
            int i = start, j = Math.min(start + k - 1, chars.length - 1);

            while (i < j) {
                char swap = chars[i];
                chars[i++] = chars[j];
                chars[j--] = swap;
            }
        }
        return new String(chars);
    }
}
