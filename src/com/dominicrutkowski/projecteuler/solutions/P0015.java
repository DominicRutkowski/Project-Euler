/*
 * Project Euler Solutions
 * Copyright (c) 2018 Dominic Rutkowski
 *
 * LICENSE:
 * https://github.com/DominicRutkowski/Project-Euler/blob/master/LICENSE
 *
 * PROBLEM:
 * https://projecteuler.net/problem=15
 */

package com.dominicrutkowski.projecteuler.solutions;

import com.dominicrutkowski.projecteuler.Solution;

import java.math.BigInteger;

public class P0015 extends Solution {

    private static final int M = 20;
    private static final int N = 20;

    @Override
    public String run() {
        return combination(M + N, M).toString();
    }

    private BigInteger factorial(int n) {
        BigInteger total = BigInteger.ONE;
        for (int i = 1; i <= n; i++) {
            total = total.multiply(BigInteger.valueOf(i));
        }
        return total;
    }

    private BigInteger combination(int n, int r) {
        return factorial(n).divide(factorial(r).multiply(factorial(n - r)));
    }

}
