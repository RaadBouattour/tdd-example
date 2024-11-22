package com.example;

public class Calculator {

    public int add(int a, int b) {
        return Math.addExact(a, b); // Prevents integer overflow
    }

    public int subtract(int a, int b) {
        return Math.subtractExact(a, b); // Prevents integer overflow
    }
}
