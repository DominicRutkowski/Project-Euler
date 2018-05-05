/*
 * Project Euler Solutions
 * Copyright (c) 2018 Dominic Rutkowski
 *
 * LICENSE:
 * https://github.com/DominicRutkowski/Project-Euler/blob/master/LICENSE
 *
 * PROBLEM:
 * https://projecteuler.net/problem=18
 */

package com.dominicrutkowski.projecteuler.solutions;

import com.dominicrutkowski.projecteuler.Solution;

public class P0018 extends Solution {

    private static final int[][] TRIANGLE = {
        {75},
        {95,64},
        {17,47,82},
        {18,35,87,10},
        {20, 4,82,47,65},
        {19, 1,23,75, 3,34},
        {88, 2,77,73, 7,63,67},
        {99,65, 4,28, 6,16,70,92},
        {41,41,26,56,83,40,80,70,33},
        {41,48,72,33,47,32,37,16,94,29},
        {53,71,44,65,25,43,91,52,97,51,14},
        {70,11,33,28,77,73,17,78,39,68,17,57},
        {91,71,52,38,17,14,91,43,58,50,27,29,48},
        {63,66, 4,68,89,53,67,30,73,16,69,87,40,31},
        { 4,62,98,27,23, 9,70,98,73,93,38,53,60, 4,23}
    };

    @Override
    public String run() {
        int row = TRIANGLE.length - 1;
        int[] maximizedRow = TRIANGLE[row].clone();
        while (row >= 1) {
            for (int i = 0; i < row; i++) {
                maximizedRow[i] = Math.max(maximizedRow[i], maximizedRow[i + 1]) + TRIANGLE[row - 1][i];
            }
            row--;
        }
        return Integer.toString(maximizedRow[0]);
    }

}
