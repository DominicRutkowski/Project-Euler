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

    public abstract String run();

    public String getAnswer() {
        System.out.println("Problem: " + this.getClass().getSimpleName().substring(1));
        System.out.println("Answer: " + answer + "\n");
        return answer;
    }

    public Solution() {
        answer = run();
    }

}
