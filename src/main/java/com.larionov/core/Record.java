package com.larionov.core;

import com.larionov.core.discount.Discount;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.ZoneOffset;


public class Record {
    private long id;

    private Timestamp createdAt;

    private User createdBy;

    public Commodity commodity;
    public Measure unit;
    public Discount discount;

    private double sum;

    public Record() {
        this.createdAt = Timestamp.from(LocalDateTime.now().toInstant(ZoneOffset.UTC));
    }

    public void summation() {

        double discount = 0;

        double amount = countAmount();
        amount = round(amount);

        if (this.discount != null) {
            discount = round(this.discount.countDiscountValue(amount));
        }

        this.sum = round(amount) - discount;
    }

    public double countAmount() {

        if (isNotComplete()) {
            return 0;
        }

        double amount = 0;
        Class quantityClass = this.unit.quantity.getClass();

        if (quantityClass.equals(Integer.class)) {
            amount = commodity.price * (Integer) unit.quantity;
        } else if (quantityClass.equals(Long.class)) {
            amount = commodity.price * (Long) unit.quantity;
        } else if (quantityClass.equals(Double.class)) {
            amount = commodity.price * (Double) unit.quantity;
        }

        return amount;
    }

    public double round(double amount) {
        return (double) Math.round(amount * 100) / 100;
    }

    public boolean isNotComplete() {
        return this.unit == null || this.commodity == null;
    }

    public double getSum() {
        return sum;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public User getCreatedBy() {
        return createdBy;
    }
}