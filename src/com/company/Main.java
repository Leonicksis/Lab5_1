
package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Calendar cal = new Calendar();
        cal.Show();
        System.out.println("Add new Holidays:");
        System.out.println("HolidayName:");
        String s = scan.nextLine();
        int d1 = 0, d2 = 0;
        try {
            System.out.println("Start:");
            d1 = scan.nextInt();
            System.out.println("End:");
            d2 = scan.nextInt();
        } catch (InputMismatchException e1) {
            System.out.println("You make some mistakes, bro :C");
        }

        try {
            cal.AddHoliday(s, d1, d2);
        } catch (IndexOutOfBoundsException  e1) {
            System.out.println("You make some mistakes, bro :C");
        }
        cal.Show();
        int k = 0;

        System.out.println("Get type of day:");
        try {
            k = scan.nextInt();
        } catch (InputMismatchException e1) {
            System.out.println("You make some mistakes, bro :C");
        }
        cal.GetTypeDay(k);

    }
}