package com.larionov.core.user;


public class User {
    private long id;
    private Role role;
    private String firstName;
    private String lastName;

    public boolean hasRightsToPerformAtAnyTime() {
        return getRole().equals(Role.OWNER);
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
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
