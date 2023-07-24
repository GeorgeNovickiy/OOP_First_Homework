import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;


public class Program {
    public static void main(String[] args) {
        Product product1 = new Food("Twix", 80, 10, new GregorianCalendar(2023, 10,10), 75.1);
        Product product2 = new Food("Mars", 90, 50, new GregorianCalendar(2023, 10,10), 85.2);
        Product product3 = new Beverage("Cola", 75, 35, new GregorianCalendar(2023, 10,10), 0.5);
        Product product4 = new Beverage("Fanta", 65, 25, new GregorianCalendar(2023, 10,10), 0.75);
        Product product5 = new Hotdrinks("Tea", 65, 25, new GregorianCalendar(2023, 10,10), 0.75, 80);


        Automat list1 = new Automat();
        Automathotdrinks list2 = new Automathotdrinks();
        List<Product> myList1 = new ArrayList<>();
        List<Product> myList2 = new ArrayList<>();

        myList1.add(product1);
        myList1.add(product2);
        myList1.add(product3);
        myList1.add(product4);
        myList2.add(product5);


        list1.initProduct(myList1);
        list2.initProduct(myList2);


        String name1 = "Twix";
        String name2 = "Mars";
        String name3 = "Cola";
        String name4 = "Fanta";
        String name5 = "Tea";


        System.out.println(list1.getProduct(name1).infoProduct()); 
        System.out.println(list1.getProduct(name2).infoProduct()); 
        System.out.println(list1.getProduct(name3).infoProduct()); 
        System.out.println(list1.getProduct(name4).infoProduct()); 

        System.out.println(list2.getProduct(name5, 0.75, 80).infoProduct()); 


    }
}
