/*
 * Project Euler Solutions
 * Copyright (c) 2018 Dominic Rutkowski
 *
 * LICENSE:
 * https://github.com/DominicRutkowski/Project-Euler/blob/master/LICENSE
 *
 * PROBLEM:
 * https://projecteuler.net/problem=9
 */

package com.dominicrutkowski.projecteuler.solutions;

import com.dominicrutkowski.projecteuler.Solution;

public class P0009 extends Solution {

    private static final int SUM = 1000;

    @Override
    public String run() {
        outer:
        for (int a = 1; a <= SUM; a++) {
            for (int b = a; b <= SUM; b++) {
                int c = 1000 - a - b;
                if (c <= b) {
                    continue outer;
                }
                if (Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2)) {
                    return Integer.toString(a * b * c);
                }
            }
        }
        return null;
    }

}
