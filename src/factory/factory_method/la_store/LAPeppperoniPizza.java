package factory.factory_method.la_store;

import factory.abstract_fabric.PizzaIngredientFactory;
import factory.factory_method.Pizza;

public class LAPeppperoniPizza extends Pizza {
    private PizzaIngredientFactory ingredientFactory;

    LAPeppperoniPizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    protected void prepare() {
        name = "LA Pepperoni Pizza";
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();

        System.out.println("---> Preparing " + name);
    }

    @Override
    protected void box() {
        super.box();
        System.out.println("Extra 10 USD for shipping");
    }
}
