/*
 *  UCF COP3330 Fall 2021 Assignment 14 Solution
 *  Copyright 2021 Melanie Ehrlich
 */

package org.example;
import java.util.Scanner;
import java.lang.Math;

public class App {
    public static void main(String[] args) {
        double order = 0, tax = 0, amt = 0;
        Scanner q = new Scanner(System.in);

        System.out.print("What is the order amount? ");
        order = q.nextDouble();

        System.out.print("What is the state? ");
        String State = q.next();

        if (State.equals("WI")) {
            tax = (5.5 / 100);
            amt = order;
            amt += (amt * tax);

            System.out.printf("The subtotal is $ %.2f.\nThe tax is $" + Math.round((order * tax) * 100.0) / 100.0 + ".\n" + "The total is $" + Math.round(amt * 100.0) / 100.0 + ".", order);
            return;
        }

        System.out.printf("The total is $%.2f", order);
    }
}