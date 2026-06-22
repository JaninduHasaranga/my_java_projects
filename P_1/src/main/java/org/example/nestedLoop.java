package org.example;

import java.util.Scanner;

public class nestedLoop {

    public static void main(String[] args) {

        int rows;
        int columns;
        char symbol;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter # of rows: ");
        rows = sc.nextInt();

        System.out.print("Enter # of columns: ");
        columns = sc.nextInt();

        System.out.print("Enter the symbol: ");
        symbol = sc.next().charAt(0);

        for (int i = 0; i < rows; i++) {

            for (int j = i; j < columns; j++) {
                System.out.print(symbol);
            }

            System.out.println();
        }

        sc.close();
    }
}