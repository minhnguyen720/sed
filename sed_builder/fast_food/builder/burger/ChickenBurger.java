package fast_food.builder.burger;

import fast_food.concrete_classes.item.Burger;

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
