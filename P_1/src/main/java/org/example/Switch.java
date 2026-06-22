package org.example;
import java.util.Scanner;
public class Switch {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the day: ");
        String day = sc.nextLine();




        switch (day){
            case "Monday" -> System.out.println("It is a weekday");
            case "Tuesday" -> System.out.println("It is a weekday");
            case "Wednesday" -> System.out.println("It is a weekday");
            case "Thursday" -> System.out.println("It is a weekday");
            case "Friday" -> System.out.println("It is a weekday");
            case "Saturday" -> System.out.println("It is a weekend");
            case "Sunday" -> System.out.println("It is a weekend");
            default -> System.out.println(day +" is not a day");

        }
    }
}
