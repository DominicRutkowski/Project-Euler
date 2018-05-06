/*
 * Project Euler Solutions
 * Copyright (c) 2018 Dominic Rutkowski
 *
 * LICENSE:
 * https://github.com/DominicRutkowski/Project-Euler/blob/master/LICENSE
 *
 * PROBLEM:
 * https://projecteuler.net/problem=14
 */

package com.dominicrutkowski.projecteuler.solutions;

import com.dominicrutkowski.projecteuler.Solution;

public class P0014 extends Solution {

    private static final int MAX = 1000000;
    private static int[] terms = new int[MAX];

    @Override
    public String run() {
        terms[1] = 1;
        int max = 1;
        int maxTerms = 1;
        for (int i = 2; i < MAX; i++) {
            int terms = numberOfTerms(i, 0);
            P0014.terms[i] = terms;
            if (terms > maxTerms) {
                maxTerms = terms;
                max = i;
            }
        }
        return Integer.toString(max);
    }

    private int numberOfTerms(long n, int tailCount) {
        if (n < P0014.terms.length && terms[(int) n] != 0) {
            return terms[(int) n] + tailCount;
        } else if ((n & 1) == 0) {
            return numberOfTerms(n >> 1, tailCount + 1);
        } else {
            return numberOfTerms(3 * n + 1, tailCount + 1);
        }
    }

}
