package com.java.oops;

//Designing
class Car {

    // has :: instance/objects variables
    String color;
    String model;
    float mielage;

    // does fn/methods
    void move() {
        System.out.println("Car is moving with a mielage " + mielage);
        System.out.println(this);
    }

    // non parameters constructor
    Car() {// Constructors
           System.out.println("Car() called");
    }

    // parameterized Constructor
    public Car(String color, String model, float mielage) {
        // int x = 0; // chaining should be the 1st statement !!
        this(mielage);//constructor chaining

        System.out.println("Car(String color, String model, float mielage) called");
        this.color = color;//shadow problem
        this.model = model;
        this.mielage = mielage;
        
    }

    public Car(float mielage) {
        System.out.println("Car(float mielage) called");

        this.mielage = mielage;
        
    }



}