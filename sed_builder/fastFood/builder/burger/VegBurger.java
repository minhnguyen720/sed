package fastFood.builder.burger;

import fastFood.concrete_classes.item.Burger;

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
