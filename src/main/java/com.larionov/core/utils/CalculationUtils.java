package com.larionov.core.utils;


public class CalculationUtils {

    public static double round(double amount) {
        return (double) Math.round(amount * 100) / 100;
    }
}
