/*
 * Project Euler Solutions
 * Copyright (c) 2018 Dominic Rutkowski
 *
 * LICENSE:
 * https://github.com/DominicRutkowski/Project-Euler/blob/master/LICENSE
 *
 * PROBLEM:
 * https://projecteuler.net/problem=12
 */

package com.dominicrutkowski.projecteuler.solutions;

import com.dominicrutkowski.projecteuler.Solution;

public class P0012 extends Solution {

    @Override
    public String run() {
        int number = 1;
        int difference = 2;
        while (noOfDivisors(number) <= 500) {
            number += difference;
            difference++;
        }
        return Integer.toString(number);
    }

    private int noOfDivisors(int n) {
        int count = 0;
        for (int i = 1; Math.pow(i, 2) <= n; i++) {
            if (n % i == 0) {
                count += 2;
            }
        }
        if (Math.pow((int) Math.sqrt(n), 2) == n) {
            count--;
        }
        return count;
    }

}
