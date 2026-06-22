package org.example;
import java.util.Scanner;
public class areaOfRectangle {
    public static void main(String[] args){


        // Area

        double width = 0;
        double hight = 0;
        double area = 0;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the width: ");
        width = sc.nextDouble();
        System.out.print("Enter the hight: ");
        hight = sc.nextDouble();

        area = width * hight ;

        System.out.println("The Area is "+area+"cm²");



        sc.close();







    }
}
