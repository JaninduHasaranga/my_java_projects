import javax.swing.plaf.synth.SynthRadioButtonMenuItemUI;

abstract class product {

    private int id ;
    private String title ;
    private double price ;


     product(int id, String title, double price) {
        this.id = id;
        this.title = title;
        this.price = price;
    }

     int getId(){
         return id;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public void setId(int id) {
        this.id = id;

    }

    public void setPrice(double price) {
        this.price = price;

    }

    public void setTitle(String title) {
        this.title = title;
    }

    abstract String getType();


     public static void main(String[] args){

         physicalBook p1 = new physicalBook(1, "Mdoldoowa" , 250);
         EBook eb1 = new EBook(2, "Applied Statistic" , 1250);

         customer c1 = new customer("Janindu" , "dilanjanidu@gmail.com");
         customer c2 = new customer("Hasaranga" ,"hasarangajanidu05@gmaii.com");

         order A1 = new order(12 ,"2026.05.15");
         order A2 = new order(13,"2026.06.01");

         A1.displayInfo();

         A2.displayInfo();

         c1.displayCustomerInfo();




     }
}

class physicalBook extends product{

    physicalBook(int id, String title, double price){
        super(id , title , price);
    }



@Override
String getType(){
        return "PhysicalBook";
    }

}

class EBook extends product{

    EBook(int id, String title, double price){
        super(id , title,price);
    }

    @Override
    String getType(){
        return "EBook";

    }

}

class order {
    int id ;
    String date;

    public order(int id, String date) {
        this.id = id;
        this.date = date;
    }

    void displayInfo (){
        System.out.println("ID :"+id + "\nDate : "+ date);
    }

}

class customer {
    String name ;
    String email  ;

    customer(String name, String email){
        this.name = name ;
        this.email = email ;
    }

    void displayCustomerInfo(){
        System.out.println("Name : "+name +  "\nEmail: "+email) ;
    }


}










