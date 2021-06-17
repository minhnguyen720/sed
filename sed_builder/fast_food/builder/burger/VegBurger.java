package fast_food.builder.burger;

import fast_food.concrete_classes.item.Burger;

public class VegBurger extends Burger {

    @Override
    public String name() {
        return "VegBurger";
    }

    @Override
    public float price() {
        return 5.0f;
    }

    
}
