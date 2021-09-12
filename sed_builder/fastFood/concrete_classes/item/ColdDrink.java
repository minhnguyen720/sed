package fastFood.concrete_classes.item;

import fastFood.Interfaces.Item;
import fastFood.Interfaces.Packing;
import fastFood.concrete_classes.packing.Bottle;

public abstract class ColdDrink implements Item {
    
    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();

}
