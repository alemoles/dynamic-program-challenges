package com.devstromo.tabulation.how_sum;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

class HowSumTest {
    private final HowSum howSum = new HowSum();

    @Test
    public void testHowSum() {
        assertArrayEquals(new int[] { 3, 2, 2 }, howSum.solve(7, new int[] { 2, 3 }));
        assertArrayEquals(new int[] { 2, 2, 2, 2 }, howSum.solve(8, new int[] { 2, 3, 5 }));// [3,5]
        assertArrayEquals(new int[] {}, howSum.solve(0, new int[] { 1, 2, 3 }));
    }

    @Test
    public void testHowSumFail() {
        assertNull(howSum.solve(7, new int[] { 2, 4 }));
        assertNull(howSum.solve(300, new int[] { 7, 14 }));
    }
}