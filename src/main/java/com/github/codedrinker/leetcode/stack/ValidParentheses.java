package com.github.codedrinker.leetcode.stack;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * Created by codedrinker on 2019/5/20.
 */
public class ValidParentheses {
    public boolean isValid(String str) {
        if (str == "" || str == null) {
            return true;
        }

        Map<Character, Character> parentheses = new HashMap<>();
        parentheses.put(')', '(');
        parentheses.put(']', '[');
        parentheses.put('}', '{');

        Stack<Character> chars = new Stack<>();
        for (char c : str.toCharArray()) {

            if (parentheses.containsKey(c)) {
                if (chars.isEmpty() || !parentheses.get(c).equals(chars.pop())) {
                    return false;
                }
            } else {
                chars.push(c);
            }
        }
        return chars.isEmpty();
    }
}
