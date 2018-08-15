package factory.abstract_fabric;

import factory.abstract_fabric.ingredients.Ingredient;

public abstract class PizzaIngredientFactory {
    public abstract Ingredient createCheese();
    public abstract Ingredient createSauce();
}
