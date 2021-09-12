package tiemBanhMi;

import tiemBanhMi.Options.*;

public interface iBuilder {    
    BanhMiBuilder addBreadType(BreadType type);

    BanhMiBuilder addOrderType(OrderType type);

    BanhMiBuilder addSauceType(SauceType type);

    BanhMiBuilder addVegetableType(VegetableType type);

    BanhMi build();
}
