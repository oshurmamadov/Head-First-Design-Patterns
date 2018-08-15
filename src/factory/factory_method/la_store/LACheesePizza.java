package factory.factory_method.la_store;

import factory.factory_method.Pizza;

public class LACheesePizza extends Pizza {
    LACheesePizza() {
        name = "LA Cheese Pizza";
        sauce = "Super Sweet Sauce";
        cheese = "Cheese";
    }

    @Override
    protected void cut() {
        System.out.println("Cutting into 5 slices");
    }
}
