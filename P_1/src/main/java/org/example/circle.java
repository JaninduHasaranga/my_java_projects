package org.example;
import java.util.Scanner;
public class circle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        double radius;
        double circumference;
        double area;
        double volume;

        System.out.print("Enter the radius : ");
        radius = sc.nextDouble();

        circumference = 2*Math.PI * radius;
        area = Math.PI * Math.pow(radius, 2);
        volume = (4.0/3.0) * Math.PI * Math.pow(radius,3);

        System.out.printf("Circumference is = %.1fcm ",circumference);
        System.out.printf("\nArea is = %.1fcm²",area);
        System.out.printf("\nVolume is = %.1fcm³",volume);

    }
}
