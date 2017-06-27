package com.larionov.core;

import java.time.LocalDate;
import java.time.LocalTime;


public class Record {
    private Long id;
    private LocalDate createdOn;
    private LocalTime createdAt;
    private User createdBy;

    public Commodity commodity;
    public Measure unit;

    private Double amount;

    public Record() {

    }

    public void countAmount() {

        Class a = this.unit.quantity.getClass();

        if(a.equals(Integer.class)) {
            this.amount = commodity.price * (Integer) unit.quantity;
        }

        if(a.equals(Long.class)) {
            this.amount = commodity.price * (Long) unit.quantity;
        }

        if(a.equals(Double.class)) {
            this.amount = commodity.price * (Double) unit.quantity;
        }

    }



}