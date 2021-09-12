package fastFood.concrete_classes.packing;

import fastFood.Interfaces.Packing;

public class Bottle implements Packing {
    @Override
    public String pack() {
        return "Bottle";
    }
    
}
