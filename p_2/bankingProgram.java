import java.util.Scanner;

public class bankingProgram {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args){


        double balance = 0 ;
        boolean isRunning = true ;
        int choice ;

        while (isRunning){
            System.out.println("*** SAMPATH BANK ***");

            System.out.println("1. Show balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. EXIT");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice){
                case 1 -> showBalance(balance);
                case 2 -> balance = balance + deposit();
                case 3 -> balance = balance - withdraw(balance);
                case 4 -> isRunning = false;
                default -> System.out.println("Invalid choice");
            }
        }




    }

    static void showBalance (double balance){
        System.out.println("$"+balance);
    }

    static double deposit(){
        double amount ;
        System.out.print("Enter an amount to be deposit: ");

        amount = sc.nextDouble();

        if (amount< 0 ){
            System.out.println("Amount can't be negative!!");
            return 0 ;
        }
        else return amount ;


    }


    static double withdraw(double balance ){

        double amount ;
        System.out.print("Enter the amount to be withdraw ");
        amount = sc.nextDouble() ;

        if (amount > balance){
            System.out.println("Insufficient Funds");

            return 0 ;
        } else if (amount<0) {
            System.out.println("Amount can't be negative");
            return 0;

        }else {
            return amount;

        }


    }
}


