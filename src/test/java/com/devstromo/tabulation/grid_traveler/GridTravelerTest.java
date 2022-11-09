package com.devstromo.tabulation.grid_traveler;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;


class GridTravelerTest {
    private final GridTraveler traveler = new GridTraveler();

    @Test
    public void testGridTraveler1x1() {
        assertEquals(1, traveler.solve(1, 1));
    }

    @Test
    public void testGridTraveler2x3() {
        assertEquals(3, traveler.solve(2, 3));
    }

    @Test
    public void testGridTraveler3x2() {
        assertEquals(3, traveler.solve(3, 2));
    }

    @Test
    public void testGridTraveler3x3() {
        assertEquals(6, traveler.solve(3, 3));
    }

    @Test
    public void testGridTraveler18x18() {
        assertEquals(2333606220L, traveler.solve(18, 18));
    }
}