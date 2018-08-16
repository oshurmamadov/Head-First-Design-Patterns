package factory.abstract_factory;

import factory.abstract_factory.ingredients.Ingredient;
import factory.abstract_factory.ingredients.SpicySauce;
import factory.abstract_factory.ingredients.SweetCheese;

public class NYIngredientsFactory extends PizzaIngredientFactory {
    @Override
    public Ingredient createCheese() {
        return new SweetCheese();
    }

    @Override
    public Ingredient createSauce() {
        return new SpicySauce();
    }
}
