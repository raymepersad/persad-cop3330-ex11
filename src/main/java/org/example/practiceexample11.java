/*
 *   UCF COP3330 SUMMER 2021 ASSIGNMENT 11 SOLUTION
 *   COPYRIGHT 2021 RAYME PERSAD
 */


/*Write a program that converts currency.
Specifically, convert euros to U.S. dollars.
Prompt for the amount of money in euros you have, and prompt for the current exchange rate of the euro.
Print out the new amount in U.S. dollars.
 */


package org.example;
import java.util.Scanner;

public class practiceexample11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double result = 0.0;

        System.out.println("How many Euros are you exchanging?"); //prompt for amount of euros

        double euros = sc.nextDouble();

        System.out.println("What is the exchange rate?"); //prompt for euro to usd exchange rate

        double exchangeRate = sc.nextDouble();

        double dollars = currencyConverter(euros, exchangeRate,result);

        System.out.println(euros + " Euros at an Exchange rate of " + exchangeRate + " is "); //results print 1
        System.out.println(dollars + " U.S Dollars "); //results print 2

        sc.close(); //scanner system close
    }

    private static double currencyConverter(double euros, double exchangeRate,double result) {
        return result = euros * exchangeRate;

    }
}