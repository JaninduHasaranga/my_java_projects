package org.example;
import java.util.Scanner;
public class weightConverter {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        double weight ;
        double newWeight;
        int choice;

        System.out.println("Weight Conversion Program");
        System.out.println("1: Convert lbs to kgs");
        System.out.println("2: Convert kgs to lbs");

        System.out.print("Choose an Option: ");
        choice = sc.nextInt();

        if (choice == 1 ){
            System.out.print("Enter the weight in lbs : ");
            weight = sc.nextDouble();
            newWeight = weight*0.453592;
            System.out.printf("The new weight is %.2fkg",newWeight);
        }

        else if (choice == 2 ){
            System.out.print("Enter the weight in kgs : ");
            weight = sc.nextDouble();
            newWeight = weight*2.20462;
            System.out.print("The new weight is "+newWeight);
        }
        else {
            System.out.println("Invalid choic");
        }




        sc.close();




    }
}
