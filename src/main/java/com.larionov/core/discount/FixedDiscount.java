package com.larionov.core.discount;

public class FixedDiscount extends Discount {
    public int amount;

    @Override
    public double countCommodityAmountWithDiscount(double amount) {
        return amount - this.amount;
    }
}
