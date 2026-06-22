package org.example;
import javax.sound.sampled.AudioSystem;
import java.util.Scanner;
public class statements {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int age;
        String name ;
        boolean isStudent;

        System.out.print("Enate your Name: ");
        name = sc.nextLine();

        System.out.print("Enter your age: ");
        age = sc.nextInt();

        System.out.print("Are you a student? (True/false ");
        isStudent = sc.nextBoolean();

        // Group 1

        if (name == ""){
            System.out.println("You did't enter your name!! ");

        }else {
            System.out.println("Hello "+name + "!");
        }


        // group 2
        if (age >= 65){

            System.out.println("You are an senior");

        }else if (age >=18){
            System.out.println("You are a adult");

        }else if (age<0) {
            System.out.println("You are not born yet!!");

        } else if (age==0) {
            System.out.println("You are a baby");

        } else if (age<18) {
            System.out.println("You are a child");

        }

        // Group 3

        if (isStudent == true){
            System.out.println("You are a student");
            
        }else {
            System.out.println("You are not a students");
        }

        sc.close();
    }
}
