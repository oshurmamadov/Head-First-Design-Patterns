package factory.factory_method.la_store;

import factory.factory_method.Pizza;

public class LAPeppperoniPizza extends Pizza {
    LAPeppperoniPizza() {
        name = "LA Pepperoni Pizza";
        sauce = "Hot and Spicy Sauce";
        cheese = "SweetCheese";
    }

    @Override
    protected void box() {
        super.box();
        System.out.println("Extra 10 USD for shipping");
    }
}
