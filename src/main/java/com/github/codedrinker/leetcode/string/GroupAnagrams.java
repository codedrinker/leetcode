package com.github.codedrinker.leetcode.string;

import java.util.*;

/**
 * {https://leetcode.com/problems/group-anagrams/}
 * Created by codedrinker on 2019/2/24.
 * 根据条件计算，虽然能够实现，但是时间复杂度太高了
 */
public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] args) {
        List<List<String>> anagrams = new ArrayList<>();
        Set<String> indexes = new HashSet<>();
        for (int i = 0; i < args.length; i++) {
            if (indexes.contains(args[i])) continue;
            List<String> e = new ArrayList<>();
            e.add(args[i]);
            for (int j = i + 1; j < args.length; j++) {
                if (j >= args.length) continue;
                boolean isAnagrams = isAnagrams(args[i], args[j]);
                if (isAnagrams) {
                    indexes.add(args[j]);
                    e.add(args[j]);
                }
            }
            anagrams.add(e);
        }
        return anagrams;
    }

    boolean isAnagrams(String left, String right) {
        char[] leftChars = left.toCharArray();
        Arrays.sort(leftChars);
        char[] rightChars = right.toCharArray();
        Arrays.sort(rightChars);
        return Arrays.equals(leftChars, rightChars);
    }

    public static void main(String[] args) {
        List<List<String>> anagrams = new GroupAnagrams().groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"});
        System.out.println(anagrams);
    }

}
