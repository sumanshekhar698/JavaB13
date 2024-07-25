package com.java.oops.hackerank;

import java.util.Scanner;

public class ScannerQuestion {

    public static void main(String... args) {
        System.out.println("Hell");
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        System.out.println(a);

        // sc.nextLine();//Flushing
        // String b = sc.nextLine();// must use flushing in this case

        String b = sc.next();// no need to flush in next()
        System.out.println(b);

    }
}
