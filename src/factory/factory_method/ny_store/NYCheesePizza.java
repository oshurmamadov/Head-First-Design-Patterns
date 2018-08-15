package factory.factory_method.ny_store;

import factory.abstract_fabric.PizzaIngredientFactory;
import factory.factory_method.Pizza;

class NYCheesePizza extends Pizza {
    private PizzaIngredientFactory ingredientFactory;
    NYCheesePizza(PizzaIngredientFactory ingredientFactory) {
        name = "NY SweetCheese Pizza";
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    protected void prepare() {
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createSauce();
    }
}
