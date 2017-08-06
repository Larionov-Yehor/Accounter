package com.larionov.core;


import com.larionov.core.user.User;
import com.larionov.core.utils.TimeUtils;

import java.sql.Timestamp;
import java.util.List;

public class BusinessDay {

    private long id;
    private Outlet atOutlet;

    private Timestamp start;
    private Timestamp end;

    private List<Record> records;

    private double total;

    public void add(Record record, User user) {
        if (operationIsPossible(user)) {
            this.records.add(record);
        } else {
            // exception
        }
    }
    

    public boolean recordsArePresent() {
        return this.records.size() > 0;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Timestamp getStart() {
        return start;
    }

    public void setStart(Timestamp start) {
        this.start = start;
    }

    public Timestamp getEnd() {
        return end;
    }

    public void setEnd(Timestamp end) {
        this.end = end;
    }

    public List<Record> getRecords() {
        return records;
    }

    public void setRecords(List<Record> records) {
        this.records = records;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public Outlet getAtOutlet() {
        return atOutlet;
    }

    public void setAtOutlet(Outlet atOutlet) {
        this.atOutlet = atOutlet;
    }

    private boolean operationIsPossible(User user) {
        return TimeUtils.isFreeToChange(this) || user.hasRightsToPerformAtAnyTime();
    }

}
