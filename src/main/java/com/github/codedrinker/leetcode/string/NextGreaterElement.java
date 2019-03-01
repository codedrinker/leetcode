package com.github.codedrinker.leetcode.string;

/**
 * Created by codedrinker on 2019/3/1.
 */
public class NextGreaterElement {

    public int nextGreaterElement(int n) {
        int m = n;
        int ans = 0;
        while (n > 0) {
            int j = n % 10;
            if (ans > 147483647 && j >= 2) {
                return -1;
            }
            ans = ans * 10 + j;
            n = n / 10;
        }

        System.out.println(ans);
        if (ans > m) {
            return ans;
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(Integer.MAX_VALUE);
        System.out.println(new NextGreaterElement().nextGreaterElement(199));
        System.out.println(new NextGreaterElement().nextGreaterElement(2147483647));
    }
}
