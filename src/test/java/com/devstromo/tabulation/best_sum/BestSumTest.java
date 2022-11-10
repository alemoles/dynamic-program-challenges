package com.devstromo.tabulation.best_sum;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.Test;

class BestSumTest {
    private final BestSum bestSum = new BestSum();

    @Test
    public void testHowSum() {
        assertEquals(List.of(7), bestSum.solve(7, new int[] { 5, 3, 4, 7 }));
        assertEquals(List.of(3, 5), bestSum.solve(8, new int[] { 2, 3, 5 }));// [3,5]
        assertEquals(List.of(4, 4), bestSum.solve(8, new int[] { 1, 4, 5 }));
        assertEquals(List.of(25, 25, 25, 25), bestSum.solve(100, new int[] { 1, 2, 5, 25 }));
        assertEquals(Collections.emptyList(), bestSum.solve(0, new int[] { 1, 2, 5, 25 }));
    }
}