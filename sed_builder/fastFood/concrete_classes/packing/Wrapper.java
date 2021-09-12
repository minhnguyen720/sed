package fastFood.concrete_classes.packing;

import fastFood.Interfaces.Packing;

public class Wrapper implements Packing {

    @Override
    public String pack() {
        return "Wrapper";
    }
}
