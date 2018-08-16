package factory.factory_method.ny_store;

import factory.abstract_fabric.PizzaIngredientFactory;
import factory.factory_method.Pizza;

class NYCheesePizza extends Pizza {
    private PizzaIngredientFactory ingredientFactory;
    NYCheesePizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    protected void prepare() {
        name = "NY SweetCheese Pizza";
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();

        System.out.println("---> Preparing " + name);
    }
}
