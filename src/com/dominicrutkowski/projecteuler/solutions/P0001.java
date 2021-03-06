/*
 * Project Euler Solutions
 * Copyright (c) 2018 Dominic Rutkowski
 *
 * LICENSE:
 * https://github.com/DominicRutkowski/Project-Euler/blob/master/LICENSE
 *
 * PROBLEM:
 * https://projecteuler.net/problem=1
 */

package com.dominicrutkowski.projecteuler.solutions;

import com.dominicrutkowski.projecteuler.Solution;

public class P0001 extends Solution {

    private static final int MAX = 1000;

    @Override
    public String run() {
        int sum = 0;
        for (int i = 3; i < MAX; i++) {
            sum += i % 3 == 0 || i % 5 == 0 ? i : 0;
        }
        return Integer.toString(sum);
    }

}
