package com.github.codedrinker.leetcode.array;

/**
 * Created by codedrinker on 2019/5/23.
 */
public class BestTimeToBuyAndSellStock2 {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                maxProfit += prices[i] - prices[i - 1];
            }
        }
        return maxProfit;
    }
}
