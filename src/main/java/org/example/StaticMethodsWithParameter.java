package org.example;

public class StaticMethodsWithParameter {
    public  static void main() {

        printFirstName1("Davit", 40, 99);
        printFirstName1("Mariam", 18, 100);
    }


    //I created method with string and int parameters.
        static void printFirstName1 (String name, int age, double score) {
            System.out.println("Hello  " + name + " you are " + age + " years old and " + "Your score is "+ score) ;

            //why method is good? if i want to add for example score of student, i can just add this in this method.
            //void - ar aqvs rame mnishvneloba, ubralod bechdavs.
    }
}
