/*
 * Project Euler Solutions
 * Copyright (c) 2018 Dominic Rutkowski
 *
 * LICENSE:
 * https://github.com/DominicRutkowski/Project-Euler/blob/master/LICENSE
 *
 * PROBLEM:
 * https://projecteuler.net/problem=112
 */

package com.dominicrutkowski.projecteuler.solutions;

import com.dominicrutkowski.projecteuler.Solution;

public class P0112 extends Solution {

    @Override
    public String run() {
        int bouncy = 0;
        int total = 0;
        int number = 0;
        do {
            total++;
            number++;
            if (isBouncy(number)) {
                bouncy++;
            }
        } while ((double) bouncy / total != 0.99);
        return Integer.toString(total);
    }

    private boolean isBouncy(int n) {
        return !isIncreasing(n) && !isDecreasing(n);
    }

    private boolean isIncreasing(int n) {
        String number = Integer.toString(n);
        for (int i = 0; i < number.length() - 1; i++) {
            int first = Integer.parseInt(number.substring(i, i + 1));
            int second = Integer.parseInt(number.substring(i + 1, i + 2));
            if (first > second) {
                return false;
            }
        }
        return true;
    }

    private boolean isDecreasing(int n) {
        String number = Integer.toString(n);
        for (int i = 0; i < number.length() - 1; i++) {
            int first = Integer.parseInt(number.substring(i, i + 1));
            int second = Integer.parseInt(number.substring(i + 1, i + 2));
            if (first < second) {
                return false;
            }
        }
        return true;
    }

}
