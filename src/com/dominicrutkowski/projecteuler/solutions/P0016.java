/*
 * Project Euler Solutions
 * Copyright (c) 2018 Dominic Rutkowski
 *
 * LICENSE:
 * https://github.com/DominicRutkowski/Project-Euler/blob/master/LICENSE
 *
 * PROBLEM:
 * https://projecteuler.net/problem=16
 */

package com.dominicrutkowski.projecteuler.solutions;

import com.dominicrutkowski.projecteuler.Solution;

import java.math.BigInteger;

public class P0016 extends Solution {

    private static final int EXPONENT = 1000;

    @Override
    public String run() {
        int sum = 0;
        String number = BigInteger.TWO.pow(EXPONENT).toString();
        for (int i = 0; i < number.length(); i++) {
            sum += Integer.parseInt(number.substring(i, i + 1));
        }
        return Integer.toString(sum);
    }

}
