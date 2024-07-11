package com.java.basics;

public class PrimitiveVariables {
    public static void main(String[] args) {
        // 1. numercial Data / Integer Data
        // a bit can have 0 or 1 [binary data]

        // Formula for calculating a integer range in Java
        // -2^(n-1) to 2^(n-1) - 1

        byte a = 8;// 1 byte = 8 bits
        short b = 78;// 2 bytes
        int c = -99999;// 4 bytes
        long d = 8978;// 8 bytes
        long phoneNumber = 9006567388L;

        // byte --> short --> int --> long

        // b = c; // 2 bytes <<<< 4 bytes
        // b = (byte)c;// -32768 to 32767
        System.out.println(b);

        // 2. decimal Numbers / Floating Points
        float pi = 3.14159F;// 4 bytes
        double valueOfPi = 3.14159; // 8 bytes

        // 4 bytes << 8 bytes
        // 4 bytes << 4 bytes

        // 3. boolean data
        boolean isJavaEasy = false;
        isJavaEasy = true; // 1 bit

        // 4. characetrs Data
        char ch = 'A';// UTF16: 16 bits

        // Special Cases and Examples
        float test = phoneNumber;// * float {IEEE} [4 bytes] 9006567000 <<< long {2s complement} [8 bytes]
                                 // 9006567388L
        System.out.println(test);// 9.006567E9 = 9.006567 * 10^9 = 9006567000

        // Hexadecimal [0 - 9 AND A-F]
        // Decimal [0 - 9]
        // Octal [0 - 7]
        // Binary [0,1]

        int oct = 07542;// 7542 ---> octal
        System.out.println(oct);// 3938

        int bin = 0B01010100;
        System.out.println(bin);// 84

        long hex = 0X908ABF7;
        System.out.println(hex);// 151563255

    }

}
