/*
 * Project Euler Solutions
 * Copyright (c) 2018 Dominic Rutkowski
 *
 * LICENSE:
 * https://github.com/DominicRutkowski/Project-Euler/blob/master/LICENSE
 *
 * PROBLEM:
 * https://projecteuler.net/problem=48
 */

package com.dominicrutkowski.projecteuler.solutions;

import com.dominicrutkowski.projecteuler.Solution;

public class P0048 extends Solution {

    private static final int MAX = 1000;

    @Override
    public String run() {
        long total = 0;
        for (int i = 1; i <= MAX; i++) {
            total += modPow(i, i, (long) Math.pow(10, 10));
        }
        return Long.toString(total % (long) Math.pow(10, 10));
    }

    private long modPow(int base, int power, long mod) {
        long total = 1;
        for (int i = 0; i < power; i++) {
            total *= base;
            total %= mod;
        }
        return total;
    }

}
