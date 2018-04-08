/*
 * Project Euler Solutions
 * Copyright (c) 2018 Dominic Rutkowski
 *
 * LICENSE:
 * https://github.com/DominicRutkowski/Project-Euler/blob/master/LICENSE
 */

package com.dominicrutkowski.projecteuler;

public abstract class Solution {

    private String answer;
    private long time;

    public abstract String run();

    public String getAnswer() {
        System.out.println("Problem: " + this.getClass().getSimpleName().substring(1));
        System.out.println("Answer: " + answer);
        System.out.println("Time: " + time + " nanoseconds");
        if (time > 60000000000L) {
            System.out.println("WARNING: Calculation time exceeds one minute.");
        }
        System.out.println();
        return answer;
    }

    public Solution() {
        final long startTime = System.nanoTime();
        answer = run();
        final long stopTime = System.nanoTime();
        time = stopTime - startTime;
    }

}
