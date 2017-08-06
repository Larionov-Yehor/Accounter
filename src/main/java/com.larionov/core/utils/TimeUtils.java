package com.larionov.core.utils;

import com.larionov.core.BusinessDay;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

public class TimeUtils {

    public static boolean isFreeToChange(BusinessDay businessDay) {
        Timestamp now = TimeUtils.getCurrentTimestamp();
        return now.after(businessDay.getStart()) && now.before(businessDay.getEnd());
    }

    public static Timestamp getCurrentTimestamp() {
        return Timestamp.from(LocalDateTime.now().toInstant(ZoneOffset.UTC));
    }
}
