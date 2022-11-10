package com.devstromo.tabulation.can_sum;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class CanSumTest {
    private final CanSum canSum = new CanSum();

    @Test
    public void testCanSum() {
        assertTrue(canSum.solve(7, new int[] { 2, 3 }));
        assertTrue(canSum.solve(7, new int[] { 5, 3, 4, 7 }));
        assertTrue(canSum.solve(8, new int[] { 2, 3, 5 }));
    }

    @Test
    public void testNotCanSum() {
        assertFalse(canSum.solve(7, new int[] { 2, 4 }));
        assertFalse(canSum.solve(300, new int[] { 7, 14 }));
    }
}