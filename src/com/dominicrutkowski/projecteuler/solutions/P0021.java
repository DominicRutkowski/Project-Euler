/*
 * Project Euler Solutions
 * Copyright (c) 2018 Dominic Rutkowski
 *
 * LICENSE:
 * https://github.com/DominicRutkowski/Project-Euler/blob/master/LICENSE
 *
 * PROBLEM:
 * https://projecteuler.net/problem=21
 */

package com.dominicrutkowski.projecteuler.solutions;

import com.dominicrutkowski.projecteuler.Solution;

public class P0021 extends Solution {

    private static final int MAX = 10000;

    @Override
    public String run() {
        int sum = 0;
        for (int a = 1; a < MAX; a++) {
            int b = d(a);
            if (a == d(b) && a != b) {
                sum += a;
            }
        }
        return Integer.toString(sum);
    }

    private int d(int n) {
        int sum = 0;
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum;
    }

}
