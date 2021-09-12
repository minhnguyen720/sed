package tiemBanhMi;

import tiemBanhMi.Options.*;

public class Client {
    public static void main(String[] args) {
        var banhMi = new BanhMiBuilder()
        .addBreadType(BreadType.OMELETTE)
        .addOrderType(OrderType.TAKE_AWAY)
        .addSauceType(SauceType.KETCHUP)
        .addVegetableType(VegetableType.SALAD)
        .build();

        System.out.println(banhMi);
    }
}
