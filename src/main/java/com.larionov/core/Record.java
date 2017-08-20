package com.larionov.core;

import com.larionov.core.history.event.RecordEvent;

import java.util.ArrayList;
import java.util.List;


public class Record {
    private long id;

    private List<Commodity> commodities = new ArrayList<>();
    private List<RecordEvent> history;

    private double sum;

    public Record(){  }


    public boolean commoditiesArePresent() {
        return commodities.size() > 0;
    }

    public void increaseSumBy(double value) {
        sum += value;
    }

    public double getSum() {
        return sum;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public List<Commodity> getCommodities() {
        return commodities;
    }

    public void setCommodities(List<Commodity> commodity) {
        this.commodities = commodity;
    }

    public void addCommodity(Commodity commodity) {
        this.commodities.add(commodity);
    }

}