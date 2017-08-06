package com.larionov.core;

import com.larionov.core.utils.CalculationUtils;

public class Calculator {

    public void countBusinessDayTotal(BusinessDay businessDay) {
        if (businessDay.recordsArePresent()) {
            businessDay.getRecords().forEach(record -> countRecordSum(record));
        } else {
            businessDay.setTotal(0);
        }
    }

    public void countRecordSum(Record record) {
        if (record.commoditiesArePresent()) {
            record.getCommodities().forEach(commodity -> {
                double commoditySum = commodity.getPrice() * commodity.getQuantity();
                commoditySum = CalculationUtils.round(commoditySum);
                double commoditySumWithDiscount = commodity.getDiscount().countDiscountValue(commoditySum);
                record.increaseSumBy(commoditySumWithDiscount);
            });
        } else {
            record.setSum(0);
        }
    }

}
