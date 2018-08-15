package factory.abstract_fabric;

import factory.abstract_fabric.ingredients.*;

public class LAIngredientsFactory extends PizzaIngredientFactory {
    @Override
    Ingredient createCheese() {
        return new ItalianCheese();
    }

    @Override
    Ingredient createSauce() {
        return new IndianSauce();
    }
}
