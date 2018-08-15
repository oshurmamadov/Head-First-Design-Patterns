package factory.factory_method;

import factory.abstract_fabric.ingredients.Ingredient;

public abstract class Pizza {
    protected String name;
    protected Ingredient sauce;
    protected Ingredient cheese;

    protected abstract void prepare();

    protected void bake() {
        System.out.println("Baking for 30 mins");
    }

    protected void cut() {
        System.out.println("Cutting into 6 pieces");
    }

    protected void box() {
        System.out.println("Preparing to ship this damn pizzza");
    }
}
