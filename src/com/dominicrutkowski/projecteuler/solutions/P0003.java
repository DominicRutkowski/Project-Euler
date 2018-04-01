/*
 * Project Euler Solutions
 * Copyright (c) 2018 Dominic Rutkowski
 *
 * LICENSE:
 * https://github.com/DominicRutkowski/Project-Euler/blob/master/LICENSE
 *
 * PROBLEM:
 * https://projecteuler.net/problem=3
 */

package com.dominicrutkowski.projecteuler.solutions;

import com.dominicrutkowski.projecteuler.Solution;

import java.util.ArrayList;

public class P0003 extends Solution {

    private static final long N = 600851475143L;

    @Override
    public String run() {
        ArrayList<Long> factors = primeFactorization(N);
        int length = factors.size();
        long maxPrimeFactor = Math.max(factors.get(length - 1), factors.get(length - 2));
        return Long.toString(maxPrimeFactor);
    }

    private ArrayList<Long> primeFactorization(long number) {
        ArrayList<Long> factors = new ArrayList<>();
        while ((number & 1) == 0) {
            factors.add(2L);
            number /= 2;
        }
        for (long i = 3; i <= Math.sqrt(number); i += 2) {
            while (number % i == 0) {
                factors.add(i);
                number /= i;
            }
        }
        if (number > 1) {
            factors.add(number);
        }
        return factors;
    }

}
