package com.devstromo.tabulation.fib;

public class Fibonacci {
    public long solve(int n) {
        var table = new long[n + 2];
        table[1] = 1;
        for (var i = 0; i < n ; i++) {
            table[i + 1] += table[i];
            table[i + 2] += table[i];
        }
        return table[n];
    }
}
