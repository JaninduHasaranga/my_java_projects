package org.example;

import java.util.Scanner;

public class practice1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        double num1;
        double num2 ;
        char operator;
        double result =0;

        System.out.print("Enter the first number: ");
        num1 = sc.nextDouble();

        System.out.print("Enter an operator(+,-,*,/): ");
        operator = sc.next().charAt(0);

        System.out.print("Enter the secound number: ");
        num2 = sc.nextDouble();

        switch (operator){
            case '+' -> result = num1 + num2 ;
            case '-' -> result = num1- num2;
            case '*' -> result = num1 * num2 ;
            case '/' -> result = num1 /  num2;

            }
        System.out.printf(String.valueOf(result));



        sc.close();
    }
}
