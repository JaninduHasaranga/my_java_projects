package org.example;
import java.util.Scanner;


public class ShoppingCart {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        char currency = '$';



        System.out.print("What is would you like? :");
        String item = sc.nextLine();
        System.out.print("WHat is the price for each? :");
        double price = sc.nextDouble();
        System.out.print("How mmany would you want? :");
        int count = sc.nextInt();

        double total = price*count;


        System.out.println("\nYou odered item is "+item);
        System.out.println("One pizza is "+price+""+ currency);
        System.out.println("Total = "+total +""+currency);





        sc.close();

    }
}
