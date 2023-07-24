import java.util.GregorianCalendar;

public class Beverage extends Product {
    
    private double volume;


    public Beverage(String name, int price, int quantity, GregorianCalendar bestBefore, double volume) {
        super(name, price, quantity, bestBefore);
        this.volume = volume;
    }

    public double getVolume (){
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }
       
    @Override
    public String infoProduct() {
        return "beverage" + toString() + ", volume=" + volume + "]";
    }
}
