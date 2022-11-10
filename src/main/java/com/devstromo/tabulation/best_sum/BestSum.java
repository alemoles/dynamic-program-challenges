package com.devstromo.tabulation.best_sum;

import java.util.ArrayList;
import java.util.List;

public class BestSum {
    public List<Integer> solve(int targetSum, int[] numbers) {
        var table = new ArrayList<List<Integer>>(targetSum + 1);
        table.add(0, new ArrayList<>());
        for (int i = 1; i <= targetSum; i++) {
            table.add(i, null);
        }
        for (int i = 0; i < targetSum; i++) {
            if (table.get(i) != null) {
                for (var number : numbers) {
                    if (i + number <= targetSum) {
                        var combination = new ArrayList<>(table.get(i));
                        combination.add(number);
                        if (table.get(i + number) == null || (table.get(i + number) != null && table.get(i + number)
                            .size() > combination.size())) {
                            table.set(i + number, combination);
                        }
                    }
                }
            }
        }
        return table.get(targetSum) != null && table.get(targetSum)
            .stream()
            .reduce(0, Integer::sum) == targetSum ? table.get(targetSum) : null;
    }
}
