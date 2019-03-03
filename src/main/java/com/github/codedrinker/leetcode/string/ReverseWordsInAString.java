package com.github.codedrinker.leetcode.string;

/**
 * {https://leetcode.com/problems/reverse-words-in-a-string/}
 * Created by codedrinker on 2019/2/25.
 */
public class ReverseWordsInAString {
    public String reverseWords(String str) {
        StringBuffer sb = new StringBuffer();
        String[] split = str.split(" ");
        for (int i = split.length - 1; i >= 0; i--) {
            if (!"".equals(split[i])) {
                sb.append(split[i]);
                if (i != 0) {
                    sb.append(" ");
                }
            }
        }
        return sb.toString().trim();
    }

    public static void main(String[] args) {
        System.out.println(new ReverseWordsInAString().reverseWords(" 1"));
    }
}
