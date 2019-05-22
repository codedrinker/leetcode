package com.github.codedrinker.leetcode.array;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by codedrinker on 2019/5/22.
 */
public class PascalsTriangle {
    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> triangle = new ArrayList<>();

        if (numRows == 0) {
            return triangle;
        }

        triangle.add(new ArrayList<>());
        triangle.get(0).add(1);

        for (int row = 1; row < numRows; row++) {
            List<Integer> rows = new ArrayList<>();
            rows.add(1);

            List<Integer> preRows = triangle.get(row - 1);
            for (int i = 1; i < row; i++) {
                rows.add(preRows.get(i - 1) + preRows.get(i));
            }
            rows.add(1);
            triangle.add(rows);
        }
        return triangle;
    }
}
