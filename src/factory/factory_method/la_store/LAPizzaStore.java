package factory.factory_method.la_store;

import factory.abstract_fabric.NYIngredientsFactory;
import factory.abstract_fabric.PizzaIngredientFactory;
import factory.factory_method.Pizza;
import factory.factory_method.PizzaStore;

public class LAPizzaStore extends PizzaStore {
    private PizzaIngredientFactory ingredientFactory = new NYIngredientsFactory();

    @Override
    protected Pizza createPizza(String type) {
        if (type.equals("cheese"))
            return new LACheesePizza(ingredientFactory);
        else
            return new LAPeppperoniPizza(ingredientFactory);
    }
}
