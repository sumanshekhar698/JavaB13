package com.java.oops.polymorphism;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {

        Shape shape = new Shape();
        System.out.println(shape.areaOfCircle(10.0f));

        ShapePolymorphic sp = new ShapePolymorphic();
        System.out.println(sp.area(2.5f));
        System.out.println(sp.area(2));
        System.out.println(sp.area(2.0f, 6));

    }
}

class Shape {

    int areaOfSquare(int side) {
        return side * side;
    }

    int areaOfRectangle(int length, int breadth) {
        return length * breadth;
    }

    double areaOfCircle(float radius) {

        return Math.PI * radius * radius;

    }

    float areaOfTriangle(int base, float height) {
        return 0.5f * base * height;
    }

    float areaOfParallelogram(int base, float height) {
        return base * height;
    }
}

class ShapePolymorphic {

    // Polymorphism
    // 1. Compile Time Polymorphism
    // 2. Runtime Polmorphism

    // 1. no on prameters
    // 2. type of paramter
    // 3. posn of paramter

    // Method Overloading :: Compile Time Polymorphism
    int area(int side) {// area is overloaded
        return side * side;
    }

    int area(int length, int breadth) {
        return length * breadth;
    }

    double area(float radius) {

        return Math.PI * radius * radius;

    }

    float area(int base, float height) {
        return 0.5f * base * height;
    }

    float area(float height, int base) {
        return base * height;
    }
}
