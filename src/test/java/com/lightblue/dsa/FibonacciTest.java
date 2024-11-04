package com.lightblue.dsa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {
    @Test
    void testGetFiboAt() {
        Fibonacci fibonacci = new Fibonacci();
        Assertions.assertEquals(fibonacci.getFiboAt(19), 4181);
    }

    @Test
    void testGetFiboAtIndexByResursion() {
        Fibonacci fibonacci = new Fibonacci();
        Assertions.assertEquals(832040, fibonacci.getFiboAtIndexByRecursion(30));
    }

    @Test
    void testGetFiboAtIndexByLoop() {
        Fibonacci fibonacci = new Fibonacci();
        Assertions.assertEquals(102334155, fibonacci.getFiboAtIndexByLoop(40));
    }

    @Test
    void testRecursionAndLoopSameResult() {
        long n = 30;
        Fibonacci fibonacci = new Fibonacci();
        Assertions.assertEquals(fibonacci.getFiboAtIndexByLoop(n), fibonacci.getFiboAtIndexByRecursion(n));
    }
}