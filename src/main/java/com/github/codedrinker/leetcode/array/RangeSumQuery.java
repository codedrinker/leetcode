package com.github.codedrinker.leetcode.array;

/**
 * Created by codedrinker on 2019/6/18.
 */
public class RangeSumQuery {

    private int[] nums;

    public RangeSumQuery(int[] nums) {
        this.nums = nums;
    }

    public int sumRange(int i, int j) {
        int ans = 0;
        for (int i1 = i; i1 <= j; i1++) {
            ans += nums[i1];
        }
        return ans;
    }

    public static void main(String[] args) {
        int ans = new RangeSumQuery(new int[]{1, 2, 3, 4, 5}).sumRange(0, 2);
        System.out.println(ans);
    }
}
