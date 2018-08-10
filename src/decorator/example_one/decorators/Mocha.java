package decorator.example_one.decorators;

import decorator.example_one.Beverage;
import decorator.example_one.BeverageDecorator;

public class Mocha extends BeverageDecorator {
    private Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ",Milk";
    }

    @Override
    public double getCost() {
        return beverage.getCost() + 4;
    }
}
