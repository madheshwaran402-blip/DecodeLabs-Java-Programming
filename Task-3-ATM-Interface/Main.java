package com.decodelabs.project3;

public class Main {

    public static void main(String[] args) {

        BankAccount account = new BankAccount(10000);

        ATM atm = new ATM(account);

        atm.start();

    }
}