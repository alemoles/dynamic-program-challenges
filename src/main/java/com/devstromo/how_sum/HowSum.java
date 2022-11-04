package com.devstromo.how_sum;

import static java.lang.System.arraycopy;

import java.util.HashMap;
import java.util.Map;

public class HowSum {

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
        for (int number : numbers) {
            var remainder = targetSum - number;
            var remainderResult = solve(remainder, numbers, memo);
            if (remainderResult != null) {
                memo.put(targetSum, copyAndAdd(remainderResult, number));
                return memo.get(targetSum);
            }
        }
        memo.put(targetSum, null);
        return null;
    }

    private int[] copyAndAdd(int[] numbers, int number) {
        var copy = new int[numbers.length + 1];
        arraycopy(numbers, 0, copy, 0, copy.length - 1);
        copy[numbers.length] = number;
        return copy;
    }
}
