package fastFood.concrete_classes.item;

import fastFood.Interfaces.Item;
import fastFood.Interfaces.Packing;
import fastFood.concrete_classes.packing.Wrapper;

public abstract class Burger implements Item {
    
    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
