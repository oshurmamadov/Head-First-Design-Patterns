package factory.factory_method.ny_store;

import factory.factory_method.Pizza;
import factory.factory_method.PizzaStore;

public class NYPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String type) {
        if (type.equals("cheese"))
            return new NYCheesePizza();
        else
            return new NYPeppperoniPizza();
    }
}