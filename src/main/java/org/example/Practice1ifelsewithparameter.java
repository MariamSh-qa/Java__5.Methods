package org.example;

public class Practice1ifelsewithparameter {
    static void main(String[] args) {
        System.out.println(takeALoan(20));

    }
    static String takeALoan(int age) {
        if (age < 20) {
            return "cant take loan";}
        else if (age >= 20 && age < 65) {
            return "can take loan";
        }
        else {
            return "after 65 cant take loan";
        }
    }
}