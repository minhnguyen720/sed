package fast_food.builder.cold_drink;

import fast_food.concrete_classes.item.ColdDrink;

public class Coke extends ColdDrink {

    @Override
    public String name() {
        return "Coke";
    }

    @Override
    public float price() {
        return 2f;
    }
    
}
