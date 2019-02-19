package com.github.codedrinker.leetcode.string;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by codedrinker on 2019/2/19.
 */

/**
 * 简单粗暴的穷举法
 * 2 * n 的数组每一位有两个选择，就是 2^2n
 * 同时每一次需要检验是否合法 2n
 * 所以时间复杂度 2^2n * 2n
 */
public class GenerateParentheses {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        char[] seq = new char[2 * n];
        int pos = 0;
        generate(seq, pos, result);
        return result;
    }

    private void generate(char[] seq, int pos, List<String> result) {
        if (pos == seq.length) {
            if (isValid(seq)) {
                result.add(new String(seq));
            }
        } else {
            seq[pos] = '(';
            generate(seq, pos + 1, result);
            seq[pos] = ')';
            generate(seq, pos + 1, result);
        }
    }

    private boolean isValid(char[] seq) {
        int balance = 0;
        for (char c : seq) {
            if (c == '(')
                balance++;
            else
                balance--;
            if (balance < 0) return false;
        }
        return balance == 0;
    }

    public static void main(String[] args) {
        System.out.println(new GenerateParentheses().generateParenthesis(3));
    }
}
