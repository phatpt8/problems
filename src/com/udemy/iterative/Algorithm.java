package com.udemy.iterative;

public class Algorithm {

    public int sumInteractive(int n) {

        int result = 0;

        for (int i = 0; i <= n; ++i)
            result = result + i;

        return result;
    }

    public int sumRecursive(int n) {

        if (n == 1) return  1;

        return n + sumRecursive(n - 1);
    }

    public int factorial(int n) {
        return calc(1, n);
    }

    private int calc(int accumulator, int n) {
        if (n == 1) return accumulator;

        return calc(accumulator*n, n - 1);
    }
}
