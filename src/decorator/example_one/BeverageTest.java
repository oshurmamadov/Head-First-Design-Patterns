package decorator.example_one;

import decorator.example_one.beverages.EspressoCoffee;
import decorator.example_one.beverages.LatteCofee;
import decorator.example_one.decorators.Marmelad;
import decorator.example_one.decorators.Milk;
import decorator.example_one.decorators.Mocha;

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