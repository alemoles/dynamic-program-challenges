package com.devstromo.tabulation.count_construct;

public class CountConstruct {
    public int solve(String target, String[] wordBank) {
        var table = new int[target.length() + 1];
        table[0] = 1;
        for (int i = 0; i < target.length(); i++) {
            for (var word : wordBank) {
                if (i + word.length() < table.length && target.startsWith(word, i)) {
                    table[i + word.length()] += table[i];
                }
            }
        }
        return table[target.length()];
    }
}
