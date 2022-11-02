package com.devstromo.grid_traveler;

import java.util.HashMap;
import java.util.Map;

public class GridTraveler {
    public long solve(long m, long n) {
        return solve(m, n, new HashMap<>());
    }

    private long solve(long m, long n, Map<String, Long> memo) {
        final String key = m + "," + n;
        if (memo.containsKey(key)) {
            return memo.get(key);
        }
        if (m == 1 && n == 1) {
            return 1;
        }
        if (m == 0 || n == 0) {
            return 0;
        }
        memo.put(key, solve(m - 1, n, memo) + solve(m, n - 1, memo));
        return memo.get(key);
    }
}
