package fastFood.builder.cold_drink;

import fastFood.concrete_classes.item.ColdDrink;

public class Pepsi extends ColdDrink {

    @Override
    public String name() {
        return "Pepsi";
    }

    @Override
    public float price() {
        return 2f;
    }
    
}
