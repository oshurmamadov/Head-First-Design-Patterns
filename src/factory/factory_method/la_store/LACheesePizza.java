package factory.factory_method.la_store;

import factory.abstract_fabric.PizzaIngredientFactory;
import factory.factory_method.Pizza;

public class LACheesePizza extends Pizza {
    private PizzaIngredientFactory ingredientFactory;

    LACheesePizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    protected void prepare() {
        name = "LA SweetCheese Pizza";
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();

        System.out.println("---> Preparing " + name + " adding " + sauce.name + "," + cheese.name);
    }

    @Override
    protected void cut() {
        System.out.println("Cutting into 5 slices");
    }
}
