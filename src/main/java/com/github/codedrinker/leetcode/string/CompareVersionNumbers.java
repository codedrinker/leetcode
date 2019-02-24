package com.github.codedrinker.leetcode.string;

/**
 * Created by codedrinker on 2019/2/24.
 */
public class CompareVersionNumbers {
    public int compareVersion(String version1, String version2) {
        int max = Math.max(version1.length(), version2.length());
        String[] versions1 = version1.split("[.]");
        String[] versions2 = version2.split("[.]");
        for (int i = 0; i < max; i++) {
            Integer v1 = i >= versions1.length ? 0 : Integer.parseInt(versions1[i]);
            Integer v2 = i >= versions2.length ? 0 : Integer.parseInt(versions2[i]);
            int compare = v1.compareTo(v2);
            if (compare != 0) {
                return compare;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int compare = new CompareVersionNumbers().compareVersion("1.2.3", "1.2.03");
        System.out.println(compare);
    }
}
