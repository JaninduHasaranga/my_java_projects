package org.example;


abstract class HospitalMember{
    private String name;
    private int id;

    public HospitalMember(String name , int id){
        this.name = name ;
        this.id = id ;

    }
    public String getName(){
        return name ;
    }

    public int getId(){
        return id;
    }
    abstract void displayRole();


}
class Doctor extends HospitalMember{
    private  String specialization;
    public Doctor(String name , int id , String specialization){
        super (name , id);
        this.specialization = specialization;
    }
    public String getSpecialization(){
        return specialization;
    }
    @Override
    void displayRole(){
        System.out.println("Role: Doctor");
    }
    void displayDoctorDetails(){
        System.out.println("\nDoctor Name: "+getName());
        System.out.println("Doctor ID: "+getId());
        System.out.println("Specialization: "+specialization);
    }
}

class Patient extends HospitalMember{
    private String disease;
    public Patient(String name , int id , String disease){
        super(name,id);
        this.disease = disease;
    }
    public String getDisease(){
        return disease;
    }
    @Override
    void displayRole(){
        System.out.println("\nRole: Patient");
    }
    void displayPatientDetails(){
        System.out.println("\nPatient Name: "+getName());
        System.out.println("Patient ID: "+getId());
        System.out.println("Disease: "+disease);
    }
}

public class labSheet_2_Q1 {
    public static void main(String[] args){
        HospitalMember h1 = new Doctor("Kamal",101 , "Cardiology");
        HospitalMember h2 = new Patient("Nimal" , 201 , "Fever");

        h1.displayRole();
        h2.displayRole();

        Doctor d = (Doctor)h1;
        Patient p = (Patient)h2;

        d.displayDoctorDetails();
        p.displayPatientDetails();




    }
}
