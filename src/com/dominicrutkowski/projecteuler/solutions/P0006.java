/*
 * Project Euler Solutions
 * Copyright (c) 2018 Dominic Rutkowski
 *
 * LICENSE:
 * https://github.com/DominicRutkowski/Project-Euler/blob/master/LICENSE
 *
 * PROBLEM:
 * https://projecteuler.net/problem=6
 */

package com.dominicrutkowski.projecteuler.solutions;

import com.dominicrutkowski.projecteuler.Solution;

public class P0006 extends Solution {

    private static final int MAX = 100;

    @Override
    public String run() {
        int sumOfSquares = 0;
        for (int i = 1; i <= MAX; i++) {
            sumOfSquares += Math.pow(i, 2);
        }
        int squareOfSums = 0;
        for (int i = 1; i <= MAX; i++) {
            squareOfSums += i;
        }
        squareOfSums = (int) Math.pow(squareOfSums, 2);
        return Integer.toString(squareOfSums - sumOfSquares);
    }

}
