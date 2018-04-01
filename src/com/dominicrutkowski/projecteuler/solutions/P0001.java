/*
 * Project Euler Solutions
 * Copyright (c) 2018 Dominic Rutkowski
 *
 * LICENSE:
 * https://github.com/DominicRutkowski/Project-Euler/blob/master/LICENSE
 */

package com.dominicrutkowski.projecteuler.solutions;

import com.dominicrutkowski.projecteuler.Solution;

public class P0001 extends Solution {

    @Override
    public String run() {
        int sum = 0;
        for (int i = 3; i < 1000; i++) {
            sum += i % 3 == 0 || i % 5 == 0 ? i : 0;
        }
        return Integer.toString(sum);
    }

}
