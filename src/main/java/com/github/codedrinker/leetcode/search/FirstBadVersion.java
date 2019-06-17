package com.github.codedrinker.leetcode.search;

/**
 * Created by codedrinker on 2019/6/17.
 */
public class FirstBadVersion {/**/

    boolean isBadVersion(int version) {
        return false;
    }

    public int firstBadVersion(int n) {
        int left = 1, right = n;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (isBadVersion(mid)) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
}
