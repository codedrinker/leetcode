package com.github.codedrinker.sort;

import java.util.Arrays;

/**
 * Created by codedrinker on 2019/2/16.
 */
public class BubbleSort {
    public int[] sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] > arr[j - 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = tmp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort();
        int[] arr = {1, 3, 5, 2, 43, 6, 8, 42};
        System.out.println(Arrays.toString(bubbleSort.sort(arr)));
    }
}
