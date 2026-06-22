package org.example;

import java.util.Scanner;


public class substring {
    public static void main(String[] args){

        // Substring() = A method used to extract a portion of a string

        Scanner sc = new Scanner(System.in);




        String email;

        System.out.print("Enter your email: " );
        email = sc.nextLine();

        if (email.contains("@")){
            String username = email.substring(0, email.indexOf("@"));   // emai.indexOf = fine that character in String
            String domain = email.substring(email.indexOf("@")+1);



            System.out.println(username);
            System.out.println(domain);

        }else {
            System.out.println("Email must contain the @");
        }




        sc.close();
    }

}
