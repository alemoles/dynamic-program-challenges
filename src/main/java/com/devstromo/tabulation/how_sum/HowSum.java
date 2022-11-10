package com.devstromo.tabulation.how_sum;

import java.util.ArrayList;
import java.util.List;

public class HowSum {
    public List<Integer> solve(int targetSum, int[] numbers) {
        var table = new ArrayList<List<Integer>>(targetSum + 1);
        table.add(0, new ArrayList<>());
        for (int i = 1; i < targetSum; i++) {
            table.add(i, null);
        }
        for (int i = 0; i < targetSum; i++) {
            if (table.get(i) != null) {
                for (var number : numbers) {
                    var list = new ArrayList<>(table.get(i));
                    list.add(number);
                    table.add(i + number, list);
                }
            }
        }

        return table.get(targetSum) != null && table.get(targetSum)
            .stream()
            .reduce(0, Integer::sum) == targetSum ? table.get(targetSum) : null;
    }

}
