package com.devstromo.tabulation.fib;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class FibonacciTest {
    private final Fibonacci fibonacci = new Fibonacci();
    @Test
    public void testFibonacciTabulation() {
        assertEquals(8, fibonacci.solve(6));
        assertEquals(13, fibonacci.solve(7));
        assertEquals(21, fibonacci.solve(8));
        assertEquals(12586269025L, fibonacci.solve(50));
    }
}