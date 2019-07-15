package com.github.codedrinker.basic;

import java.util.Scanner;

/**
 * Created by codedrinker on 2019/7/7.
 */
public class TestScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            //利用nextXXX()方法输出内容
            String str = sc.next();
            System.out.println(str);
        }
    }
}
