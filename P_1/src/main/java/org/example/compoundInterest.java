package org.example;
import java.util.Scanner;
public class compoundInterest {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        double principal ;
        double rate ;
        int time;
        int years;
        double amount;

        System.out.print("Enter the principal amount ");
        principal = sc.nextDouble();

        System.out.print("Enter the interest rate ");
        rate = sc.nextDouble() / 100 ;

        System.out.print("Enter the # of times compounded per year ");
        time = sc.nextInt();

        System.out.print("Enter the number of years ");
        years = sc.nextInt();

        amount = principal * Math.pow(1+rate/time,time*years);

        System.out.printf("The amount after %d years is %.2f ",years,amount);



        sc.close();

    }
}
