package fastFood;

import fastFood.builder.Meal;
import fastFood.builder.MealBuilder;

public class Launcher {
    public static void main(String[] args) {
        var builder = new MealBuilder();

        Meal vegMeal = builder.prepareVegMeal();
        System.out.println("VEG MEAL");
        vegMeal.showItems();
        System.out.println("TOTAL COST: " + vegMeal.getCost());

        Meal nonVegMeal = builder.prepareNonVegMeal();
        System.out.println("NON VEG MEAL");
        nonVegMeal.showItems();
        System.out.println("TOTAL COST: " + nonVegMeal.getCost());
    }
}
