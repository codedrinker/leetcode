package com.github.codedrinker.leetcode.string;

import java.util.Arrays;

/**
 * Created by codedrinker on 2019/3/2.
 *
 * @link {https://leetcode.com/problems/reorganize-string/}
 * <p>
 * 思路
 * 把所有的字母相同的合并并排序，如果有出现最大数量大于(n+1)/2 那么直接返回错误，如果不出现跳跃数量排序
 */
public class ReorganizeString {
    public static void main(String[] args) {
        System.out.println(new ReorganizeString().reorganizeString("ababababb"));
    }

    public String reorganizeString(String s) {
        char[] chars = s.toCharArray();
        int[] counts = new int[26];
        for (char c : chars) {
            // 以 100 为基数累计出现的次数以便排序
            counts[c - 'a'] += 100;
        }
        for (int i = 0; i < counts.length; i++) {
            // 每一个数加一个当前的位数，下文可以回推回字母
            counts[i] += i;
        }
        Arrays.sort(counts);
        // 因为默认排序为正序，所以要从下标1开始填入
        int index = 1;
        char[] ans = new char[chars.length];
        for (int i = 0; i < counts.length; i++) {
            int count = counts[i] / 100;
            if (count > (1 + chars.length) / 2) return "";
            char c = (char) (counts[i] % 100 + 'a');
            for (int j = 0; j < count; j++) {
                if (index >= chars.length) index = 0;
                ans[index] = c;
                index += 2;
            }
        }
        return new String(ans);
    }
}
