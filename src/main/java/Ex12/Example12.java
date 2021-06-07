package Ex12;

import java.util.Scanner;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Richard Pekarski
 */

public class Example12 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        BankAccount my_bankAccount = new BankAccount();

        System.out.print("Enter the principal amount. ");
        my_bankAccount.setPrincipal(input.nextDouble());

        System.out.print("Enter the rate of investment: ");
        double rate_interest = input.nextDouble();
        my_bankAccount.setInterestRate(rate_interest);

        System.out.print("Enter the number of years: ");
        my_bankAccount.setYears(input.nextInt());
        my_bankAccount.getAmount();

         System.out.print("After " + my_bankAccount.getYears() + " years at " + rate_interest +
                 "%, the investment will be worth " + my_bankAccount.getAmount());
    }
}
