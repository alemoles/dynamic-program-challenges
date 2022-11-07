package com.devstromo.memoization.best_sum;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

import com.devstromo.memoization.best_sum.BestSum;

class BestSumTest {

    private final BestSum bestSum = new BestSum();

    @Test
    public void testHowSum() {
        assertArrayEquals(new int[] { 7 }, bestSum.solve(7, new int[] { 5, 3, 4, 7 }));
        assertArrayEquals(new int[] {  5, 3 }, bestSum.solve(8, new int[] { 2, 3, 5 }));// [3,5]
        assertArrayEquals(new int[] { 4, 4 }, bestSum.solve(8, new int[] { 1, 4, 5 }));
        assertArrayEquals(new int[] { 25, 25, 25, 25 }, bestSum.solve(100, new int[] { 1, 2, 5, 25 }));
    }
}