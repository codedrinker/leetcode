package com.github.codedrinker.leetcode.math;

/**
 * https://leetcode.com/problems/add-binary/
 * Add Binary
 */
public class AddBinary {
    public String addBinary(String a, String b) {
        char[] as = new StringBuffer(a).reverse().toString().toCharArray();
        char[] bs = new StringBuffer(b).reverse().toString().toCharArray();
        int max = as.length > bs.length ? as.length : bs.length;
        StringBuffer ans = new StringBuffer();
        int cur = 0;
        for (int i = 0; i < max; i++) {
            int sum = 0;
            if (as.length > i) {
                sum += Integer.parseInt(String.valueOf(as[i]));
            }
            if (bs.length > i) {
                sum += Integer.parseInt(String.valueOf(bs[i]));
            }
            sum += cur;
            ans.append("" + sum % 2);
            cur = sum / 2;
        }
        if (cur != 0) {
            ans.append(cur);
        }
        return ans.reverse().toString();
    }

    public static void main(String[] args) {
        new AddBinary().addBinary("11", "1");
    }
}
