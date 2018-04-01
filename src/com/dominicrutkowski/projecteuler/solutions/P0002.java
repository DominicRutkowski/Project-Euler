/*
 * Project Euler Solutions
 * Copyright (c) 2018 Dominic Rutkowski
 *
 * LICENSE:
 * https://github.com/DominicRutkowski/Project-Euler/blob/master/LICENSE
 *
 * PROBLEM:
 * https://projecteuler.net/problem=2
 */

package com.dominicrutkowski.projecteuler.solutions;

import com.dominicrutkowski.projecteuler.Solution;

import java.util.ArrayList;

public class P0002 extends Solution {

    private static final int MAX = 4000000;

    @Override
    public String run() {
        ArrayList<Integer> fibonacciNumbers = new ArrayList<>();
        fibonacciNumbers.add(1);
        fibonacciNumbers.add(2);
        int evenSum = 2;
        int next = 3;
        while (next <= P0002.MAX) {
            fibonacciNumbers.add(next);
            if ((next & 1) == 0) {
                evenSum += next;
            }
            next = fibonacciNumbers.get(fibonacciNumbers.size() - 2) + fibonacciNumbers.get(fibonacciNumbers.size() - 1);
        }
        return Integer.toString(evenSum);
    }

}
