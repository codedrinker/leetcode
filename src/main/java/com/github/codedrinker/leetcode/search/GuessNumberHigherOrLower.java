package com.github.codedrinker.leetcode.search;

/**
 * Created by codedrinker on 2019/6/16.
 */


public class GuessNumberHigherOrLower {

    public int guess(int num) {
        return 0;
    }

    public int guessNumber(int n) {
        int left = 1, right = n;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (guess(mid) == 0) {
                return mid;
            }
            if (guess(mid) > 0) {
                right = mid - 1;
            }
            if (guess(mid) < 0) {
                left = mid + 1;
            }

        }
        return -1;
    }
}
