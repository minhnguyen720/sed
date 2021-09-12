package fastFood.builder;

import fastFood.builder.burger.ChickenBurger;
import fastFood.builder.burger.VegBurger;
import fastFood.builder.cold_drink.Coke;
import fastFood.builder.cold_drink.Pepsi;

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
