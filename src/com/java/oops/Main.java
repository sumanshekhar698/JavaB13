package com.java.oops;

public class Main {
    public static void main(String[] args) {
        Car harrier = new Car();

        int x;
        // System.out.println(x);
        System.out.println(harrier.color);
        System.out.println(harrier.model);
        System.out.println(harrier.mielage);

        harrier.color = "Black";
        harrier.model ="Dark Edition";


        System.out.println();
        System.out.println(harrier.color);
        System.out.println(harrier.model);
        System.out.println(harrier.mielage);


        Car defender = new Car();
        defender.mielage = 5.2f;
        System.out.println(defender.mielage);

        Car ferrari = null;
        System.out.println(ferrari);

        Car fortuner = harrier;
        defender = null;
        new Car();
        System.out.println(harrier);
        System.out.println(harrier.hashCode());
        harrier.move();


        // defender.move();
        System.out.println(defender);
        System.out.println(ferrari);

        // System.gc();//Explicit GC call

        Car miniCoper = new Car("Green","Mini Cooper", 10.2f);
        

        




    }
}
