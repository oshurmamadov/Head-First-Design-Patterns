package decorator.example_one.beverages;

import decorator.example_one.Beverage;

public class LatteCofee extends Beverage {

    public LatteCofee() {
        description = "Latte coffee";
    }

    @Override
    public double getCost() {
        return 44.5;
    }
}
