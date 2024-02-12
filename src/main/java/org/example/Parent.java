package org.example;

import java.util.List;

public abstract class Parent {
    /**
     *
     *
     * an = 1 + (-1)n+1   / n
     */
    static double seq(int n) {
        return (1 + Math.pow(-1, n+1)) / n;
    }

    public static void main(String[] args) {
        for (int i = 1; i < 11; i++) {
            System.out.print(seq(i) + ", ");
        }
    }
}