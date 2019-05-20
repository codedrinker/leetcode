package com.github.codedrinker.leetcode.array;

/**
 * Created by codedrinker on 2019/5/20.
 */
public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int j = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }

    public static void main(String[] args) {
        int i = new RemoveElement().removeElement(new int[]{3, 2, 2, 3}, 3);
        System.out.println(i);
    }
}
