package com.devstromo.fibonacci;

import java.util.HashMap;
import java.util.Map;

public class FibonacciMemoization {

    public long fibonacci(long n) {
        return fibonacci(n, new HashMap<>());
    }

    private long fibonacci(long n, Map<Long, Long> memo) {
        if (memo.containsKey(n)) {
            return memo.get(n);
        }
        if (n <= 2)
            return 1;
        memo.put(n, fibonacci(n - 1, memo) + fibonacci(n - 2, memo));
        return memo.get(n);
    }
}
