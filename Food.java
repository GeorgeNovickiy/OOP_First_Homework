import java.util.GregorianCalendar;

public class Food extends Product {
    
    private double weight;

    public Food(String name, int price, int quantity, GregorianCalendar bestBefore, double weight) {
        super(name, price, quantity, bestBefore);
        this.weight = weight;
    }

        public double getWeight(){
            return weight;
        }
    
        public void setWeight(double weight) {
            this.weight = weight;
        }
        
        @Override
        public String infoProduct() {
            return "food" + toString() + ", weight=" + weight + "]";
        }
       
    }

