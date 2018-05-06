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
    private long nanoTime;

    public abstract String run();

    public String getAnswer() {
        System.out.println("Problem: " + this.getClass().getSimpleName().substring(1));
        System.out.println("Answer: " + answer);
        final long seconds = (nanoTime / 1000000000);
        final long milliseconds = (nanoTime / 1000000) - (seconds * 1000);
        final long microseconds = (nanoTime / 1000) - (seconds * 1000000) - (milliseconds * 1000);
        final long nanoseconds = nanoTime - (seconds * 1000000000) - (milliseconds * 1000000) - (microseconds * 1000);
        System.out.println("Time: " + seconds + "s " + milliseconds + "ms " + microseconds + "μs " + nanoseconds + "ns");
        if (nanoTime > 60000000000L) {
            System.out.println("WARNING: Calculation time exceeds one minute.");
        }
        System.out.println();
        return answer;
    }

    public Solution() {
        final long startTime = System.nanoTime();
        answer = run();
        nanoTime = System.nanoTime() - startTime;
    }

}
