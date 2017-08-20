package com.larionov.core.history.event;

import com.larionov.core.history.action.Action;
import com.larionov.core.user.User;
import com.larionov.core.utils.TimeUtils;

import java.sql.Timestamp;

public abstract class Event {

    private User user;
    private Timestamp createdAt;
    private Action action;

    public Event() {
        createdAt = TimeUtils.getCurrentTimestamp();
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    public Action getAction() {
        return action;
    }

    public void setAction(Action action) {
        this.action = action;
    }
}
