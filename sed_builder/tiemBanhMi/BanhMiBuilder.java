package tiemBanhMi;

import tiemBanhMi.Options.*;

public class BanhMiBuilder implements iBuilder {
    private BreadType breadType;
    private OrderType orderType;
    private SauceType sauceType;
    private VegetableType vegetableType;
    @Override
    public BanhMiBuilder addBreadType(BreadType type) {
        breadType = type;
        return this;
    }
    @Override
    public BanhMiBuilder addOrderType(OrderType type) {
        orderType = type;
        return this;
    }
    @Override
    public BanhMiBuilder addSauceType(SauceType type) {
        sauceType = type;
        return this;
    }
    @Override
    public BanhMiBuilder addVegetableType(VegetableType type) {
        vegetableType = type;
        return this;
    }
    @Override
    public BanhMi build() {
        return new BanhMi(breadType,orderType,sauceType,vegetableType);
    }
    
    
}
