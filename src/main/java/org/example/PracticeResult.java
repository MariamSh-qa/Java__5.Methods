package org.example;

public class PracticeResult {
    static void main(String[] args) {
        System.out.println(takeALoan(20));
    }

    static String takeALoan(int age) {

        String result;
        if (age < 20) {
            result =  "cant take loan";}
        else if (age >= 20 && age < 65) {
            result =  "can take loan";
        }
        else {
            result = "after 65 cant take loan";
        }
        return result;
    }

}
