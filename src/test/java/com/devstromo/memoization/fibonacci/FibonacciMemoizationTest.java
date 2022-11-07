package com.devstromo.memoization.fibonacci;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.devstromo.memoization.fibonacci.FibonacciMemoization;

class FibonacciMemoizationTest {
    private final FibonacciMemoization memoization = new FibonacciMemoization();

    @Test
    public void testFibonacciMemoization() {
        assertEquals(8, memoization.fibonacci(6));
    }

    @Test
    public void testFibonacciMemoizationLongResult() {
        assertEquals(12586269025L, memoization.fibonacci(50));
    }
}