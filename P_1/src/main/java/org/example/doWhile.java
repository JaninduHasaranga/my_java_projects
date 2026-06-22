package org.example;

import java.util.Scanner;

public class doWhile {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number =0 ;

        do {
            System.out.print("Enter a number between 1-10: ");
            number = sc.nextInt();

        }while (number < 1 || number>10);
        System.out.println("you pick "+number);







        sc.close();

    }

}
