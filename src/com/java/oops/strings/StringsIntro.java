package com.java.oops.strings;

public class StringsIntro {
    public static void main(String[] args) {
        // String is a sequence of Characters
        // In Java String is an object
        String emptyString = "";

        // Immutable Strings
        String str1 = "Java";// can create a String object without new keyword
        String str2 = new String("Java");
        String str3 = "Java";
        String str4 = new String("Java");
        String str5 = "JS";
        str5 = "java";

        if (str1 == str3) {// == compares address Address
            System.out.println("Equal");
        } else {
            System.out.println("UnEqual");
        }


        if (str1.equals(str3)) {// equals fn compares value
            System.out.println("Equal");
        } else {
            System.out.println("UnEqual");
        }

        if (str4.equalsIgnoreCase(str5)) {// equals fn compares value
            System.out.println("Equal");
        } else {
            System.out.println("UnEqual");
        }



    }
}
