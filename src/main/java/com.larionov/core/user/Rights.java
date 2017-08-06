package com.larionov.core.user;

public enum Rights {
    OWNER(1),
    MANAGER(2),
    SELLER(3);

    private long id;

    Rights(long id) {
        this.id = id;
    }
}
