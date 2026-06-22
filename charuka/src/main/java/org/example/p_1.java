class ExSuper{
    String name="Parent Name";

    void display(){
        System.out.println("Parent class name:"+name);
    }
}
class Teacher extends ExSuper {
    String name = "Teacher Name";

    void display() {
        super.display();
        System.out.println("Child class name:" + name);
    }


    public static void main(String[] args) {
        Teacher t = new Teacher();
        t.display();
    }
}
