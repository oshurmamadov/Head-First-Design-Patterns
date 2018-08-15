package factory.factory_method.la_store;

import factory.abstract_fabric.PizzaIngredientFactory;
import factory.factory_method.Pizza;

public class LACheesePizza extends Pizza {
    private PizzaIngredientFactory ingredientFactory;

    LACheesePizza(PizzaIngredientFactory ingredientFactory) {
        name = "LA SweetCheese Pizza";
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    protected void prepare() {
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createSauce();
    }

    @Override
    protected void cut() {
        System.out.println("Cutting into 5 slices");
    }
}
