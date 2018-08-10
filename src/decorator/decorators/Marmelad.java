package decorator.decorators;

import decorator.Beverage;
import decorator.BeverageDecorator;

public class Marmelad extends BeverageDecorator {
    private Beverage beverage;

    public Marmelad(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " ,Marmelad";
    }

    @Override
    public double getCost() {
        return beverage.getCost() + 20;
    }
}
