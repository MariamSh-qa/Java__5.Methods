package org.example;

import java.util.Locale;

public class Null {
    static void main(String[] args) {

        //will not print anything, because null is nothing.
        //null - can not use in methods
        String name = null;
        name.toUpperCase();
        System.out.println(name.length());



        String name1 = null;
        System.out.println("Your name is " + name1);
    }
}
