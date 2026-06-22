package org.example;


import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;

abstract class Vehicle {
    private String vehicleNumber;
    private String brand ;

    public Vehicle(String vehicleNumber, String brand){
        this.vehicleNumber =vehicleNumber;
        this.brand = brand ;
    }

    public String getVehicleNumber(){
        return vehicleNumber;
    }
    public String getBrand(){
        return brand;
    }
    abstract int calculateRent(int days);
}

class Car extends Vehicle{
    public Car(String vehicleNumber , String brand){
        super(vehicleNumber,brand);
    }

    @Override
    int calculateRent(int days){
        return days * 5000 ;
    }
    void displayCarDetails(int days){
        int total = calculateRent(days);

        System.out.println("\nCar Number: "+getVehicleNumber());
        System.out.println("Brand: "+getBrand());
        System.out.println("Total Rent: "+total);
    }

}

class Bike extends Vehicle{

    public Bike(String vehicleNumber , String brand){
        super(vehicleNumber, brand);
    }

    @Override
    int calculateRent(int days){
        return days * 2000;
    }

    void displayBikeDetails(int days){
        int total = calculateRent(days);

        System.out.println("\nBike Number: "+getVehicleNumber());
        System.out.println("Brand: "+getBrand());
        System.out.println("Total Rent:" +total);
    }
}

public class labSheet_2_Q2 {
    public static void main(String[] args){
        Vehicle v1 = new Car("CAR101", "Toyota");
        Vehicle v2 = new Bike("BIKE201","Honda");

        System.out.println("Runtime polymorphism");

        System.out.println("Car Rent: "+v1.calculateRent(3));
        System.out.println("Bike Rent: "+v2.calculateRent(3));


        Car c = (Car) v1;
        Bike b = (Bike) v2 ;


        c.displayCarDetails(3);
        b.displayBikeDetails(3);
    }


}
