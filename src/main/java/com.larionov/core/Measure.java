package com.larionov.core;


public class Measure<T> {

    public String name;
    public T quantity;

    public Measure(T quantity) {
        this.quantity = quantity;
    }
}
