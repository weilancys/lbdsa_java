package com.lightblue.dsa;

import java.util.HashMap;
import java.util.Map;

public class Fibonacci {
    // memory used to storing and lookup of the intermedia value
    private Map<Long, Long> memory;
    public Fibonacci() {
        memory = new HashMap<>();
    }

    // n is 1 based
    public long getFiboAt(long n) {
        return getFiboAtIndexByLoop(n);
    }

    // get fibonacci number at index n
    public long getFiboAtIndexByRecursion(long n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        if (memory.containsKey(n)) return memory.get(n);
        long prevLeft = getFiboAtIndexByRecursion(n-2);
        long prevRight = getFiboAtIndexByRecursion(n-1);
        return prevLeft + prevRight;
    }

    // get fibonacci number at index n
    public long getFiboAtIndexByLoop(long n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        if (memory.containsKey(n)) return memory.get(n);
        long a = 0;
        long b = 1;
        long fibo = 0;
        for (long i = 0; i <= n-2; i++) {
            fibo = a + b;
            a = b;
            b = fibo;
            memory.put(i+2, fibo);
        }
        return fibo;
    }
}
