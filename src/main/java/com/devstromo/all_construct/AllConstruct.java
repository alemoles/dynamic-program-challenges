package com.devstromo.all_construct;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AllConstruct {

    public List<List<String>> solve(String target, String[] wordBank) {
        return solve(target, wordBank, new HashMap<>());
    }

    private List<List<String>> solve(String target, String[] wordBank, Map<String, List<List<String>>> memo) {
        if (target == null)
            return null;
        if (memo.containsKey(target)) {
            return memo.get(target);
        }
        if (target.equals("")) {
            List<List<String>> tmp = new ArrayList<>();
            List<String> list = new ArrayList<>();
            tmp.add(list);
            return tmp; // a list with one element [[]]
        }
        List<List<String>> result = new ArrayList<>();
        for (String word : wordBank) {
            if (target.startsWith(word)) {
                var suffix = target.substring(word.length());
                var suffixWays = solve(suffix, wordBank, memo);
                var targetWays = new ArrayList<List<String>>();
                for (var suffixWay : suffixWays) {
                    var tmp = new ArrayList<>(suffixWay);
                    tmp.add(0, word);
                    targetWays.add(tmp);
                }
                result.addAll(targetWays);
            }
        }
        memo.put(target, result);
        return result;
    }
}
