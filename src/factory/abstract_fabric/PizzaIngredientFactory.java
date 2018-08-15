package factory.abstract_fabric;

import factory.abstract_fabric.ingredients.Ingredient;

public abstract class PizzaIngredientFactory {
    abstract Ingredient createCheese();
    abstract Ingredient createSauce();

}
