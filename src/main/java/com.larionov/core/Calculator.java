package com.larionov.core;

import com.larionov.core.utils.CalculationUtils;

public class Calculator {

    public double countBusinessDayTotal(BusinessDay businessDay) {
        double businessDayTotal = 0;
        if (businessDay.recordsArePresent()) {
            for (Record record : businessDay.getRecords()) {
                businessDayTotal = countRecordAmount(record);
            }
        }
        return businessDayTotal;
    }

    public double countRecordAmount(Record record) {
        double recordAmount = 0;
        if (record.commoditiesArePresent()) {
            for (Commodity commodity : record.getCommodities()) {
                recordAmount += countCommodityAmount(commodity);
            }
        }
        return recordAmount;
    }

    private double countCommodityAmount(Commodity commodity) {
        double commodityAmount = CalculationUtils.round(commodity.getPrice() * commodity.getQuantity());
        return includeDiscount(commodity, commodityAmount);
    }

    private double includeDiscount(Commodity commodity, double commodityAmount) {
        if (commodity.discountIsPresent()) {
            return CalculationUtils.round(commodity.getDiscount().countCommodityAmountWithDiscount(commodityAmount));
        }
        return 0;
    }
}
