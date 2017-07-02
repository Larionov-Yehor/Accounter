package com.larionov.core.discount;

public class FixedDiscount extends Discount {
    public int amount;

    @Override
    public double countDiscountValue(double amount) {
        return amount - this.amount;
    }
}
