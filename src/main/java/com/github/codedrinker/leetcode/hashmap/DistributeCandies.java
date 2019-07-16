package com.github.codedrinker.leetcode.hashmap;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by codedrinker on 2019/7/16.
 */
public class DistributeCandies {
    public int distributeCandies(int[] candies) {
        Set<Integer> sets = new HashSet<>();
        for (int candy : candies) {
            sets.add(candy);
        }
        return Math.min(candies.length / 2, sets.size());
    }
}
