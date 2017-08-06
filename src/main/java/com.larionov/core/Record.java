package com.larionov.core;

import com.larionov.core.user.User;
import com.larionov.core.utils.TimeUtils;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;


public class Record {
    private long id;

    private Timestamp createdAt;
    private User createdBy;

    private List<Commodity> commodities = new ArrayList<>();

    private double sum;

    public Record() {
        this.createdAt = TimeUtils.getCurrentTimestamp();
    }

    public Record(User user) {
        this();
        this.createdBy = user;
    }


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

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public User getCreatedBy() {
        return createdBy;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    public void setCreatedBy(User createdBy) {
        this.createdBy = createdBy;
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