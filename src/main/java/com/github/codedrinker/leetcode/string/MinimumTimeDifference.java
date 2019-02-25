package com.github.codedrinker.leetcode.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by codedrinker on 2019/2/25.
 */
public class MinimumTimeDifference {
    public int findMinDifference(List<String> timePoints) {
        int min = 23 * 60 + 60;
        int[] timeNumbers = new int[timePoints.size()];
        for (int i = 0; i < timePoints.size(); i++) {
            String[] split = timePoints.get(i).split(":");
            timeNumbers[i] = Integer.parseInt(split[0]) * 60 + Integer.parseInt(split[1]);
        }
        Arrays.sort(timeNumbers);
        for (int i = timeNumbers.length - 1; i > 0; i--) {
            min = Math.min(timeNumbers[i] - timeNumbers[i - 1], min);
        }
        return Math.min(timeNumbers[0] + 23 * 60 + 60 - timeNumbers[timeNumbers.length - 1], min);
    }

    public static void main(String[] args) {
        List<String> timePoints = new ArrayList<>();
        timePoints.add("05:31");
        timePoints.add("22:08");
        timePoints.add("00:35");
        int midDifference = new MinimumTimeDifference().findMinDifference(timePoints);
        System.out.println(midDifference);
        System.out.println(23 * 60 + 59);
    }
}
