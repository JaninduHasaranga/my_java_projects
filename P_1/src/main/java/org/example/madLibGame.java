package org.example;
import java.util.Scanner;
public class madLibGame {
    public static void main(String[] args){

        // MAD LIBS GAME

        Scanner sc = new Scanner(System.in);

        String adjective1;
        String nonun1;
        String  adjective2;
        String verb1;
        String adective3;

        System.out.print("Enter an adjective (description): ");
        adjective1 = sc.nextLine();
        System.out.print("Enter a noun (animal or person : ");
        nonun1 = sc.nextLine();
        System.out.print("Enter an adjective(description) : ");
        adjective2 = sc.nextLine();
        System.out.print("Enter a verb end with -ing(action): ");
        verb1 = sc.nextLine();
        System.out.print("Enter an adjective(description) :");
        adective3 = sc.nextLine();


        System.out.println("\nToday i went to a "+adjective1+" zoo");
        System.out.println("in an exhibit , I saw a "+nonun1+ ".");
        System.out.println(nonun1+ "was "+adjective2+" and "+verb1+"!");
        System.out.println("I was "+adective3+"!");




        sc.close();




    }

}
