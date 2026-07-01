package com.decodelabs.project4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int fromCurrency;
        int toCurrency;
        double amount;
        double result = 0;

        do {

            System.out.println("\n==============================");
            System.out.println("      CURRENCY CONVERTER");
            System.out.println("==============================");

            System.out.println("Select Base Currency");
            System.out.println("1. INR");
            System.out.println("2. USD");
            System.out.println("3. EUR");
            System.out.println("4. GBP");
            System.out.println("5. Exit");

            System.out.print("Enter Choice: ");
            fromCurrency = sc.nextInt();

            if (fromCurrency == 5) {
                System.out.println("Thank You!");
                break;
            }

            System.out.println();

            System.out.println("Convert To");
            System.out.println("1. INR");
            System.out.println("2. USD");
            System.out.println("3. EUR");
            System.out.println("4. GBP");

            System.out.print("Enter Choice: ");
            toCurrency = sc.nextInt();

            System.out.print("Enter Amount: ");
            amount = sc.nextDouble();

            if (amount <= 0) {
                System.out.println("Invalid Amount!");
                continue;
            }

            double inr = 1;
            double usd = 83.50;
            double eur = 92.30;
            double gbp = 108.60;

            double amountInINR = 0;

            switch (fromCurrency) {

                case 1:
                    amountInINR = amount;
                    break;

                case 2:
                    amountInINR = amount * usd;
                    break;

                case 3:
                    amountInINR = amount * eur;
                    break;

                case 4:
                    amountInINR = amount * gbp;
                    break;

                default:
                    System.out.println("Invalid Currency!");
                    continue;
            }

            switch (toCurrency) {

                case 1:
                    result = amountInINR;
                    break;

                case 2:
                    result = amountInINR / usd;
                    break;

                case 3:
                    result = amountInINR / eur;
                    break;

                case 4:
                    result = amountInINR / gbp;
                    break;

                default:
                    System.out.println("Invalid Currency!");
                    continue;
            }

            System.out.printf("Converted Amount = %.2f%n", result);

        } while (true);

        sc.close();

    }
}