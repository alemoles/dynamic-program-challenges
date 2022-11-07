package com.devstromo.memoization.can_construct;

import java.util.HashMap;
import java.util.Map;

public class CanConstruct {
    public boolean solve(String target, String[] wordBank) {
        return solve(target, wordBank, new HashMap<>());
    }

    private boolean solve(String target, String[] wordBank, Map<String, Boolean> memo) {

        if (target == null)
            return false;
        if (memo.containsKey(target)) {
            return memo.get(target);
        }
        if (target.length() == 0)
            return true;
        for (var word : wordBank) {
            if (target.indexOf(word) == 0) {
                var suffix = target.substring(word.length());
                if (solve(suffix, wordBank, memo)) {
                    memo.put(target, true);
                    return true;
                }
            }
        }
        memo.put(target, false);
        return false;
    }
}
