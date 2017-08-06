package com.larionov.core.user;

public enum Rights {
    OWNER(1),
    SELLER(2);

    private long id;

    Rights(long id) {
        this.id = id;
    }
}
