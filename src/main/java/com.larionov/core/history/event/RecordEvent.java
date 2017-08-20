package com.larionov.core.history.event;

import com.larionov.core.history.action.RecordAction;
import com.larionov.core.user.User;

public class RecordEvent extends Event {

    public RecordEvent(User user, RecordAction action) {
        setUser(user);
        setAction(action);
    }
}
