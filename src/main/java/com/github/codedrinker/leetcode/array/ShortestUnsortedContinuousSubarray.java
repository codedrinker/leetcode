package com.github.codedrinker.leetcode.array;

/**
 * Created by codedrinker on 2019/7/16.
 */
public class ShortestUnsortedContinuousSubarray {
    public int findUnsortedSubarray(int[] nums) {
        int left = 0;
        int right = 0;
        outer:
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    left = i;
                    break outer;
                }
            }
        }
        outer:
        for (int i = nums.length - 1; i >= 0; i--) {
            for (int j = i - 1; j >= 0; j--) {
                if (i <= left || nums[i] < nums[j]) {
                    right = i;
                    break outer;
                }
            }
        }
        return right == 0 && left == 0 ? 0 : right - left + 1;
    }

    public static void main(String[] args) {
        int arr[] = new int[]{1, 2, 3, 4, 5};
        outer:
        for (int i = 0; i < arr.length; i++) {
            System.out.print("outer" + i + " ");
            inner:
            for (int i1 = 0; i1 < arr.length; i1++) {
                System.out.print("inner" + i1 + " ");
                if (i == 2 && i1 == 2) {
                    break outer;
                }
            }
            System.out.println();
        }
    }
}
