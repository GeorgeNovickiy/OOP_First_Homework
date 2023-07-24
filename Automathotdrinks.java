import java.util.ArrayList;
import java.util.List;

public class Automathotdrinks extends Automat {
    
    List <Hotdrinks> listHotdrinks = new ArrayList<>();

    public void initHotDrink (List <Hotdrinks> myList){
        listHotdrinks = myList;
    }

    @Override
    public Hotdrinks getProduct (String name, double volume, double temperature) {
        for (Hotdrinks hotdrinks : listHotdrinks) {
            if (hotdrinks.getName().equals(name) && hotdrinks.getVolume()==volume && hotdrinks.getTemperature()==temperature) {
                return hotdrinks;
            }
        }
        return null;
         
    }
}
