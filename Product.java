
import java.util.Calendar;
import java.util.GregorianCalendar;

// Реализуйте класс Товар, содержащий данные о товаре, 
// и ТорговыйАвтомат, содержащий в себе методы initProducts (List <Product>) 
// сохраняющий в себе список исходных продуктов и getProduct(String name)

public abstract class Product{

    private String name;
    private int price;
    private int quantity;
    private GregorianCalendar bestBefore; 

    public Product(String name, int price, int quantity, GregorianCalendar bestBefore) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.bestBefore = bestBefore;
    }

    public String getName (){
        return name;
    }

    public int getPrice (){
        return price;
    }

    public GregorianCalendar getBestBefore() {
        return bestBefore;
    }

    public int getQuantity() {
        return quantity;
    }
    public void setBestBefore(GregorianCalendar bestBefore) {
        this.bestBefore = bestBefore;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String infoProduct() {
        return toString();
    }

    @Override
    public String toString() {
        return "[name=" + name + ", price=" + price + ", quantity=" + quantity + ", bestBefore=" 
        + bestBefore.get(Calendar.YEAR) + "/" + bestBefore.get(Calendar.MONTH); 
    }
   
}