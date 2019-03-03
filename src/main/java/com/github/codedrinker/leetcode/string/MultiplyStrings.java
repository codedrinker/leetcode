package com.github.codedrinker.leetcode.string;

/**
 * {https://leetcode.com/problems/multiply-strings/}
 * Created by codedrinker on 2019/2/21.
 */
public class MultiplyStrings {
    public String multiply(String num1, String num2) {
        if (num1.equals("0") || num2.equals("0")) return "0";
        char[] numArr1 = num1.toCharArray();
        char[] numArr2 = num2.toCharArray();
        int[] result = new int[numArr1.length + numArr2.length];

        for (int i = numArr1.length - 1; i >= 0; i--) {
            for (int j = numArr2.length - 1; j >= 0; j--) {
                int sum = Character.digit(numArr1[i], 10) * Character.digit((int) numArr2[j], 10);
                int pos = i + j + 1;
                int cur = result[pos] + sum;
                result[pos] = cur % 10;
                if (cur / 10 > 0) {
                    result[pos - 1] += cur / 10;
                }
            }
        }

        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < result.length; i++) {
            if (i == 0 && result[i] == 0) {
                continue;
            }
            sb.append(String.valueOf(result[i]));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(new MultiplyStrings().multiply("123", "456"));
    }
}
