package org.example;

public class StaticMethodsWithoutParameter {
    public static void main(String[] args) {

        //No Parameter Methods.

        printFirstName(); //calling this Method which i created below. This method is static so i can call it without creating an object of the class//

    }
    static void printFirstName() {
    String name = "Salome";
        System.out.println("Hello  " + name);
        printLastName();  //im calling this method inside my method.
    }

    static void printLastName(){
        String lastName = "alba";
        System.out.println("My surname is  " + lastName);
        //printLastName(); // it wil print without stop.
    }
}
