package factory.factory_method.la_store;

import factory.factory_method.Pizza;
import factory.factory_method.PizzaStore;

public class LAPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String type) {
        if (type.equals("cheese"))
            return new LACheesePizza();
        else
            return new LAPeppperoniPizza();
    }
}
