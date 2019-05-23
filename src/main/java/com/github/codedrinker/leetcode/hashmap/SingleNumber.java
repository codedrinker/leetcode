package com.github.codedrinker.leetcode.hashmap;

/**
 * Created by codedrinker on 2019/5/23.
 */
public class SingleNumber {
    public int singleNumber(int[] nums) {
        int single = 0;
        for (int num : nums) {
            single ^= num;
        }
        return single;
    }

    public static void main(String[] args) {
        System.out.println(1 ^ 1);
        System.out.println(0 ^ 1);
        System.out.println(1 ^ 0);
        System.out.println(1 ^ 3);
    }
}
