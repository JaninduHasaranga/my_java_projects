package org.example;
import java.util.Scanner;
public class hypotenuseOfTrangel {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);


        double leg1 ;
        double leg2 ;

        double hypotenuse;

        System.out.print("Enter the side of Leg 1: ");
        leg1 = sc.nextDouble();

        System.out.print("Enter the side of Leg 2: ");
        leg2 = sc.nextDouble();

        hypotenuse = Math.sqrt(Math.pow(leg1 , 2)+ Math.pow(leg2 , 2));

        System.out.println("The Hypotenuse is = "+hypotenuse+ "cm");






        sc.close();




    }
}
