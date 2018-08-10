package decorator.decorators;

import decorator.Beverage;
import decorator.BeverageDecorator;

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
