package tiemBanhMi;

import tiemBanhMi.Options.*;

public class BanhMi {
    private BreadType breadType;
    private OrderType orderType;
    private SauceType sauceType;
    private VegetableType vegetableType;    

    public BanhMi(BreadType breadType, OrderType orderType, SauceType sauceType, VegetableType vegetableType) {
        this.breadType = breadType;
        this.orderType = orderType;
        this.sauceType = sauceType;
        this. vegetableType = vegetableType;
    }

    @Override
    public String toString() {
        return "ORDER: [" + breadType + ", " + orderType + ", " + sauceType + ", " + vegetableType + "]";
    }
}
