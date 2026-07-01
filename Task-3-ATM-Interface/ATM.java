package com.decodelabs.project3;

import java.util.Scanner;

public class ATM {

    private BankAccount account;
    private Scanner scanner;

    public ATM(BankAccount account) {
        this.account = account;
        scanner = new Scanner(System.in);
    }

    public void start() {

        int choice;

        do {

            System.out.println("\n==============================");
            System.out.println("         ATM MENU");
            System.out.println("==============================");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("Current Balance : ₹" + account.getBalance());
                    break;

                case 2:
                    System.out.print("Enter Deposit Amount: ₹");
                    double deposit = scanner.nextDouble();
                    account.deposit(deposit);
                    break;

                case 3:
                    System.out.print("Enter Withdrawal Amount: ₹");
                    double withdraw = scanner.nextDouble();
                    account.withdraw(withdraw);
                    break;

                case 4:
                    System.out.println("Thank you for using our ATM.");
                    break;

                default:
                    System.out.println("Invalid Choice.");
            }

        } while (choice != 4);

    }
}