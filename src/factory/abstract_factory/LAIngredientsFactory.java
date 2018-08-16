package factory.abstract_factory;

import factory.abstract_factory.ingredients.*;

public class LAIngredientsFactory extends PizzaIngredientFactory {
    @Override
    public Ingredient createCheese() {
        return new ItalianCheese();
    }

    @Override
    public Ingredient createSauce() {
        return new IndianSauce();
    }
}
