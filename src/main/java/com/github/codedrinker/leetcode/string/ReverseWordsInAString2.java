package com.github.codedrinker.leetcode.string;

/**
 * Created by codedrinker on 2019/6/29.
 */
public class ReverseWordsInAString2 {
    public String reverseWords(String s) {
        String words[] = s.split(" ");
        StringBuilder res = new StringBuilder();
        for (String word : words)
            res.append(new StringBuffer(word).reverse().toString() + " ");
        return res.toString().trim();
    }
}
