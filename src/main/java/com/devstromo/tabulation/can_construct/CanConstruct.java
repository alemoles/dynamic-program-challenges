package com.devstromo.tabulation.can_construct;

public class CanConstruct {
    public boolean solve(String target, String[] wordBank) {
        var table = new boolean[target.length() + 1];
        table[0] = true;
        for (int i = 0; i < table.length; i++) {
            if (table[i]) {
                for (var word : wordBank) {
                    if (i + word.length() < table.length && target.startsWith(word, i)) {
                        table[i + word.length()] = true;
                    }
                }
            }
        }
        return table[target.length()];
    }
}
