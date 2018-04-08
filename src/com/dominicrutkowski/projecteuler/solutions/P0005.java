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

    private static final int MAX = 20;

    @Override
    public String run() {
        outer:
        for (int number = MAX;; number += MAX) {
            for (int divisor = 1; divisor < MAX; divisor++) {
                if (number % divisor != 0) {
                    continue outer;
                }
            }
            return Integer.toString(number);
        }
    }

}
