package org.example;

import java.util.Scanner;

public class forLoop {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter how many times you want to loop : ");
        int max = sc.nextInt();

        for (int i = 0 ; i<max ; i++ ){
            System.out.println(i);
        }
        sc.close();












    }
}
