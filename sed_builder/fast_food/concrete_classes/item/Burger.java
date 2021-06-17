package fast_food.concrete_classes.item;

import fast_food.Interfaces.Item;
import fast_food.Interfaces.Packing;
import fast_food.concrete_classes.packing.Wrapper;

public abstract class Burger implements Item {
    
    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
