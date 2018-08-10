package decorator.beverages;

import decorator.Beverage;

public class LatteCofee extends Beverage {

    public LatteCofee() {
        description = "Latte coffee";
    }

    @Override
    public double getCost() {
        return 44.5;
    }
}
