package com.pyruz.facade.pattern.impl;

public class TransactionProcessing {
    public void processTransaction(String username, double amount) {
        System.out.println("$" + amount + " transaction processed for user: " + username);
    }
}
