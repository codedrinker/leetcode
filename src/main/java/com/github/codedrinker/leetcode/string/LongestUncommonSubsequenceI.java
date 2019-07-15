package com.github.codedrinker.leetcode.string;

/**
 * Created by codedrinker on 2019/7/14.
 */
public class LongestUncommonSubsequenceI {
    public int findLUSlength(String a, String b) {
        if (a.equals(b))
            return -1;
        return Math.max(a.length(), b.length());
    }
}
