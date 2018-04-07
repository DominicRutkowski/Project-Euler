/*
 * Project Euler Solutions
 * Copyright (c) 2018 Dominic Rutkowski
 *
 * LICENSE:
 * https://github.com/DominicRutkowski/Project-Euler/blob/master/LICENSE
 *
 * PROBLEM:
 * https://projecteuler.net/problem=7
 */

package com.dominicrutkowski.projecteuler.solutions;

import com.dominicrutkowski.projecteuler.Solution;

import java.util.ArrayList;

public class P0007 extends Solution {

    private static final int NUMBER_OF_PRIMES = 10001;

    @Override
    public String run() {
        ArrayList<Integer> primes = new ArrayList<>();
        primes.add(2);
        int prime = 3;
        while (primes.size() < NUMBER_OF_PRIMES) {
            if (isPrime(prime)) {
                primes.add(prime);
            }
            prime += 2;
        }
        return Integer.toString(primes.get(NUMBER_OF_PRIMES - 1));
    }

    private boolean isPrime(int n) {
        if ((n & 1) == 0) {
            return false;
        }
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

}
