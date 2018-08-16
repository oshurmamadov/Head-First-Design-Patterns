package factory.factory_method.ny_store;

import factory.abstract_fabric.PizzaIngredientFactory;
import factory.factory_method.Pizza;

class NYPeppperoniPizza extends Pizza {
    private PizzaIngredientFactory ingredientFactory;

    NYPeppperoniPizza(PizzaIngredientFactory ingredientFactory) {
        name = "NY Pepperoni Pizza";
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    protected void prepare() {
        name = "NY Pepperoni Pizza";
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();

        System.out.println("---> Preparing " + name);
    }
}
