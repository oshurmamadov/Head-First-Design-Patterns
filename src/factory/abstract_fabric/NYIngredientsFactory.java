package factory.abstract_fabric;

import factory.abstract_fabric.ingredients.Ingredient;
import factory.abstract_fabric.ingredients.SpicySauce;
import factory.abstract_fabric.ingredients.SweetCheese;

public class NYIngredientsFactory extends PizzaIngredientFactory {
    @Override
    Ingredient createCheese() {
        return new SweetCheese();
    }

    @Override
    Ingredient createSauce() {
        return new SpicySauce();
    }
}