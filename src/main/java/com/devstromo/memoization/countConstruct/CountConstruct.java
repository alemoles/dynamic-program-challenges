package com.devstromo.memoization.countConstruct;

import java.util.HashMap;
import java.util.Map;

public class CountConstruct {

    public int solve(String target, String[] wordBank) {
        return solve(target, wordBank, new HashMap<>());
    }

    private int solve(String target, String[] wordBank, Map<String, Integer> memo) {
        if (target == null)
            return 0;
        if (memo.containsKey(target)) {
            return memo.get(target);
        }
        if (target.length() == 0)
            return 1;
        var totalCount = 0;
        for (String word : wordBank) {
            if (target.indexOf(word) == 0) {
                var suffix = target.substring(word.length());
                var numWays = solve(suffix, wordBank, memo);
                totalCount += numWays;
            }

        }
        memo.put(target, totalCount);
        return totalCount;
    }
}
