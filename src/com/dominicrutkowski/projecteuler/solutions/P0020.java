/*
 * Project Euler Solutions
 * Copyright (c) 2018 Dominic Rutkowski
 *
 * LICENSE:
 * https://github.com/DominicRutkowski/Project-Euler/blob/master/LICENSE
 *
 * PROBLEM:
 * https://projecteuler.net/problem=20
 */

package com.dominicrutkowski.projecteuler.solutions;

import com.dominicrutkowski.projecteuler.Solution;

import java.math.BigInteger;

public class P0020 extends Solution {

    private static final int N = 100;

    @Override
    public String run() {
        String total = factorial(100).toString();
        int sum = 0;
        for (int i = 0; i < total.length(); i++) {
            sum += Integer.parseInt(total.substring(i, i + 1));
        }
        return Integer.toString(sum);
    }

    private BigInteger factorial(int n) {
        BigInteger total = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            total = total.multiply(BigInteger.valueOf(i));
        }
        return total;
    }

}
