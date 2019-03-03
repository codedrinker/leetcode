package com.github.codedrinker.leetcode.string;

import java.util.ArrayList;
import java.util.List;

/**
 * {https://leetcode.com/problems/letter-combinations-of-a-phone-number/}
 * Created by codedrinker on 2019/2/22.
 * 未完成，思路阻塞，回来再看
 */
public class LetterCombinationsOfAPhoneNumber {
    public List<String> letterCombinations(String digits) {
        char[] chars = digits.toCharArray();
        char[][] result = new char[(int) Math.pow(3, chars.length)][chars.length];
        for (int i = 0; i < chars.length; i++) {
            int j = (int) Math.pow(3, chars.length) / 3;
            for (int m = 0; m < j; m++) {
                result[m][i] = (char) ((Character.digit(chars[i], 10) - 2) * 3 + 97);
                result[m + j][i] = (char) ((Character.digit(chars[i], 10) - 2) * 3 + 97 + 1);
                result[m + 2 * j][i] = (char) ((Character.digit(chars[i], 10) - 2) * 3 + 97 + 2);
            }
        }
        List<String> letterCombinations = new ArrayList<>();
        for (int i = 0; i < result.length; i++) {
            letterCombinations.add(new String(result[i]));
        }
        return letterCombinations;
    }

    public static void main(String[] args) {
        List<String> letterCombinations = new LetterCombinationsOfAPhoneNumber().letterCombinations("23");
        System.out.println(letterCombinations);
    }
}
