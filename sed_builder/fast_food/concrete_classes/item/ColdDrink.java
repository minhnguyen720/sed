package fast_food.concrete_classes.item;

import fast_food.Interfaces.Item;
import fast_food.Interfaces.Packing;
import fast_food.concrete_classes.packing.Bottle;

public abstract class ColdDrink implements Item {
    
    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();

}
