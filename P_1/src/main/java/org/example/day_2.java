package org.example;
import java.util.Scanner;

public class day_2 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter yor name: ");
        String name = sc.nextLine();

        System.out.print("Enter your age:");
        int age = sc.nextInt();

        System.out.print("What is your GPA:");
        double gpa = sc.nextDouble();

        System.out.print("Are you a student ? ");
        boolean isStudent = sc.nextBoolean();



        System.out.println("My name is "+name);
        System.out.println("My age is "+age+ " Years old" );
        System.out.println("My GPA is "+gpa);

        if (isStudent){
            System.out.println("You are enrolled as a student");
        }else {
            System.out.println("You are not a student");
        }








        sc.close();




    }
}
