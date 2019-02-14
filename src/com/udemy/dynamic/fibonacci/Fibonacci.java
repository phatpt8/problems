package com.udemy.dynamic.fibonacci;

import java.util.HashMap;
import java.util.Map;

public class Fibonacci {
    private Map<Integer, Integer> memo;

    public Fibonacci() {
        this.memo = new HashMap<>();
        this.memo.put(0, 0);
        this.memo.put(1, 1);
    }

    public int solve(int n) {
        if (memo.containsKey(n)) return memo.get(n);

        memo.put(n - 1, solve(n - 1));
        memo.put(n - 2, solve(n - 2));
        int result = memo.get(n - 1) + memo.get(n - 2);
        memo.put(n, result);

        return result;
    }
}

