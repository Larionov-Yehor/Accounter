package com.larionov.core.utils;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

public class TimeUtils {

    public static Timestamp getCurrentTimestamp() {
        return Timestamp.from(LocalDateTime.now().toInstant(ZoneOffset.UTC));
    }
}
