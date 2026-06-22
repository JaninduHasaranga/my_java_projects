package org.example;

import javax.swing.*;

public class logicalOperators {
    public static void main(String[] args) {

        // && = AND

        // || = OR

        // ! NOT

        double temp = 35;
        boolean isSunny = false;

        if (temp <= 30 && temp >= 0 && isSunny) {
            System.out.println("The weather is good");
            System.out.println("It is SUNNY outside");
        } else if (temp <= 30 && temp >= 0 && !isSunny) {
            System.out.println("The weathere is good");
            System.out.println("It is CLOUDY outside");
        } else if (temp > 30 || temp < 0 ) {
            System.out.println("The wreather is bad");

        }


    }

}
