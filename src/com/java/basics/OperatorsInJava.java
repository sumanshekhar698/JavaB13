package com.java.basics;

class OperatorsInJava {

    public static void main(String args[]) {

        // Operators

        /*
         * Unary Operators
         * Assignemt Operators
         * Logical Operators
         * Arithmetic Operators
         * BitWise Operators
         */

        // Unary Operators

        int a = 10;
        a++;// post increment
        ++a;// pre increment

        System.out.println(a);// 12

        a = 100;
        System.out.println(a++);// use the value 1st and then increment 100
        // a = 101
        System.out.println(++a);// increment the value 1st and then use a= 102

        a = 10;
        System.out.println(--a);// pre decrement a = 9 :: 9
        System.out.println(a++);// 9 a=10
        System.out.println(a);// 10
        System.out.println(++a);// a = 11 ::11
        System.out.println(a);// 11
        System.out.println(++a);// a= 12 ::12

        a = 100;
        a = --a + ++a - a-- + a++ - a + ++a - a--;
        // a = 100
        // 99+ 100 - 100 + 99 - 100 + 101 - 101
        // 99 + -1 = 98

        a = 88;
        int b = 90;
        a = ++b - a-- + b-- + ++a - b-- - ++a + --b - b++;// TODO
        System.out.println(a);

        System.out.println(a);// ? 98 99 200

        // Assignemt Operator
        int c = 90;

        c = c + 1;
        c += 1;
        ++c;
        c++;
        System.out.println(c);

        c += 100; // c = c+100 Shorthand operation

        // Arithmetic + - * / %
        System.out.println(10 / 5);// quotient
        System.out.println(10 % 3);// 1 remainder
        System.out.println(3 % 10);// 3

        c = 100;
        c *= 2;

        // BitWise Operators
        // bitwise & [AND]
        System.out.println(10 & 2);// 10 to binary &[AND logical gate] 2 to binary

        // bitwise | [OR]
        System.out.println(10 | 2);// 10 to binary |[OR logical gate] 2 to binary

        // bitwise ~ [NOT]
        System.out.println(~10);// 10 to binary [NOT logical gate]

        // bitwise ^ [XOR]
        System.out.println(10 ^ 2);// 10 to binary ^[XORlogical gate] 2 to binary
        System.out.println(10 ^ 10);

        // bitwise left shift [<<]
        System.out.println(8 << 3);// 8*2*2*2 :: = 64

        // bitwise right shift [>>]
        System.out.println(8 >> 3);// 8/2/2/2 :: = 1


    }
}