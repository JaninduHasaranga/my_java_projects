package org.example;

import java.util.Scanner;

public class whileLoop {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

       String response = "";
       int age = 0 ;

       /* while (!response.equals("Q")){
            System.out.println("you are playing a game");
            System.out.print("Press Q to quit: ");
            response = sc.next().toUpperCase();

        }*/





        //System.out.println("You have quit the game ");

        System.out.print("Enter your age: ");
        age = sc.nextInt();


        while (age <0){
                System.out.println("Your age can't be negative");
                System.out.print("Enter your age: ");
                age = sc.nextInt();

            }
        System.out.println("You are "+age+" years old");


        sc.close();
    }
}
