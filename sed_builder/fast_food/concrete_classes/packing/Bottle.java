package fast_food.concrete_classes.packing;

import fast_food.Interfaces.Packing;

public class Bottle implements Packing {
    @Override
    public String pack() {
        return "Bottle";
    }
    
}
