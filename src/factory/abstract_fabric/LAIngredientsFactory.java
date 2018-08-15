package factory.abstract_fabric;

import factory.abstract_fabric.ingredients.*;

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
