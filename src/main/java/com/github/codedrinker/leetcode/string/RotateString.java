package com.github.codedrinker.leetcode.string;

/**
 * Created by codedrinker on 2019/6/30.
 */
public class RotateString {
    public boolean rotateString(String A, String B) {
        return A.length() == B.length() && (A + A).contains(B);
    }
}
