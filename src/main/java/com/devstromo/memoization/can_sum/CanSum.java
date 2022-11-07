package com.devstromo.memoization.can_sum;

import java.util.HashMap;
import java.util.Map;

public class CanSum {
    public boolean solve(int targetSum, int[] numbers) {
        return solve(targetSum, numbers, new HashMap<>());
    }

    private boolean solve(int targetSum, int[] numbers, Map<Integer, Boolean> memo) {
        if (memo.containsKey(targetSum))
            return memo.get(targetSum);
        if (targetSum == 0)
            return true;
        if (targetSum < 0)
            return false;

        for (int number : numbers) {
            var remainder = targetSum - number;
            if (solve(remainder, numbers, memo)) {
                memo.put(remainder, true);
                return true;
            }
        }
        memo.put(targetSum, false);
        return false;
    }
}
