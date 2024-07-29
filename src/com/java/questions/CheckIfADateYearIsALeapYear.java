package com.java.questions;

import java.util.Scanner;

public class CheckIfADateYearIsALeapYear {
    public static void main(String[] args) {

        // DDMMYYYY
        // 01082024
        Scanner sc = new Scanner(System.in);
        String date = sc.nextLine();
        String yearStr = date.substring(4, date.length());
        int year = Integer.parseInt(yearStr);

        boolean result = isLeapYear(year);
        System.out.println(result);

        sc.close();

    }

    private static boolean isLeapYear(int year) {// Georgian Calendar
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return true;// divisible by 4 100 400
                }
                return false;// divisible by 4 100
            }
            return true;// divisible by 4 only

        } else {// if !/ 4
            return false;
        }
    }
}
