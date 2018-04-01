/*
 * Project Euler Solutions
 * Copyright (c) 2018 Dominic Rutkowski
 *
 * LICENSE:
 * https://github.com/DominicRutkowski/Project-Euler/blob/master/LICENSE
 *
 * PROBLEM:
 * https://projecteuler.net/problem=5
 */

package com.dominicrutkowski.projecteuler.solutions;

import com.dominicrutkowski.projecteuler.Solution;

public class P0005 extends Solution {

    private static final int MIN = 1;
    private static final int MAX = 20;

    @Override
    public String run() {
        outer:
        for (int number = 1; number > 0; number++) {
            for (int divisor = MIN; divisor <= MAX; divisor++) {
                if (number % divisor != 0) {
                    continue outer;
                }
            }
            return Integer.toString(number);
        }
        return null;
    }

}
