package org.example;

public class Overloading {

    static void main(String[] args) {

        //Method Overloading = Same method name + Different parameters.

        sum(5, 10);
        sum(5, 10, 15);
        sum(5.5, 10.5);
    }

    static void sum(int x, int y) {
        System.out.println(x + y);
    }

    static void sum(int x, int y, int z) {
        System.out.println(x + y + z);
    }

    static void sum(double x, double y) {
        System.out.println(x + y);
    }
}