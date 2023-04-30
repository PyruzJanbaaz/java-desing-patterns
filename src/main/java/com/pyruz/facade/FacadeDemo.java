package com.pyruz.facade;

import com.pyruz.facade.pattern.BankingSystemFacade;

public class FacadeDemo {
    public static void main(String[] args) {
        BankingSystemFacade bankingSystemFacade = new BankingSystemFacade();
        bankingSystemFacade.createAccount("John", "123456");
        bankingSystemFacade.processTransaction("John", 120.5);
    }
}
