package fastFood.builder.cold_drink;

import fastFood.concrete_classes.item.ColdDrink;

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
