package org.example;

public class printf {
    public static   void main(String[] args){

        String name = "Jani";
        char firstLetter = 'J';
        int age = 24;
        double height = 170.5;
        boolean isEmployed = true;

        
        System.out.printf("Hello %s",name);
        System.out.printf("\nYour name start with a %c",firstLetter);
        System.out.printf("\nYou are %d years old ",age   );
        System.out.printf("\nYou are %.1f inches tall ",height);
        System.out.printf("\n%S is %d years old ", name , age);
    }
}
