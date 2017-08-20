package com.larionov.core.discount;

public abstract class Discount {
    public Long id;
    public abstract double countCommodityAmountWithDiscount(double commodityAmount);
}
