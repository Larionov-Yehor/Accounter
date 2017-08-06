package com.larionov.core;

import com.larionov.core.utils.CalculationUtils;

public class Calculator {

    public void countSum(Record record) {
        if (record.commoditiesArePresent()) {
            record.getCommodities().forEach(commodity -> {
                double commoditySum = commodity.getPrice() * commodity.getQuantity();
                commoditySum = CalculationUtils.round(commoditySum);
                double commoditySumWithDiscount = commodity.getDiscount().countDiscountValue(commoditySum);
                record.increaseSumBy(commoditySumWithDiscount);
            });
        }
    }


}
