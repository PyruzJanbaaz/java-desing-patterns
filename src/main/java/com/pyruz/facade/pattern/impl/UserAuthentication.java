package com.pyruz.facade.pattern.impl;

public class UserAuthentication {
    public void authenticateUser(String username, String password) {
        System.out.println("User " + username + " authenticated with password " + password);
    }

    public void authenticateUser(String username) {
        System.out.println("User " + username + " authenticated");
    }
}
