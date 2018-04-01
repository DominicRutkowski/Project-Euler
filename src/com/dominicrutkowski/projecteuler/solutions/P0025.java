/*
 * Project Euler Solutions
 * Copyright (c) 2018 Dominic Rutkowski
 *
 * LICENSE:
 * https://github.com/DominicRutkowski/Project-Euler/blob/master/LICENSE
 *
 * PROBLEM:
 * https://projecteuler.net/problem=25
 */

package com.dominicrutkowski.projecteuler.solutions;

import com.dominicrutkowski.projecteuler.Solution;

import java.math.BigInteger;
import java.util.ArrayList;

public class P0025 extends Solution {

    private static final int DIGITS = 1000;

    @Override
    public String run() {
        ArrayList<BigInteger> fibonacciNumbers = new ArrayList<>();
        fibonacciNumbers.add(BigInteger.ONE);
        fibonacciNumbers.add(BigInteger.ONE);
        int index = 1;
        while (fibonacciNumbers.get(index).toString().length() < DIGITS) {
            fibonacciNumbers.add(fibonacciNumbers.get(index).add(fibonacciNumbers.get(index - 1)));
            index++;
        }
        return Integer.toString(index + 1);
    }

}
