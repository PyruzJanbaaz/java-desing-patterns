package com.pyruz.facade.pattern;

import com.pyruz.facade.pattern.impl.AccountManagement;
import com.pyruz.facade.pattern.impl.TransactionProcessing;
import com.pyruz.facade.pattern.impl.UserAuthentication;

public class BankingSystemFacade {
    private AccountManagement accountManagement;
    private TransactionProcessing transactionProcessing;
    private UserAuthentication userAuthentication;

    public BankingSystemFacade() {
        this.accountManagement = new AccountManagement();
        this.transactionProcessing = new TransactionProcessing();
        this.userAuthentication = new UserAuthentication();
    }

    // Wrapper methods for the complex banking system
    public void createAccount(String username, String password) {
        userAuthentication.authenticateUser(username, password);
        accountManagement.createAccount(username);
    }

    public void processTransaction(String username, double amount) {
        userAuthentication.authenticateUser(username);
        transactionProcessing.processTransaction(username, amount);
    }
}
