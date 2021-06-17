package fast_food.builder;

import fast_food.builder.burger.ChickenBurger;
import fast_food.builder.burger.VegBurger;
import fast_food.builder.cold_drink.Coke;
import fast_food.builder.cold_drink.Pepsi;

public class MealBuilder {
    public Meal prepareVegMeal() {
        var meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        
        return meal;
    }

    public Meal prepareNonVegMeal() {
        var meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        
        return meal;
    }
}
