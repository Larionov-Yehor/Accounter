package com.larionov.core;


import com.larionov.core.user.User;
import com.larionov.core.utils.TimeUtils;

import java.sql.Timestamp;
import java.util.List;

public class BusinessDay {

    private long id;

    private Timestamp startsAt;
    private Timestamp finishesAt;

    private List<Record> records;

    private double total;

    public void add(Record record, User user) {
        Timestamp now = TimeUtils.getCurrentTimestamp();
        if (now.after(startsAt) && now.before(finishesAt)) {
            addRecordAndIncreaseTotal(record);
        } else {
            if (user.hasRightsToPerformAtAnyTime()) {
                addRecordAndIncreaseTotal(record);
            } else {
                // ex
            }
        }
    }

    public void edit(Record record, User user) {

    }

    private void addRecordAndIncreaseTotal(Record record) {
        this.records.add(record);
        this.total += record.getSum();
    }



}
