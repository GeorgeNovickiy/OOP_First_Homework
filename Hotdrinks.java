import java.util.GregorianCalendar;

public class Hotdrinks extends Beverage {
    
    private double temperature;

    public Hotdrinks (String name, int price, int quantity, GregorianCalendar bestBefore, double volume,int temperature){
        super(name, price, quantity, bestBefore, volume);
        this.temperature = temperature;
    }

    public double getTemperature (){
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    @Override
    public String infoProduct() {
        return "Hotbeverage" + toString() + ", temperature=" + temperature + "]";
    }
}
