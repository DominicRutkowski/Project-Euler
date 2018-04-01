/*
 * Project Euler Solutions
 * Copyright (c) 2018 Dominic Rutkowski
 *
 * LICENSE:
 * https://github.com/DominicRutkowski/Project-Euler/blob/master/LICENSE
 *
 * PROBLEM:
 * https://projecteuler.net/problem=4
 */

package com.dominicrutkowski.projecteuler.solutions;

import com.dominicrutkowski.projecteuler.Solution;

public class P0004 extends Solution {

    private static final int MAX_DIGITS = 3;

    @Override
    public String run() {
        int max = Integer.MIN_VALUE;
        for (int i = 999; i >= 100; i--) {
            for (int j = i; j >= 100; j--) {
                if (i * j > max && isPalindromic(i * j)) {
                    max = i * j;
                }
            }
        }
        return Integer.toString(max);
    }

    private boolean isPalindromic(int n) {
        String number = Integer.toString(n);
        for (int i = 0; i < number.length() / 2; i++) {
            if (number.charAt(i) != number.charAt(number.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

}
