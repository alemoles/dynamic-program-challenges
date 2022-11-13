package com.devstromo.tabulation.all_construct;

import java.util.ArrayList;
import java.util.List;

public class AllConstruct {
    public List<List<String>> solve(String target, String[] wordBank) {
        List<List<List<String>>> table = new ArrayList<>();
        for (int i = 0; i < target.length() + 1; i++) {
            table.add(i, new ArrayList<>());
        }
        table.get(0)
            .add(0, new ArrayList<>());
        for (int i = 0; i < target.length(); i++) {
            if (table.get(i) != null) {
                for (var word : wordBank) {
                    if (target.startsWith(word, i)) {
                        var combinations = new ArrayList<List<String>>();
                        for (var combination : table.get(i)) {
                            combinations.add(new ArrayList<>(combination));
                        }
                        for (var combination : combinations) {
                            combination.add(word);
                        }
                        for (var combination : combinations) {
                            table.get(i + word.length()).add(combination);
                        }
                    }
                }
            }
        }
        return table.get(target.length());
    }
}
