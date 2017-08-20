package com.larionov.core.history.event;

import com.larionov.core.history.action.BusinessDayAction;
import com.larionov.core.user.User;


public class BusinessDayEvent extends Event{

    public BusinessDayEvent(User user, BusinessDayAction action) {
        setUser(user);
        setAction(action);
    }
}
