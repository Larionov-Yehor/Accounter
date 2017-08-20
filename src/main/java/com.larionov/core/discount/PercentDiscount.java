package com.larionov.core.discount;

public class PercentDiscount extends Discount {
    public int percent;

    @Override
    public double countCommodityAmountWithDiscount(double amount) {
        return amount / 100 * percent;
    }
}
