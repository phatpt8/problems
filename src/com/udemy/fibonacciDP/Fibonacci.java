package com.udemy.fibonacciDP;

import java.util.Map;

public class Fibonacci {

    private Map<Integer, Integer> memo;

    public int fibonacciDP(int n) {
        if (memo.containsKey(n)) return memo.get(n);

        memo.put(n - 1, fibonacciDP(n - 1));
        memo.put(n - 2, fibonacciDP(n - 2));

        int result = memo.get(n - 1) + memo.get(n - 2);
        memo.put(n, result);
        return result;
    }
    // exponential running time
    public int naiveFibonacci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;

        return naiveFibonacci(n - 1) + naiveFibonacci(n - 2);
    }
}

