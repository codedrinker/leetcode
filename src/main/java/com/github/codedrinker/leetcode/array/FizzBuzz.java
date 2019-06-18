package com.github.codedrinker.leetcode.array;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by codedrinker on 2019/6/18.
 */
public class FizzBuzz {
    public List<String> fizzBuzz(int n) {
        List<String> fizzBuzz = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                fizzBuzz.add("FizzBuzz");
            } else if (i % 3 == 0) {
                fizzBuzz.add("Fizz");
            } else if (i % 5 == 0) {
                fizzBuzz.add("Buzz");
            } else {
                fizzBuzz.add(String.valueOf(i));
            }
        }
        return fizzBuzz;
    }
}
