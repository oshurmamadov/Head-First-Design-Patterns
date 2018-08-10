package decorator;

import decorator.beverages.EspressoCoffee;
import decorator.beverages.LatteCofee;
import decorator.decorators.Marmelad;
import decorator.decorators.Milk;
import decorator.decorators.Mocha;

public class BeverageTest {

    public static void main(String[] args) {
        Beverage espressoCoffee = new EspressoCoffee();

        espressoCoffee = new Marmelad(espressoCoffee);
        espressoCoffee = new Mocha(espressoCoffee);

        System.out.println(espressoCoffee.getDescription() + " price:" + espressoCoffee.getCost());

        Beverage latteCoffee = new LatteCofee();
        latteCoffee = new Milk(latteCoffee);

        System.out.println(latteCoffee.getDescription() + " price:" + latteCoffee.getCost());
    }
}