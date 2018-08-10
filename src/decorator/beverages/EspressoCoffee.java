package decorator.beverages;

import decorator.Beverage;

public class EspressoCoffee extends Beverage {

    public EspressoCoffee() {
        description = "Espresso coffee";
    }

    @Override
    public double getCost() {
        return 55.5;
    }
}
