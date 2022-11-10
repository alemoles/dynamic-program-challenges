package com.devstromo.tabulation.can_sum;

public class CanSum {
    public boolean solve(int target, int[] numbers) {
        var table = new boolean[target + 1];
        table[0] = true;
        for (int i = 0; i <= target; i++) {
            if (table[i]) {
                for (var number : numbers) {
                    if (i + number < table.length)
                        table[i + number] = true;
                }
            }
        }
        return table[target];
    }
}
