package com.github.codedrinker.leetcode.array;

/**
 * Created by codedrinker on 2019/5/23.
 */
public class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        int valleys = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < valleys) {
                valleys = prices[i];
            } else if (prices[i] - valleys > maxProfit) {
                maxProfit = prices[i] - valleys;
            }
        }
        return maxProfit;
    }
}
