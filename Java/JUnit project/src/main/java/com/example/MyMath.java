package com.example;

public class MyMath {
    public static double divide(double x, double y) {
        if (y == 0)
            throw new ArithmeticException("Can't divide by zero");

        return x / y;
    }
}
