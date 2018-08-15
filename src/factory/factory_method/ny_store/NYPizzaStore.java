package factory.factory_method.ny_store;

import factory.abstract_fabric.NYIngredientsFactory;
import factory.abstract_fabric.PizzaIngredientFactory;
import factory.factory_method.Pizza;
import factory.factory_method.PizzaStore;

public class NYPizzaStore extends PizzaStore {
    private PizzaIngredientFactory ingredientFactory = new NYIngredientsFactory();

    @Override
    protected Pizza createPizza(String type) {
        if (type.equals("cheese"))
            return new NYCheesePizza(ingredientFactory);
        else
            return new NYPeppperoniPizza(ingredientFactory);
    }
}