package com.devstromo.memoization.best_sum;

import static java.lang.System.arraycopy;

import java.util.HashMap;
import java.util.Map;

public class BestSum {

    public int[] solve(int targetSum, int[] numbers) {
        return solve(targetSum, numbers, new HashMap<>());
    }

    private int[] solve(int targetSum, int[] numbers, Map<Integer, int[]> memo) {
        if (memo.containsKey(targetSum)) {
            return memo.get(targetSum);
        }
        if (targetSum == 0)
            return new int[0];
        if (targetSum < 0)
            return null;
        int[] shortestCombination = null;
        for (var number : numbers) {
            var remainder = targetSum - number;
            var remainderCombination = solve(remainder, numbers, memo);
            if (remainderCombination != null) {
                var combination = copyAndAdd(remainderCombination, number);
                if (shortestCombination == null || combination.length < shortestCombination.length) {
                    shortestCombination = combination;
                }
            }

        }
        memo.put(targetSum, shortestCombination);
        return shortestCombination;
    }

    private int[] copyAndAdd(int[] numbers, int number) {
        var copy = new int[numbers.length + 1];
        arraycopy(numbers, 0, copy, 0, copy.length - 1);
        copy[numbers.length] = number;
        return copy;
    }
}
