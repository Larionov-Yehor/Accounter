package com.larionov.core;


import java.sql.Timestamp;
import java.util.List;

public class BusinessPeriod {

    private Timestamp startsAt;
    private Timestamp finishesAt;

    private List<Record> records;

    private double total;

    private boolean isClosed;

    public void addRecord(Record record, User user) {

        if(itIsAppropriateTime(record.getCreatedAt())) {
            this.records.add(record);
        }
        else if(user.hasAdminRights()) {
            this.records.add(record);
        }
        else {
            //ex??
        }
    }

    public void removeRecord(Record record, User user) {

        if(itIsAppropriateTime(record.getCreatedAt()) && record.getCreatedBy().equals(user)) {
            this.records.remove(record);
        }
        else if(user.hasAdminRights()) {
            this.records.remove(record);
        }
        else {
           // ?
        }
    }

    public void countTotal() {
        if(!this.isClosed) {
            records.stream()
                    .filter(Record::isNotComplete)
                    .forEach(record -> this.total += record.getSum());
        }

    }

    public void closeBusinessPeriod(User user) {
        if(user.hasAdminRights()){
            countTotal();
            this.isClosed = true;
        }

    }

    public boolean itIsAppropriateTime(Timestamp recordCreatedAt) {
        return recordCreatedAt.after(this.startsAt);
    }

    public boolean itIsTooLate(Timestamp recordCreatedAt) {
        return recordCreatedAt.after(this.startsAt) && recordCreatedAt.before(this.finishesAt);
    }
}
