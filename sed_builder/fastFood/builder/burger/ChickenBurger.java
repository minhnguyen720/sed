package fastFood.builder.burger;

import fastFood.concrete_classes.item.Burger;

public class ChickenBurger extends Burger {

    @Override
    public String name() {
        return "ChickenBurger";
    }

    @Override
    public float price() {
        return 10f;
    }
    
}
