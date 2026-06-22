public class methods {

    static void greeting (String name  , int age){
        System.out.println("Happy Birthday to you!");
        System.out.println("Happy Birthday to you!");
        System.out.println("Happy Birthday to dear "+name);
        System.out.println("Happy Birthday to you!\n");

        System.out.println("You are now " +age + " years old " );

    }

    static int add (int num_1  , int num_2){
        return (num_1+num_2);



    }


    public static void main(String[] args){

        // method is a block of reusable code that is executed when called ()

        String name = "Janindu";
        int age = 24;

        int num_1 ;
        int num_2 ;

        int result = add(10,2);
        System.out.println(result);

        greeting(name,age);




    }



}
