
import java.util.ArrayList;
import java.util.List;

public class Automat {
    List <Product> listProduct = new ArrayList<>();
    
    public void initProduct (List <Product> myList){
        listProduct = myList;
    }


public Product getProduct (String name) {
    for (Product product : listProduct) {
        if (product.getName().equals(name)) {
            return product;
        }
    }
    return null;
     
}

}