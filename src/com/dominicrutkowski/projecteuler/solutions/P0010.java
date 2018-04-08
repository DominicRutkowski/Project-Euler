/*
 * Project Euler Solutions
 * Copyright (c) 2018 Dominic Rutkowski
 *
 * LICENSE:
 * https://github.com/DominicRutkowski/Project-Euler/blob/master/LICENSE
 *
 * PROBLEM:
 * https://projecteuler.net/problem=10
 */

package com.dominicrutkowski.projecteuler.solutions;

import com.dominicrutkowski.projecteuler.Solution;

import java.util.ArrayList;

public class P0010 extends Solution {

    private static final int MAX = 1999999;

    @Override
    public String run() {
        ArrayList<Integer> primes = sieveOfEratosthenes(MAX);
        long sum = 0;
        for (int prime : primes) {
            sum += prime;
        }
        return Long.toString(sum);
    }

    private ArrayList<Integer> sieveOfEratosthenes(int max) {
        boolean[] composites = new boolean[max + 1];
        for (int i = 2; Math.pow(i, 2) <= max; i++) {
            if (!composites[i]) {
                for (int j = i; i * j <= max; j++) {
                    composites[i * j] = true;
                }
            }
        }
        ArrayList<Integer> primes = new ArrayList<>();
        for (int i = 2; i <= max; i++) {
            if (!composites[i]) {
                primes.add(i);
            }
        }
        return primes;
    }

}
