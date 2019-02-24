package com.github.codedrinker.leetcode.string;

import java.util.*;

/**
 * Created by codedrinker on 2019/2/24.
 * 时间复杂度
 * O(NKlogK),
 * T 是 strs 的长度
 * K 是 str 的长度
 * O(N) 是迭代每一个 string
 * 空间复杂度 O(NK)
 */
public class GroupAnagramsOptimized {
    public List<List<String>> groupAnagrams(String[] args) {
        if (args.length == 0) return new ArrayList<>();
        Map<String, List<String>> ans = new HashMap();
        for (String arg : args) {
            char[] chars = arg.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
            if (ans.containsKey(key)) {
                ans.get(key).add(arg);
            } else {
                List<String> values = new ArrayList<>();
                values.add(arg);
                ans.put(key, values);
            }
        }
        return new ArrayList<>(ans.values());
    }

    public static void main(String[] args) {
        List<List<String>> anagrams = new GroupAnagramsOptimized().groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"});
        System.out.println(anagrams);
    }
}
