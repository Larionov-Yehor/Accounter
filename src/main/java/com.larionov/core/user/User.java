package com.larionov.core.user;


public class User {
    private long id;
    private Rights rights;
    private String firstName;
    private String lastName;

    public boolean hasRightsToPerformAtAnyTime() {
        return getRights().equals(Rights.OWNER);
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Rights getRights() {
        return rights;
    }

    public void setRights(Rights rights) {
        this.rights = rights;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
