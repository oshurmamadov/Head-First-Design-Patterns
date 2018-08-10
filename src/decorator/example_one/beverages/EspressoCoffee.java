package decorator.example_one.beverages;

import decorator.example_one.Beverage;

public class EspressoCoffee extends Beverage {

    public EspressoCoffee() {
        description = "Espresso coffee";
    }

    @Override
    public double getCost() {
        return 55.5;
    }
}
