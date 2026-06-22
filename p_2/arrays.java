import java.util.Arrays;
import java.util.Scanner;

public class arrays {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        String[] fruits = {"Apple" , "Orange" , "Banana" , "Mango "};

        //fruit[0] = "Pineapple";
        //int numOfFruits = fruit.length ;

       /* for (int i = 0 ; i < fruit.length; i++){
            System.out.println(fruit[i] + " ");

        }*/

        Arrays.sort(fruits);

        for (String fruit : fruits ){

            System.out.println(fruit);

        }

    }
}
