package com.dominicrutkowski.projecteuler.solutions;

import com.dominicrutkowski.projecteuler.Solution;

public class P0179 extends Solution {

    private static final int MAX = 10000000;

    @Override
    public String run() {
        long nDivisors;
        long nIncrementDivisors;
        return null;
    }

    private long noOfDivisors(int n) {
        long count = 0;
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
