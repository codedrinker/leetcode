package com.github.codedrinker.leetcode.string;

/**
 * {https://leetcode.com/problems/delete-operation-for-two-strings/}
 * Created by codedrinker on 2019/3/1.
 */
public class DeleteOperationForTwoStrings {
    public int minDistance(String word1, String word2) {
        if (word1.equals(word2))
            return 0;
        return 1;
    }

    public static void main(String[] args) {
        new DeleteOperationForTwoStrings().minDistance("2", "3d");
    }
}
