package com.github.codedrinker.leetcode.string.parentheses;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * Created by codedrinker on 2019/5/1.
 */
public class ValidParentheses {
    public boolean isValid(String str) {
        if (str == null || str == "") {
            return true;
        }

        Map<Character, Character> mappings = new HashMap();
        mappings.put(')', '(');
        mappings.put(']', '[');
        mappings.put('}', '{');

        Stack<Character> characters = new Stack<>();
        char[] chars = str.toCharArray();
        for (char c : chars) {
            if (mappings.containsKey(c)) {
                if (characters.isEmpty() || characters.pop() != mappings.get(c)) {
                    return false;
                }
            } else {
                characters.push(c);
            }
        }
        return characters.isEmpty();
    }
}
