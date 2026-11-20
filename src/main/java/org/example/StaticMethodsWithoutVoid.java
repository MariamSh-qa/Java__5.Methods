package org.example;

public class StaticMethodsWithoutVoid {
    static void main(String[] args) {
        int sum = sum(10, 5);
        System.out.println(sum);

        int sum1 = sum(20, 30);
        System.out.println(sum1);
    }

    static int/*what to return. int*/ sum(int a, int b) {
        int z = a + b;
        return z;
    }






}
