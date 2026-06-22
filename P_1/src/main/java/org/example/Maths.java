package org.example;

import java.io.DataOutput;

public class Maths {
    public static void main(String[] args){

        System.out.println(Math.PI);
        System.out.println(Math.E);

        double result;

        result = Math.pow(2,3);    // get the power of a number---> (2,3) = 2^3
        result = Math.abs(-5);     // Absolute Value
        result = Math.sqrt(9);    // squareroot
        result = Math.round(12.56);  // Round the numbers
        result = Math.ceil(12.12);   // Rouned up
        result = Math.floor(12.88);   // rouned down
        result = Math.max(20,12);     // find to maximum value

        System.out.println(result);

    }
}
