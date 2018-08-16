package factory.abstract_factory;

import factory.abstract_factory.ingredients.Ingredient;

public abstract class PizzaIngredientFactory {
    public abstract Ingredient createCheese();
    public abstract Ingredient createSauce();
}
