package com.larionov.core.user;

import java.util.Set;

public enum Role {
    SELLER,
    SENIOR_SELLER,
    LOCAL_MANAGER,
    SENIOR_MANAGER,
    ACCOUNTANT,
    OWNER;

    private long id;
    private Set<Right> rights;
}
