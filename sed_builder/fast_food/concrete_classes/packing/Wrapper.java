package fast_food.concrete_classes.packing;

import fast_food.Interfaces.Packing;

public class Wrapper implements Packing {

    @Override
    public String pack() {
        return "Wrapper";
    }
}
