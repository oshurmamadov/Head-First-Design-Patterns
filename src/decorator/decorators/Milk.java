package decorator.decorators;

import decorator.Beverage;
import decorator.BeverageDecorator;

public class Milk extends BeverageDecorator {
    private Beverage beverage;

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " ,Milk";
    }

    @Override
    public double getCost() {
        return beverage.getCost() + 4;
    }
}
