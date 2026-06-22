abstract class ExAbsClass {


    abstract void calculateSalary();


    void show() {
        System.out.println("Employee details");
    }
}


class FullTimeEmployee extends ExAbsClass {


    void calculateSalary() {
        System.out.println("Salary calculated");
    }


    public static void main(String[] args) {


        FullTimeEmployee obj = new FullTimeEmployee();


        obj.calculateSalary();
        obj.show();
    }
}