package org.example;

import java.util.Random;

public class numberGenerate {
    public static void main(String[] args){

        Random random = new Random();

        int number1;
        int number2;
        int number3;

        double number4;
        boolean isHead;

        number1 = random.nextInt(1,6);
        number2 = random.nextInt(1,10);
        number3 = random.nextInt(1,21);
        number4 = random.nextDouble();  // Grenerate a number between 0 & 1
        isHead = random.nextBoolean();  // Give true false for the output

        if (isHead){
            System.out.println("HEADS");
        }else{
            System.out.println("TAILS");
        }


        System.out.println(number1);
        System.out.println(number2);
        System.out.println(number3);
        System.out.println(number4);
       // System.out.println(isHead);



    }
}
