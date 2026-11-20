package org.example;

public class Practice1ifelse {
    static void main(String[] args) {
        takeALoan(20);
        takeALoan(18);
        takeALoan(40);
        takeALoan(66);
        //void-იან მეთოდებს არ უნდა sout, რადგან ის ისედაც ბეჭდავს.

    }
    static void takeALoan(int age) {
        if (age < 20) {
            System.out.println("cant take loan");}
            else if (age >= 20 && age < 65) {
                System.out.println("can take loan");
            }
            else {
            System.out.println("after 65 cant take loan");
        }
            }
        }