/*
 * Project Euler Solutions
 * Copyright (c) 2018 Dominic Rutkowski
 *
 * LICENSE:
 * https://github.com/DominicRutkowski/Project-Euler/blob/master/LICENSE
 *
 * PROBLEM:
 * https://projecteuler.net/problem=179
 */

package com.dominicrutkowski.projecteuler.solutions;

import com.dominicrutkowski.projecteuler.Solution;

import java.util.HashMap;

public class P0179 extends Solution {

    private static final int MAX = 10000000;

    @Override
    public String run() {
        int satisfyCondition = 0;
        long firstNumberDivisors;
        long secondNumberDivisors = 2;
        for (int i = 2; i < MAX; i++) {
            firstNumberDivisors = secondNumberDivisors;
            secondNumberDivisors = noOfDivisors(i + 1);
            if (firstNumberDivisors == secondNumberDivisors) {
                satisfyCondition++;
            }
        }
        return Integer.toString(satisfyCondition);
    }

    private long noOfDivisors(int n) {
//        long count = 0;
//        for (int i = 1; Math.pow(i, 2) <= n; i++) {
//            if (n % i == 0) {
//                count += 2;
//            }
//        }
//        if (Math.pow((int) Math.sqrt(n), 2) == n) {
//            count--;
//        }
//        return count;
        HashMap<Integer, Integer> primeFactorization = new HashMap<>();
        while (n != 1) {
            for (int i = 2;; i++) {
                if (n % i == 0) {
                    n %= i;
                    if (primeFactorization.containsKey(i)) {
                        primeFactorization.put(i, primeFactorization.get(i + 1));
                    } else {
                        primeFactorization.put(i, 1);
                    }
                    break;
                }
            }
        }
        int factors = 1;
        for (int exponent : primeFactorization.values()) {
            factors *= exponent + 1;
        }
        return factors;
    }

}
