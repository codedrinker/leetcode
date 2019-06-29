package com.github.codedrinker.leetcode.string;

/**
 * Created by codedrinker on 2019/6/29.
 */
public class StudentAttendanceRecordI {
    public boolean checkRecord(String s) {
        int a = 0;
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == 'A') {
                if (++a > 1) {
                    return false;
                }
            }
            if (chars[i] == 'L') {
                if (i + 2 <= chars.length-1 && chars[i + 1] == chars[i + 2] && chars[i + 2] == 'L') {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        new StudentAttendanceRecordI().checkRecord("AA");
    }
}
